package ssm.api.demo.domain;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "vendas")
public class Sale {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idVendas;
    private Date dataVenda;
    private String valorTotal;
    private String desconto;
    private Boolean faturado;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "clientes_id", referencedColumnName = "idClientes")
    private Client client;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "usuarios_id", referencedColumnName = "idUsuarios")
    private User user;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "lancamentos_id", referencedColumnName = "idLancamentos")
    private Billing billing;
}
