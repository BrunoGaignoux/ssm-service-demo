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
@Table(name = "servicos_os")
public class OsService {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idServicos_os;
    private String servico; 
    private Double quantidade;
    private String preco;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "os_id", referencedColumnName = "idOs")
    private Os os;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "servicos_id", referencedColumnName = "idServicos")
    private Service service;
    private String subTotal;
}
