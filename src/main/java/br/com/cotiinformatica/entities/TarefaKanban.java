package br.com.cotiinformatica.entities;

import java.util.Date;
import java.util.UUID;

public class TarefaKanban {

	private UUID id;
	private String titulo;
	private String descricao;
	private String responsavel;
	private Date dataCriacao;
	private Date dataPrevistaEntrega;
	private Boolean iniciado;
	private Boolean finalizado;
	
	
	public TarefaKanban() {
		super();
	}
	
	public TarefaKanban(UUID id, String titulo, String descricao, String responsavel, Date dataCriacao,
			Date dataPrevistaEntrega, Boolean iniciado, Boolean finalizado) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.responsavel = responsavel;
		this.dataCriacao = dataCriacao;
		this.dataPrevistaEntrega = dataPrevistaEntrega;
		this.iniciado = iniciado;
		this.finalizado = finalizado;
		
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public Date getDataPrevistaEntrega() {
		return dataPrevistaEntrega;
	}
	public void setDataPrevistaEntrega(Date dataPrevistaEntrega) {
		this.dataPrevistaEntrega = dataPrevistaEntrega;
	}
	public Boolean getIniciado() {
		return iniciado;
	}
	public void setIniciado(Boolean iniciado) {
		this.iniciado = iniciado;
	}
	public Boolean getFinalizado() {
		return finalizado;
	}
	public void setFinalizado(Boolean finalizado) {
		this.finalizado = finalizado;
	}

	
}
