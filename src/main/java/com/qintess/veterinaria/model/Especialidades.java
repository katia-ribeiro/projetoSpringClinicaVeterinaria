package com.qintess.veterinaria.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Especialidades {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nome;
	private String crv;
	private String descricao;

	@ManyToOne(fetch = FetchType.LAZY )
	private Funcionarios funcionario;
	

	public Especialidades() {

	}


	public Especialidades(int id, String nome, String crv, String descricao, Funcionarios funcionario) {

		this.id = id;
		this.nome = nome;
		this.crv = crv;
		this.descricao = descricao;
		this.funcionario = funcionario;
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


	public String getCrv() {
		return crv;
	}


	public void setCrv(String crv) {
		this.crv = crv;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Funcionarios getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(Funcionarios funcionario) {
		this.funcionario = funcionario;
	}


	@Override
	public String toString() {
		return "Especialidades [id=" + id + ", nome=" + nome + ", crv=" + crv + ", descricao=" + descricao
				+ ", funcionario=" + funcionario + "]";
	}

}