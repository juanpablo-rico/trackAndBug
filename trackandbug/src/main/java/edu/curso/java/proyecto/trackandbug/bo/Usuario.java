package edu.curso.java.proyecto.trackandbug.bo;

import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {


	@Id
	@GeneratedValue
	private Long idUsuario;

	@Column(nullable = false, length = 200)
	private String nombreUsuario;

	@Column(nullable = false, length = 200)
	private String apellidoUsuario;

	@ManyToMany(mappedBy = "usuarios")
	private List<Tarea>tareas = new ArrayList<Tarea>();

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getApellidoUsuario() {
		return apellidoUsuario;
	}

	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}

	public List<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(List<Tarea> tareas) {
		this.tareas = tareas;
	}


}
