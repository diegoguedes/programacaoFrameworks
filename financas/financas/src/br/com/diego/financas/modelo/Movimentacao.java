package br.com.diego.financas.modelo;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;

@Entity
@SequenceGenerator(name = "SEQ_MOV", sequenceName = "SEQ_MOV", initialValue = 1)
public class Movimentacao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_MOV")
	private Integer id;
	private BigDecimal valor;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataMovimentacao;
	@Enumerated(EnumType.STRING)
	private TipoTransacao tipo;

	private String descricao;
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Conta conta;

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Date getDataMovimentacao() {
		return dataMovimentacao;
	}

	public void setDataMovimentacao(Date dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}

	public TipoTransacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoTransacao tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

}
