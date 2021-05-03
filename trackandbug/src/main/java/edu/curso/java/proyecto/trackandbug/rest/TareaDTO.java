package edu.curso.java.proyecto.trackandbug.rest;

import edu.curso.java.proyecto.trackandbug.bo.Tarea;
import edu.curso.java.proyecto.trackandbug.bo.TipoDeEstado;
import edu.curso.java.proyecto.trackandbug.bo.TipoDeTarea;



public class TareaDTO {
	
	private Long idTarea;
	private String nombre;
	private Long idTipoDeEstado;
	private String tipoDeEstado;
	private Long duracion;
	

	
	public TareaDTO() {
	}
	
/*	public TareaDTO(Tarea tarea) {
		this.idTarea = tarea.getIdTarea();
		this.nombre = tarea.getNombre();
		this.duracion = tarea.getDuracion();
		TipoDeEstado tipoDeEstado = tarea.getTipoDeEstado();
		TipoDeTarea tipoDeTarea= tarea.getTipoDeTarea();
		if(tipoDeEstado != null && tipoDeTarea!= null) {
			this.idTipoDeEstado= tipoDeEstado.getId();
			this.tipoDeEstado= tipoDeEstado.getDescripcion();
			this.idTarea= tipoDeTarea.getId();
		}
	}
	
	*/

	public Long getIdTarea() {
		return idTarea;
	}

	public void setIdTarea(Long idTarea) {
		this.idTarea = idTarea;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getIdTipoDeEstado() {
		return idTipoDeEstado;
	}

	public void setIdTipoDeEstado(Long idTipoDeEstado) {
		this.idTipoDeEstado = idTipoDeEstado;
	}

	public String getTipoDeEstado() {
		return tipoDeEstado;
	}

	public void setTipoDeEstado(String tipoDeEstado) {
		this.tipoDeEstado = tipoDeEstado;
	}

	public Long getDuracion() {
		return duracion;
	}

	public void setDuracion(Long duracion) {
		this.duracion = duracion;
	}
	
	
}
