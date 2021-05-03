package edu.curso.java.proyecto.trackandbug.bo;

import javax.persistence.*;

public class TipoDeTarea {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long idTipoDeTarea;
	@Column(nullable = false, length = 40)
	private String nombre;

	
	public Long getId() {
		return idTipoDeTarea;
	}
	public void setId(Long id) {
		this.idTipoDeTarea = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
