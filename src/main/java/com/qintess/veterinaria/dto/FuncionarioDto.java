package com.qintess.veterinaria.dto;

public class FuncionarioDto {
	
	private String id;
	private String nome;
	private String endereco;
	private String telefone;
	private String especializacoes;
	private String atendimento;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public String getEspecializacoes() {
		return especializacoes;
	}
	public void setEspecializacoes(String especializacoes) {
		this.especializacoes = especializacoes;
	}
	public String getAtendimento() {
		return atendimento;
	}
	public void setAtendimento(String atendimento) {
		this.atendimento = atendimento;
	}

	
}
