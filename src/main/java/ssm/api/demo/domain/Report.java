package ssm.api.demo.domain;

import java.sql.Blob;
import java.util.Date;

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
@Table(name = "relatorios")
public class Report {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idRelatorio;
    private Blob descricao;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "idResponsavel", referencedColumnName = "idUsuarios")
    private User user;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "idOs", referencedColumnName = "idOs")
    private Os os;
    private Date dataCriacao;
    private Date dataAtualizac;
    private Boolean finished;
}
