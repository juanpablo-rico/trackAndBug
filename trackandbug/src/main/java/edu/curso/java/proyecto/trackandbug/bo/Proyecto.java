package edu.curso.java.proyecto.trackandbug.bo;

import java.util.*;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Proyecto {
	
	@ManyToOne
	private Usuario responsable;
	
	@ManyToMany
	private List<Usuario> usuarios = new ArrayList<Usuario>();

	@OneToMany	
	private List<Tarea> tareas = new ArrayList<Tarea>();

	public List<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(List<Tarea> tareas) {
		this.tareas = tareas;
	}


}
