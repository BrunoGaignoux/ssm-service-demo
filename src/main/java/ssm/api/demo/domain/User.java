package ssm.api.demo.domain;

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
@Table(name = "usuarios")
public class User {
    @Id
    @Column(name = "idUsuarios", nullable = false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nome_app;
    private String nome;
    private String rg;
    private String cpf;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String email;
    private String senha;
    private String telefone;
    private String celular;
    private Boolean situacao;
    private Date dataCadastro;
    private Date dataExpiracao;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "permissoes_id", referencedColumnName = "idPermissoes")
    private Permission permission;
}
