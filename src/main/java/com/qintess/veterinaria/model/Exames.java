package com.qintess.veterinaria.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Exames {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nome;
	private String descricao;
	
	@ManyToOne
	private Consultas consulta;//ok
	
	

	public Exames() {

	}



	public Exames(int codigo, String nome, String descricao, Consultas consulta) {

		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.consulta = consulta;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public Consultas getConsulta() {
		return consulta;
	}



	public void setConsulta(Consultas consulta) {
		this.consulta = consulta;
	}



	@Override
	public String toString() {
		return "Exames [codigo=" + codigo + ", nome=" + nome + ", descricao=" + descricao + ", consulta=" + consulta
				+ "]";
	}
	
}