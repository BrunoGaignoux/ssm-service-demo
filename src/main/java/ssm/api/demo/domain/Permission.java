package ssm.api.demo.domain;

import java.sql.Blob;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "permissoes")
public class Permission {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idPermissao;
    private String nome;
    private String slug;
    private Blob permissoes;
    private Boolean situacao;
    private Date data;
}
