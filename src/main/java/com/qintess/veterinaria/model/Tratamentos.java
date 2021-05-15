package com.qintess.veterinaria.model;

import java.time.LocalTime;
import java.util.ArrayList;
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
public class Tratamentos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nomeTratamnto;
	private LocalTime horaAplicacao;
	private int quantidade;

	@ManyToOne(fetch = FetchType.LAZY)
	private Consultas consulta;//ok
	
	@OneToMany(mappedBy = "tratamento")
	private List<Medicamentos> medicamento = new ArrayList <Medicamentos>();//ok
	

	public Tratamentos() {

	}

	public Tratamentos(int id, String nomeTratamnto, LocalTime horaAplicacao, int quantidade, Consultas consulta,
			List<Medicamentos> medicamento) {

		this.id = id;
		this.nomeTratamnto = nomeTratamnto;
		this.horaAplicacao = horaAplicacao;
		this.quantidade = quantidade;
		this.consulta = consulta;
		this.medicamento = medicamento;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNomeTratamnto() {
		return nomeTratamnto;
	}


	public void setNomeTratamnto(String nomeTratamnto) {
		this.nomeTratamnto = nomeTratamnto;
	}


	public LocalTime getHoraAplicacao() {
		return horaAplicacao;
	}


	public void setHoraAplicacao(LocalTime horaAplicacao) {
		this.horaAplicacao = horaAplicacao;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public Consultas getConsulta() {
		return consulta;
	}


	public void setConsulta(Consultas consulta) {
		this.consulta = consulta;
	}


	public List<Medicamentos> getMedicamento() {
		return medicamento;
	}


	public void setMedicamento(List<Medicamentos> medicamento) {
		this.medicamento = medicamento;
	}


	@Override
	public String toString() {
		return "Tratamentos [id=" + id + ", nomeTratamnto=" + nomeTratamnto + ", horaAplicacao=" + horaAplicacao
				+ ", quantidade=" + quantidade + ", consulta=" + consulta + ", medicamento=" + medicamento + "]";
	}

	

}
