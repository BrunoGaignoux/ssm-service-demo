package ssm.api.demo.domain;

import java.sql.Blob;

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
@Table(name = "relatorios_itens")
public class ReportItem {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idItem;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "relatorioId", referencedColumnName = "idRelatorio")
    private Report report;
    private String titulo;
    private Blob descricao;
}
