package edu.curso.java.proyecto.trackandbug.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.curso.java.proyecto.trackandbug.bo.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

	@Query(value = "from Usuario u where u.nombre like :nombre")
	public List<Usuario> buscadorDeUsuario(@Param("nombre") String nombre);
	
}