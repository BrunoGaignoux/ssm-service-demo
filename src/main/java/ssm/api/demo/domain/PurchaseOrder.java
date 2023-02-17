package ssm.api.demo.domain;

import java.sql.Blob;
import java.util.Date;

import jakarta.persistence.Column;
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
@Table(name = "ordem_compra")
public class PurchaseOrder {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "idOc", nullable = false)
    private Long id;
    private Blob descricao;
    private Blob observacoes;
    private Date dataOrdem;
    private Long valorTotal;
    private Long desconto;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "os_id", referencedColumnName = "idOs")
    private Os os;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "fornecedor_id", referencedColumnName = "idFornecedor")
    private Supplier supplier;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "usuario_responsavel_id", referencedColumnName = "idUsuarios")
    private User user;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "lancamento_id", referencedColumnName = "idLancamentos")
    private Billing billing;
    private Date dataCriacao;
}
