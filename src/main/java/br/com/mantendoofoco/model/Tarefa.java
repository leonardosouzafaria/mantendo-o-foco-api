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
	
	private String descricao;
	
	private int tempoPomodoro;
	
	private int tempoPausaMenor;
	
	private int tempoPausaMaior;
	
	private int quantidadePomodoro;

	private boolean status;
	
	public Tarefa ( String descricao, int tempoPomodoro, int tempoPausaMenor, int tempoPausaMaior, int quantidadePomodoro, boolean status) {
		
		this.setDescricao(descricao);
		this.setTempoPomodoro(tempoPomodoro);
		this.setTempoPausaMenor(tempoPausaMenor);
		this.setTempoPausaMaior(tempoPausaMaior);
		this.setQuantidadePomodoro(quantidadePomodoro);
		this.setStatus(status);
	}
	
	public Tarefa() {};

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

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
}
