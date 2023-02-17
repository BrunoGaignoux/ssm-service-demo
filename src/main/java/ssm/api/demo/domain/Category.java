package ssm.api.demo.domain;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "categorias")
public class Category {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idCategorias;
    private String categoria;
    private Date cadastro;
    private Boolean status;
    private String tipo;
}
