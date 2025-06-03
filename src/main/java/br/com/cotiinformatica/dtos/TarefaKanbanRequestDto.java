package br.com.cotiinformatica.dtos;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class TarefaKanbanRequestDto {

	@NotBlank(message = "O título da tarefa é obrigatório.")
	@Size(max = 100, message = "O título da tarefa deve ter no máximo 100 caracteres.")
	private String titulo;
	
	@NotBlank(message = "A descrição da tarefa é obrigatória.")
	private String descricao;
	
	@NotBlank(message = "O responsável pela tarefa é obrigatório.")
	@Size(max = 100, message = "O responsável pela tarefa deve ter no máximo 100 caracteres.")
	private String responsavel;
	
	@NotNull(message = "A data prevista para entrega da tarefa é obrigatória.")
	@Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "A data prevista para entrega deve estar no formato YYYY-MM-DD.")
	private Date dataPrevistaEntrega;
	
	@NotNull(message = "O status de iniciado da tarefa é obrigatório.")
	private Boolean iniciado;
	
	@NotNull(message = "O status de finalizado da tarefa é obrigatório.")
	private Boolean finalizado;
	
	
	public TarefaKanbanRequestDto() {
        super();
    }
	
	

	public TarefaKanbanRequestDto(String titulo, String descricao, String responsavel, Date dataPrevistaEntrega,
			Boolean iniciado, Boolean finalizado) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.responsavel = responsavel;
		this.dataPrevistaEntrega = dataPrevistaEntrega;
		this.iniciado = iniciado;
		this.finalizado = finalizado;
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
	