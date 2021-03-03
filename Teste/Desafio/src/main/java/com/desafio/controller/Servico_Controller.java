package com.desafio.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.model.Desafio_Model;

import antlr.collections.List;

@Service
public class Servico_Controller  {
	
	
	@Autowired
	private Controller_interface ci;
	
	public void salvar(Desafio_Model dm) {
		ci.save(dm);
	}
	
	public Desafio_Model buscarPorId(Long id) {
		Desafio_Model dm = new Desafio_Model();
		Example<Desafio_Model> S = Example.of(dm);
		ci.findOne(S);
		return dm;
	}
	
	public List buscarTodos(){
		return (List) ci.findAll();
	}
	
	public void apagar(Long id) {
		Desafio_Model dm = new Desafio_Model();
		dm.setId(id);
		ci.delete(dm);
	}

}
