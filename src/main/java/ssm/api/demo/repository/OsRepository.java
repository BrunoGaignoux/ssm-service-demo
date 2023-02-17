package ssm.api.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import ssm.api.demo.domain.Os;

public interface OsRepository extends PagingAndSortingRepository<Os, Long>, CrudRepository<Os, Long> {
    @Query(value = "SELECT os.*, l.data_vencimento AS vencimento, u.nome AS nomeUsuario, u.telefone AS telefoneUsuario, u.email AS emailUsuario, c.nomeCliente, c.telefone AS telefoneCliente, c.email AS emailCliente, c.rua AS ruaCliente, c.numero AS numeroCliente, c.bairro AS bairroCliente, c.cidade AS cidadeCliente, c.estado AS estadoCliente, g.*, a.*, oc.* FROM os INNER JOIN clientes c ON os.clientes_id = c.idClientes INNER JOIN usuarios u ON os.usuarios_id = u.idUsuarios LEFT JOIN garantias g ON os.garantias_id = g.idGarantias LEFT JOIN anexos a ON os.idOs = a.os_id LEFT JOIN ordem_compra oc ON oc.os_id = os.idOs LEFT JOIN lancamentos l ON os.lancamento = l.idLancamentos LEFT JOIN os_impostos oi ON os.idOs = oi.os_id LEFT JOIN produtos_os po ON os.idOs = po.os_id LEFT JOIN servicos_os so ON os.idOs = so.os_id WHERE os.ativo = 1 ORDER BY os.status", nativeQuery = true)
    Iterable<Os> findAll();
}
