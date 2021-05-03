package edu.curso.java.proyecto.trackandbug.bo;

import java.util.*;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Tarea {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long idTarea;
	
	@Column(nullable = false, length = 40)
	private String nombre;
	private Long duracion;
	private Long horasAsignadas;
	
	@ManyToOne
	private Proyecto proyecto;
	@ManyToOne
	private TipoDeTarea tipoDeTarea;
	@ManyToOne
	private TipoDeEstado tipoDeEstado;
	@ManyToOne
	private Usuario usuarioEncargado;
	@ManyToMany
	private List<Usuario> usuarios= new ArrayList<Usuario>();

	@OneToMany
	@JoinColumn(name = "TAREA_ID")
	private List<Comentario> comentarios= new ArrayList<Comentario>();

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

	public Long getDuracion() {
		return duracion;
	}

	public void setDuracion(Long duracion) {
		this.duracion = duracion;
	}

	public Long getHorasAsignadas() {
		return horasAsignadas;
	}

	public void setHorasAsignadas(Long horasAsignadas) {
		this.horasAsignadas = horasAsignadas;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public TipoDeTarea getTipoDeTarea() {
		return tipoDeTarea;
	}

	public void setTipoDeTarea(TipoDeTarea tipoDeTarea) {
		this.tipoDeTarea = tipoDeTarea;
	}

	public TipoDeEstado getTipoDeEstado() {
		return tipoDeEstado;
	}

	public void setTipoDeEstado(TipoDeEstado tipoDeEstado) {
		this.tipoDeEstado = tipoDeEstado;
	}

	public Usuario getUsuarioEncargado() {
		return usuarioEncargado;
	}

	public void setUsuarioEncargado(Usuario usuarioEncargado) {
		this.usuarioEncargado = usuarioEncargado;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}	
}
