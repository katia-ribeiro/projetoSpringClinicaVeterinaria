package com.qintess.veterinaria.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Funcionarios {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String endereco;
	private String telefone;

	@OneToMany(mappedBy = "funcionario")//ok
	private List<Especialidades> especializacoes;

	@ManyToOne(fetch = FetchType.LAZY)
	private Atendimento atendimento;//ok

	public Funcionarios() {
		
	}

	public Funcionarios(int id, String nome, String endereco, String telefone, List<Especialidades> especializacoes,
			Atendimento atendimento) {
		
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.especializacoes = especializacoes;
		this.atendimento = atendimento;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Especialidades> getEspecializacoes() {
		return especializacoes;
	}

	public void setEspecializacoes(List<Especialidades> especializacoes) {
		this.especializacoes = especializacoes;
	}

	public Atendimento getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}

	@Override
	public String toString() {
		return "Funcionarios [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone
				+ ", especializacoes=" + especializacoes + ", atendimento=" + atendimento + "]";
	}
	
}