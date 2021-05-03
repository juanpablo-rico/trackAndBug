package edu.curso.java.proyecto.trackandbug.rest;


import edu.curso.java.proyecto.trackandbug.bo.Usuario;

public class UsuarioDTO {
	
	private Long idUsuario;
	private String nombre;
	private String apellido;

	public UsuarioDTO() {
	}
	
	
	public UsuarioDTO(Usuario usuario) {
		this.idUsuario=usuario.getIdUsuario();
//		this.nombre=usuario.getNombre();
//		this.apellido=usuario.getApellido();
	}
	
	
	
	public Long getId() {
		return idUsuario;
	}

	public void setId(Long id) {
		this.idUsuario = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	

	
}