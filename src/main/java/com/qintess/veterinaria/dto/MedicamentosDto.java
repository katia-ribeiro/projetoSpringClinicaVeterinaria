package com.qintess.veterinaria.dto;

public class MedicamentosDto {
	
	private String nome;
	
		private String id;
		private String descricao;
		private String tratamento;
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public String getTratamento() {
			return tratamento;
		}
		public void setTratamento(String tratamento) {
			this.tratamento = tratamento;
		}


}
