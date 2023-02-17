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
@Table(name = "produtos_os")
public class OsProduct {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idProdutos_os;
    private String quantidade;
    private String descricao;
    private String preco;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "os_id", referencedColumnName = "idOs")
    private Os os;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "produtos_id", referencedColumnName = "idProdutos")
    private Product product;
    private String subTotal;
}
