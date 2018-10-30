package br.com.mantendoofoco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mantendoofoco.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, String> {

}
