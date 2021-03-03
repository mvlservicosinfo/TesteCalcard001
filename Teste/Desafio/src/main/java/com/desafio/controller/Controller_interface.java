package com.desafio.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.model.Desafio_Model;

public interface Controller_interface extends JpaRepository<Desafio_Model, Long> {
	
}
