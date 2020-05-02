package com.prueba.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.prueba.demo.interfaces.IPersona;
import com.prueba.demo.interfazService.IPersonaService;
import com.prueba.demo.modelo.Persona;

@Service
public class PersonaService implements IPersonaService{
	
	@Autowired
	private IPersona data;

	@Override
	public List<Persona> findAll() {
		// TODO Auto-generated method stub
		return (List<Persona>)data.findAll();
		}

	@Override
	public Optional<Persona> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Persona p) {
		int resp=0;
		Persona per = data.save(p);
		if(!per.equals(null))
			resp = 1;
		return resp;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
