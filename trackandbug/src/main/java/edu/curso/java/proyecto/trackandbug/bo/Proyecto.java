package edu.curso.java.proyecto.trackandbug.bo;

import java.util.*;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Proyecto {
	
	@ManyToOne
	private Usuario responsable;
	
	@ManyToMany
	private List<Usuario> usuarios = new ArrayList<Usuario>();

	@OneToMany	
	private List<Tarea> tareas = new ArrayList<Tarea>();
	
	@Id
	private Long idProyecto;
	
	@Column(nullable = false, length = 40)
	private String nombre;
	private Long horasAsignadas;

	@OneToOne
	private Usuario UsuarioACargo;
	
	
	
	public List<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(List<Tarea> tareas) {
		this.tareas = tareas;
	}

	public Usuario getResponsable() {
		return responsable;
	}

	public void setResponsable(Usuario responsable) {
		this.responsable = responsable;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
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

	public Long getHorasAsignadas() {
		return horasAsignadas;
	}

	public void setHorasAsignadas(Long horasAsignadas) {
		this.horasAsignadas = horasAsignadas;
	}

	public Usuario getUsuarioACargo() {
		return UsuarioACargo;
	}

	public void setUsuarioACargo(Usuario usuarioACargo) {
		UsuarioACargo = usuarioACargo;
	}



}
