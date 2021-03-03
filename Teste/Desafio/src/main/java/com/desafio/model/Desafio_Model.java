package com.desafio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.domain.AbstractPersistable;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import javax.sql.DataSource;
import java.sql.SQLException;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.sun.istack.NotNull;

@Entity
@Configuration
@ConfigurationProperties("oracle")
@Table(name = "cadastro")
public class Desafio_Model extends AbstractPersistable<Long>{
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	
	@NotNull
	@Column(name="nome")
	private String nome;
	
	@NotNull
	@Column(name="idade")
	private int idade;
	
	@NotNull
	@Column(name="cpf")
	private String cpf;
	
	@NotNull
	@Column(name="dependentes")
	private int dependentes;
	
	@NotNull
	@Column(name="renda")
	private double renda;

	public Long getId() {
		return id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getDependentes() {
		return dependentes;
	}

	public void setDependentes(int dependentes) {
		this.dependentes = dependentes;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	@Override
	public void setId(Long id) {
		super.setId(id);
	}
	
	
	
	

}
