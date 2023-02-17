package ssm.api.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "produtos")
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idProdutos;
    private String descricao;
    private String unidade;
    private Double precoCompra;
    private Double precoVenda;
    private Integer estoque;
    private Integer estoqueMinimo;
    private Boolean saida;
    private Boolean entrada;
}
