package com.prueba.demo.interfazService;

import java.util.List;
import java.util.Optional;

import com.prueba.demo.modelo.Persona;

public interface IPersonaService {
	
	public List<Persona> findAll();
	public Optional<Persona> listarId(int id);
	public int save(Persona p);
	public void delete(int id);

}
