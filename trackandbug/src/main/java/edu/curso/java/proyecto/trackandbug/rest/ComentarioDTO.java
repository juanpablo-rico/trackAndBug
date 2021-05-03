package edu.curso.java.proyecto.trackandbug.rest;


import java.util.Date;

import edu.curso.java.proyecto.trackandbug.bo.Comentario;

public class ComentarioDTO {


	private Long idComentario;
	private Long idUsuario;
	private String creadoPor;
	private String comentario;
	private Date fecha;
	
    
	public ComentarioDTO() {
	}
	
	public ComentarioDTO(Comentario comentario) {
		this.idComentario = comentario.getId();	
		this.comentario = comentario.getComentario();
		this.fecha = comentario.getFecha();
		if(comentario.getCreadoPor()!= null) {
			this.idUsuario = ((ComentarioDTO) comentario.getCreadoPor()).getIdUsuario();
			}
	}

	public Long getIdComentario() {
		return idComentario;
	}

	public void setIdComentario(Long idComentario) {
		this.idComentario = idComentario;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getCreadoPor() {
		return creadoPor;
	}

	public void setCreadoPor(String creadoPor) {
		this.creadoPor = creadoPor;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	

}