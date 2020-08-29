package br.com.zup.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Comentario {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String texto;
	private String usuario;
	private LocalDateTime dataCriacao = LocalDateTime.now();
	
public Comentario () {
		
	}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getTexto() {
	return texto;
}

public void setTexto(String texto) {
	this.texto = texto;
}

public String getUsuario() {
	return usuario;
}

public void setUsuario(String usuario) {
	this.usuario = usuario;
}

public LocalDateTime getDataCriacao() {
	return dataCriacao;
}

public void setDataCriacao(LocalDateTime dataCriacao) {
	this.dataCriacao = dataCriacao;
}


	
}