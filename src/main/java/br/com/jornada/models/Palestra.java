package br.com.jornada.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Palestra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String titulo;
	private String descricao;
	private Usuario palestrante;
	private Evento eventoDeOrigem;
	
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
	
	public Usuario getPalestrante() {
		return palestrante;
	}
	public void setPalestrante(Usuario palestrante) {
		this.palestrante = palestrante;
	}
	
	public Evento getEventoDeOrigem() {
		return eventoDeOrigem;
	}
	public void setEventoDeOrigem(Evento eventoDeOrigem) {
		this.eventoDeOrigem = eventoDeOrigem;
	}
	
}
