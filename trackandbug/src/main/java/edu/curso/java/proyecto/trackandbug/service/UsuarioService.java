package edu.curso.java.proyecto.trackandbug.service;


import java.util.List;

import edu.curso.java.proyecto.trackandbug.bo.*;



public interface UsuarioService {
	
	 public List<Usuario>buscarUsuario();
	 public Usuario buscarPorUsuarioPorId(Long idUsuario);
	 public void eliminarUsuario(Long idUsuario);
	 public void actualizarUsuario (Usuario usuario);
	 public Long altaUsuario(Usuario usuario);
}

