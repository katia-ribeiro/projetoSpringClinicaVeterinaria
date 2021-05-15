package com.qintess.veterinaria.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Consultas {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "consulta" )
	private List<Exames> exame = new ArrayList <Exames>();//ok

	private String diagnostico;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "consulta" )
	private List<Tratamentos> tratamento = new ArrayList <Tratamentos>();//ok

	private double valores;


	@OneToOne(fetch = FetchType.LAZY)//ok
	private Atendimento atendimentos;


	public Consultas() {

	}


	public Consultas(int id, List<Exames> exame, String diagnostico, List<Tratamentos> tratamento, double valores,
			Atendimento atendimentos) {

		this.id = id;
		this.exame = exame;
		this.diagnostico = diagnostico;
		this.tratamento = tratamento;
		this.valores = valores;
		this.atendimentos = atendimentos;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public List<Exames> getExame() {
		return exame;
	}


	public void setExame(List<Exames> exame) {
		this.exame = exame;
	}


	public String getDiagnostico() {
		return diagnostico;
	}


	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}


	public List<Tratamentos> getTratamento() {
		return tratamento;
	}


	public void setTratamento(List<Tratamentos> tratamento) {
		this.tratamento = tratamento;
	}


	public double getValores() {
		return valores;
	}


	public void setValores(double valores) {
		this.valores = valores;
	}


	public Atendimento getAtendimentos() {
		return atendimentos;
	}


	public void setAtendimentos(Atendimento atendimentos) {
		this.atendimentos = atendimentos;
	}


	@Override
	public String toString() {
		return "Consultas [id=" + id + ", exame=" + exame + ", diagnostico=" + diagnostico + ", tratamento="
				+ tratamento + ", valores=" + valores + ", atendimentos=" + atendimentos + "]";
	}







}
