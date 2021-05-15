package com.qintess.veterinaria.dto;

public class TratamentosDto {
	
	private String id;
	private String nomeTratamnto;
	private String horaAplicacao;
	private String quantidade;
	private String consulta;
	private String Medicamentos;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNomeTratamnto() {
		return nomeTratamnto;
	}
	public void setNomeTratamnto(String nomeTratamnto) {
		this.nomeTratamnto = nomeTratamnto;
	}
	public String getHoraAplicacao() {
		return horaAplicacao;
	}
	public void setHoraAplicacao(String horaAplicacao) {
		this.horaAplicacao = horaAplicacao;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public String getConsulta() {
		return consulta;
	}
	public void setConsulta(String consulta) {
		this.consulta = consulta;
	}
	public String getMedicamentos() {
		return Medicamentos;
	}
	public void setMedicamentos(String medicamentos) {
		Medicamentos = medicamentos;
	}
	

}
