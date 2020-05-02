package com.prueba.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prueba.demo.modelo.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer>{

}
