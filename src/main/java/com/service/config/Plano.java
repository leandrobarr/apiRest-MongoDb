package com.service.config;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

public class Plano<TipoPlano> {

	@Id
	private String id;
	private String nome;
	private String descricao;
	private String vantagens;
	private BigDecimal valor;
	private TipoPlano tipo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getVantagens() {
		return vantagens;
	}

	public void setVantagens(String vantagens) {
		this.vantagens = vantagens;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public TipoPlano getTipo() {
		return tipo;
	}

	public void setTipo(TipoPlano tipo) {
		this.tipo = tipo;
	}

}
