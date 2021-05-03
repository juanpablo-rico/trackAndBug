package edu.curso.java.proyecto.trackandbug.rest;

import edu.curso.java.proyecto.trackandbug.bo.TipoDeEstado;

public class TipoDeEstadoDTO {
	
	private Long idTipoDeEstado;
	private String descripcion;
	private String nombre;
	
	public TipoDeEstadoDTO() {
	}
	
	public TipoDeEstadoDTO(TipoDeEstado tipoDeEstado) {
		this.idTipoDeEstado= tipoDeEstado.getId();
		this.nombre=tipoDeEstado.getNombre();
//		this.descripcion=tipoDeEstado.getDescripcion();
	}
	
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getIdTipoDeEstado() {
		return idTipoDeEstado;
	}

	public void setIdTipoDeEstado(Long idTipoDeEstado) {
		this.idTipoDeEstado = idTipoDeEstado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
	
