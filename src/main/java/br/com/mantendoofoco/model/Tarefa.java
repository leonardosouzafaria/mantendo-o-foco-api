package br.com.mantendoofoco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tarefa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	String descricao;
	
	int tempoPomodoro;
	
	int tempoPausaMenor;
	
	int tempoPausaMaior;
	
	int quantidadePomodoro;

	boolean status;
	
	public Tarefa (long id, String descricao, int tempoPomodoro, int tempoPausaMenor, int tempoPausaMaior, int quantidadePomodoro, boolean status) {
		this.setId(id);
		this.setDescricao(descricao);
		this.setTempoPomodoro(tempoPomodoro);
		this.setTempoPausaMenor(tempoPausaMenor);
		this.setTempoPausaMaior(tempoPausaMaior);
		this.setQuantidadePomodoro(quantidadePomodoro);
		this.setStatus(status);
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getTempoPomodoro() {
		return tempoPomodoro;
	}

	public void setTempoPomodoro(int tempoPomodoro) {
		this.tempoPomodoro = tempoPomodoro;
	}

	public int getTempoPausaMenor() {
		return tempoPausaMenor;
	}

	public void setTempoPausaMenor(int tempoPausaMenor) {
		this.tempoPausaMenor = tempoPausaMenor;
	}

	public int getTempoPausaMaior() {
		return tempoPausaMaior;
	}

	public void setTempoPausaMaior(int tempoPausaMaior) {
		this.tempoPausaMaior = tempoPausaMaior;
	}

	public int getQuantidadePomodoro() {
		return quantidadePomodoro;
	}

	public void setQuantidadePomodoro(int quantidadePomodoro) {
		this.quantidadePomodoro = quantidadePomodoro;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
}