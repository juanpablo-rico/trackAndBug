package edu.curso.java.proyecto.trackandbug.rest;

import edu.curso.java.proyecto.trackandbug.bo.TipoDeTarea;

public class TipoDeTareaDTO {

	private Long idTipoDeTarea;
	private String nombre;
	
	public TipoDeTareaDTO() {
	}
	
	public TipoDeTareaDTO(TipoDeTarea tipoDeTarea) {
		this.idTipoDeTarea=tipoDeTarea.getId();
		this.nombre= tipoDeTarea.getNombre();
		}
	
	

	public Long getIdTipoDeTarea() {
		return idTipoDeTarea;
	}

	public void setIdTipoDeTarea(Long idTipoDeTarea) {
		this.idTipoDeTarea = idTipoDeTarea;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
