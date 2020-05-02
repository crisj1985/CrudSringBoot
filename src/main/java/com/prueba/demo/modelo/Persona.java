package com.prueba.demo.modelo;

import javax.persistence.*;

@Entity
@Table(name="persona")
public class Persona {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private String telefono;
	
	public Persona(int id, String name, String telefono) {
		super();
		this.id = id;
		this.name = name;
		this.telefono = telefono;
	}
	public Persona() {
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	

}
