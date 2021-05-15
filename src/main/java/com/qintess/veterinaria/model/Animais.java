package com.qintess.veterinaria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Animais {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nome;

	private int idade;

	private String especies;

	private String raca;

	public Animais() {

	}

	public Animais(int id, String nome, int idade, String especies, String raca) {

		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.especies = especies;
		this.raca = raca;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getEspecies() {
		return especies;
	}


	public void setEspecies(String especies) {
		this.especies = especies;
	}


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}


	@Override
	public String toString() {
		return "Animais [id=" + id + ", nome=" + nome + ", idade=" + idade + ", especies=" + especies + ", raca=" + raca
				+ "]";
	}





}