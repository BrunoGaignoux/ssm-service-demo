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
@Table(name = "clientes")
public class Client{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idClientes;
    private String nomeCliente;
    private String sexo;
    private Boolean pessoa_fisica;
    private String documento;
    private String telefone;
    private String celular;
    private String email;
    private Date dataCadastro;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
}
