package br.com.cotiinformatica.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class TarefaKanbanRequestDto {

    @NotBlank(message = "O título da tarefa é obrigatório.")
    @Size(min = 8, max = 50, message = "O título deve ter entre 8 e 50 caracteres.")
    private String titulo;

    @NotBlank(message = "A descrição da tarefa é obrigatória.")
    @Size(min = 8, max = 150, message = "A descrição deve ter entre 8 e 150 caracteres.")
    private String descricao;

    @NotBlank(message = "O responsável pela tarefa é obrigatório.")
    @Size(min = 8, max = 25, message = "O responsável deve ter entre 8 e 25 caracteres.")
    private String responsavel;

    @NotBlank(message = "A data prevista para entrega da tarefa é obrigatória.")
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "A data deve estar no formato YYYY-MM-DD.")
    private String dataPrevistaEntrega;

    @NotNull(message = "O status de iniciado da tarefa é obrigatório.")
    private Boolean iniciado;

    @NotNull(message = "O status de finalizado da tarefa é obrigatório.")
    private Boolean finalizado;

    public TarefaKanbanRequestDto() {
        super();
    }

    public TarefaKanbanRequestDto(String titulo, String descricao, String responsavel, String dataPrevistaEntrega,
                                 Boolean iniciado, Boolean finalizado) {
        super();
        this.titulo = titulo;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.dataPrevistaEntrega = dataPrevistaEntrega;
        this.iniciado = iniciado;
        this.finalizado = finalizado;
    }

    // Getters e setters

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

    public String getDataPrevistaEntrega() {
        return dataPrevistaEntrega;
    }

    public void setDataPrevistaEntrega(String dataPrevistaEntrega) {
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
