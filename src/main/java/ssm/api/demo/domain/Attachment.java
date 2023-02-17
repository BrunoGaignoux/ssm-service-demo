package ssm.api.demo.domain;

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
@Table(name = "anexos")
public class Attachment {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idAnexos;
    private String anexo;
    private String thumb;
    private String url;
    private String path;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "os_id", referencedColumnName = "idOs")
    private Os os;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "ordem_compra_id", referencedColumnName = "idOc")
    private PurchaseOrder purchaseOrder;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "relatorios_item_id", referencedColumnName = "idItem")
    private ReportItem reportItem;
}
