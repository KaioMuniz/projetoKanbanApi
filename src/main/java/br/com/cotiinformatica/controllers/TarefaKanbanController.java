package br.com.cotiinformatica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.repositories.TarefaKanbanRepository;

@RestController("/api/v1/tarefas-kanban")
class TarefaKanbanController {
	
	
	@Autowired TarefaKanbanRepository tarefaKanbanRepository;
	
	@GetMapping
	void get() {
		
		// Lógica para listar tarefas
	}

	@PutMapping
	void put() {
		// Lógica para atualizar uma tarefa
	}
	
	@PostMapping
	void post() {
		// Lógica para criar uma tarefa
		
	
	}

	@DeleteMapping
	void delete() {
		// Lógica para excluir uma tarefa
	}
	

}
