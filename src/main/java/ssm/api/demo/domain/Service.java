package ssm.api.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "servicos")
public class Service {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idServicos;
    private String nome;
    private String descricao;
    private String preco;
}
