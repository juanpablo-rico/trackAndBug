package edu.curso.java.proyecto.trackandbug.rest;

import edu.curso.java.proyecto.trackandbug.bo.Proyecto;

public class ProyectoDTO {

	
	
	private Long idProyecto;
	private String nombre;
	private Long usuarioResponsable;
	private Long horasAsignadas;


	public ProyectoDTO(){
	}
	
	
	
	public ProyectoDTO(Proyecto proyecto) {
		
		this.idProyecto = proyecto.getIdProyecto();
		this.nombre = proyecto.getNombre();
		this.usuarioResponsable = proyecto.getHorasAsignadas();
		
	}

	public Long getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(Long idProyecto) {
		this.idProyecto = idProyecto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Long getUsuarioResponsable() {
		return usuarioResponsable;
	}

	public void setUsuarioResponsable(Long usuarioResponsable) {
		this.usuarioResponsable = usuarioResponsable;
	}

	public Long getHorasAsignadas() {
		return horasAsignadas;
	}

	public void setHorasAsignadas(Long horasAsignadas) {
		this.horasAsignadas = horasAsignadas;
	}

	
}