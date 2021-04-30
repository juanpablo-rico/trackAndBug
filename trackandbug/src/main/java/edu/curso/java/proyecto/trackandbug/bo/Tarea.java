package edu.curso.java.proyecto.trackandbug.bo;

import java.util.*;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Tarea {

	@Id
	@GeneratedValue
	private Long IdTarea;
	
	@ManyToOne
	private TipoDeEstado tipoDeEstado;
	
	@ManyToOne
	private TipoDeTarea tipoDeTarea;
	
	@OneToMany
	private List<Comentario> comentarios = new ArrayList<Comentario>();

	public TipoDeTarea getTipoDeTarea() {
		return tipoDeTarea;
	}

	public void setTipoDeTarea(TipoDeTarea tipoDeTarea) {
		this.tipoDeTarea = tipoDeTarea;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
	
	
}
