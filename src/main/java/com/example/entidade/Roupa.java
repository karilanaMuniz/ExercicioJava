package com.example.entidade;

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

@Column(length = 100, nullable = false)
private String modelo;

@Column(length = 200, nullable= false)
private String discricao;

@Column(length = 100, nullable = false)
private String loja;

public Roupa( String modelo, String discricao, String loja) {
	this.modelo = modelo;
	this.discricao = discricao;
	this.loja = loja;
}


       public Roupa( ) {
	
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


public String getDiscricao() {
	return discricao;
}


public void setDiscricao(String discricao) {
	this.discricao = discricao;
}


public String getLoja() {
	return loja;
}


public void setLoja(String loja) {
	this.loja = loja;
}


}
