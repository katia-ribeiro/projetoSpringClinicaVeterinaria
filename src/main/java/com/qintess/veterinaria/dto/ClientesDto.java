package com.qintess.veterinaria.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.qintess.veterinaria.model.Clientes;

public class ClientesDto {

	private String id;
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;

	public ClientesDto(Clientes d) {
	}
	public ClientesDto() {

	}
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Clientes conveter() {
		// Não esquecer de incluir metodo 
		return null;
	}

}
