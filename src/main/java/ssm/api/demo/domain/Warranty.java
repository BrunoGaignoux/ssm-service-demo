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
@Table(name = "garantias")
public class Warranty{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idGarantias;
    private Date dataGarantia;
    private String refGarantia;
    private Blob textoGarantia;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "usuarios_id", referencedColumnName = "idUsuarios")
    private User usuarios_id;
    
}
