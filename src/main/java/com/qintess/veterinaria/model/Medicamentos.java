package com.qintess.veterinaria.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Medicamentos {
	
	private String nome;
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String descricao;
	
	@ManyToOne(fetch = FetchType.LAZY)//ok
	private Tratamentos tratamento;

	
	public Medicamentos() {

	}


	public Medicamentos(String nome, int id, String descricao, Tratamentos tratamento) {

		this.nome = nome;
		this.id = id;
		this.descricao = descricao;
		this.tratamento = tratamento;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Tratamentos getTratamento() {
		return tratamento;
	}


	public void setTratamento(Tratamentos tratamento) {
		this.tratamento = tratamento;
	}


	@Override
	public String toString() {
		return "Medicamentos [nome=" + nome + ", id=" + id + ", descricao=" + descricao + ", tratamento=" + tratamento
				+ "]";
	}


	
}
