package br.com.mantendoofoco.resource;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.mantendoofoco.model.Tarefa;
import br.com.mantendoofoco.repository.TarefaRepository;

@RestController
@RequestMapping("/tarefas")
public class TarefaResource {
	
	@Autowired
	private TarefaRepository tarefaRepository;
	
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Tarefa> getListaTarefas () {
		Iterable<Tarefa> listaTarefa = tarefaRepository.findAll();
		return listaTarefa;
	}
	
	@PostMapping()
	public Tarefa cadastraTarefa(@RequestBody @Valid Tarefa tarefa) {
		return tarefaRepository.save(tarefa);
	}
	
	@DeleteMapping()
	public Tarefa deletaTarefa(@RequestBody Tarefa tarefa) {
		tarefaRepository.delete(tarefa);
		return tarefa;
	}
	
	
	
}
