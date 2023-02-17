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
@Table(name = "contas")
public class Account {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idContas;
    private String conta;
    private String banco;
    private String numero;
    private Double saldo;
    private Date cadastro;
    private Boolean status;
    private String tipo;
}
