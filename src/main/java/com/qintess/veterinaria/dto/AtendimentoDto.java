package com.qintess.veterinaria.dto;

public class AtendimentoDto {

	private String id;
	private String consulta;
	private String tipo;
	private String diaHora;
	private String Funcionarios;
	private String cliente;
	private String animal;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getConsulta() {
		return consulta;
	}
	public void setConsulta(String consulta) {
		this.consulta = consulta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDiaHora() {
		return diaHora;
	}
	public void setDiaHora(String diaHora) {
		this.diaHora = diaHora;
	}
	public String getFuncionarios() {
		return Funcionarios;
	}
	public void setFuncionarios(String funcionarios) {
		Funcionarios = funcionarios;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}

}
