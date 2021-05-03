package edu.curso.java.proyecto.trackandbug.bo;

import java.util.*;
import javax.persistence.*;


@Entity
@Table(name = "comentarios")
public class Comentario {

	@Id
	@GeneratedValue
	private Long Id;
	
	private Date fecha = new Date();

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getComentario() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getCreadoPor() {
		// TODO Auto-generated method stub
		return null;
	}

}
