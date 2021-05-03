package edu.curso.java.proyecto.trackandbug.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.curso.java.proyecto.trackandbug.bo.Usuario;
import edu.curso.java.proyecto.trackandbug.repository.*;


@Service
@Transactional
public class UsuarioServiceImp implements UsuarioService {

	@Autowired
	 UsuarioRepository usuarioRepository;
	
	@Override
	public Usuario buscarPorUsuarioPorId(Long idUsuario) {
		return usuarioRepository.findById(idUsuario).get();
	}
	
	
	@Override
	public List<Usuario> buscarUsuario() {
		return (List<Usuario>) usuarioRepository.findAll();
	}
	
	
	@Override
	public void eliminarUsuario(Long idUsuario) {
    usuarioRepository.deleteById(idUsuario);
	}

	
	@Override
	public void actualizarUsuario(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	@Override
	public Long altaUsuario(Usuario usuario) {
	     usuarioRepository.save(usuario);
		return usuario.getIdUsuario();
	}
	
	
	
}
