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
@Table(name = "lancamentos")
public class Billing {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "idLancamentos", nullable = false)
    private Long id;
    private String descricao;
    private String valor;
    private String nota_fiscal;
    private Date data_vencimento;
    private Date data_pagamento;
    private Boolean baixado;
    private String cliente_fornecedor;
    private String forma_pgto;
    private String tipo;
    private String anexo;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "cliente_id", referencedColumnName = "idClientes")
    private Client client;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "fornecedor_id", referencedColumnName = "idFornecedor")
    private Supplier supplier;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "categorias_id", referencedColumnName = "idCategorias")
    private Category category;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "contas_id", referencedColumnName = "idContas")
    private Account account;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "vendas_id", referencedColumnName = "idVendas")
    private Sale sale;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "os_id", referencedColumnName = "idOs")
    private Os os;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "classificacao_id", referencedColumnName = "idClassificacao")
    private Classification classification;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "ordem_compra_id", referencedColumnName = "idOc")
    private PurchaseOrder purchaseOrder;
    private Date data_criacao;
}
