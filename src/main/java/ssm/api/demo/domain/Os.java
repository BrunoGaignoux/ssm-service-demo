package ssm.api.demo.domain;

import java.sql.Blob;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;
import ssm.api.demo.enums.OsStatus;
import ssm.api.demo.enums.Status;

@Entity
@Data
@Table(name = "os")
public class Os {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "idOs", nullable = false)
    private Long id;
    @Column(name = "dataInicial", nullable = false)
    private Date initialDate;
    @Column(name = "dataFinal", nullable = false)
    private Date finalDate;
    @Column(name = "garantia", nullable = true)
    private String guarantee;
    @Column(name = "descricaoProduto", nullable = false)
    private Blob description;
    @Column(name = "defeito", nullable = false)
    private Blob defect;
    @Enumerated(EnumType.STRING)
    private OsStatus status;
    @Column(name = "observacoes", nullable = false)
    private Blob comments;
    @Column(name = "laudoTecnico", nullable = false)
    private Blob technicalReport;
    @Column(name = "valorTotal", nullable = false)
    private String totalValue;
    @OneToOne()
    @PrimaryKeyJoinColumn(name = "clientes_id", referencedColumnName = "idClientes")
    private Client client;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "usuarios_id", referencedColumnName = "idUsuarios")
    private User user;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "lancamento", referencedColumnName = "idLancamentos")
    private Billing billing;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "garantias_id", referencedColumnName = "idGarantias")
    private Warranty warranty;
    @Column(name = "faturado", nullable = false)
    private Boolean invoiced;
    @Column(name = "Data_Criacao", nullable = true)
    private Date createdDate;
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "ativo", nullable = false)
    private Status active;
}
