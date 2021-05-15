package com.qintess.veterinaria.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.qintess.veterinaria.enums.TipoAtendimentoEnum;

@Entity
public class Atendimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne
	private Consultas consulta;

	private TipoAtendimentoEnum tipo;

	private LocalDateTime diaHora;

	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="atendimento") 
	private List<Funcionarios>funcionario = new ArrayList<Funcionarios>();//ok

	@OneToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY )//ok
	private Clientes cliente;

	@OneToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)//ok
	private Animais animal;


	public Atendimento() {

	}


	public Atendimento(int id, TipoAtendimentoEnum tipo, LocalDateTime diaHora, List<Funcionarios> funcionario,
			Clientes cliente, Animais animal) {

		this.id = id;
		this.tipo = tipo;
		this.diaHora = diaHora;
		this.funcionario = funcionario;
		this.cliente = cliente;
		this.animal = animal;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public TipoAtendimentoEnum getTipo() {
		return tipo;
	}


	public void setTipo(TipoAtendimentoEnum tipo) {
		this.tipo = tipo;
	}


	public LocalDateTime getDiaHora() {
		return diaHora;
	}


	public void setDiaHora(LocalDateTime diaHora) {
		this.diaHora = diaHora;
	}


	public List<Funcionarios> getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(List<Funcionarios> funcionario) {
		this.funcionario = funcionario;
	}


	public Clientes getCliente() {
		return cliente;
	}


	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}


	public Animais getAnimal() {
		return animal;
	}


	public void setAnimal(Animais animal) {
		this.animal = animal;
	}


	@Override
	public String toString() {
		return "Atendimento [id=" + id + ", tipo=" + tipo + ", diaHora=" + diaHora + ", funcionario=" + funcionario
				+ ", cliente=" + cliente + ", animal=" + animal + "]";
	}





}
