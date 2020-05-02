package com.prueba.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prueba.demo.interfazService.IPersonaService;
import com.prueba.demo.modelo.Persona;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private IPersonaService service;

	@GetMapping("/listar")
	public String listar (Model model)
	{
		
		List<Persona> lstPersona = service.findAll();
		model.addAttribute("personas", lstPersona);
		return "index";
	}
}
