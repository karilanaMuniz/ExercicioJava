package com.aula.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Roupa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	   private int id;
		@Column(length = 40, nullable = false)
	     private String modelo;
		@Column(length = 100, nullable = false)
	     private String descricao;
	
		@Column(length = 100, nullable = false)
		 private String loja;
		
		public Roupa() {
		
		}


		public Roupa(String modelo, String descricao, String loja) {
			super();
			this.modelo = modelo;
			this.descricao = descricao;
			this.loja = loja;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getModelo() {
			return modelo;
		}


		public void setModelo(String modelo) {
			this.modelo = modelo;
		}


		public String getDescricao() {
			return descricao;
		}


		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}


		public String getLoja() {
			return loja;
		}


		public void setLoja(String loja) {
			this.loja = loja;
		}
		
		
		

		
		
}
