package edu.curso.java.proyecto.trackandbug.rest;


import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.curso.java.proyecto.trackandbug.bo.Usuario;
import edu.curso.java.proyecto.trackandbug.service.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioRestController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<UsuarioDTO> recuperarUsuarioPorId(@PathVariable Long id) {
		Usuario usuarios = usuarioService.buscarUsuariosPorId(id);
		UsuarioDTO usuarioDTO = new UsuarioDTO(usuarios);
		return ResponseEntity.ok(usuarioDTO);
	}
	
	@GetMapping
	public ResponseEntity<List<UsuarioDTO>> buscarUsuarios(){
	
		List<Usuario> usuarios = usuarioService.buscarUsuarios();
		List<UsuarioDTO> usuarioDTO = new ArrayList<UsuarioDTO>();
		for(Usuario u :  usuarios) {
			usuarioDTO.add(new UsuarioDTO(u));
		}
		
		return ResponseEntity.ok(usuarioDTO);
	}

	

	@PostMapping
	public ResponseEntity<UsuarioDTO> altaUsuarios(@Valid @RequestBody UsuarioDTO usuarioDTO){
		Usuario usuarios = new Usuario();
		usuarios.setNombre(usuarioDTO.getNombre());
		usuarios.setAlias(usuarioDTO.getAlias());
		usuarios.setApellido(usuarioDTO.getApellido());
		
		Long idGenerado = usuarioService.altaUsuarios(usuarios);
		usuarioDTO.setIdUsuario(idGenerado);
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioDTO);
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity actualizarUsuarios(@PathVariable Long id, @RequestBody UsuarioDTO usuarioDTO){
		Usuario usuarios = usuarioService.buscarUsuariosPorId(id);
		usuarios.setNombre(usuarioDTO.getNombre());
		usuarioService.actualizarUsuarios(usuarios);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity borrarUsuarios(@PathVariable Long id){
		usuarioService.borrarUsuarios(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
}


