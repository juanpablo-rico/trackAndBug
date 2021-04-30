package edu.curso.java.proyecto.trackandbug.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import edu.curso.java.proyecto.trackandbug.bo.*;

@Repository
public interface TareaRepository extends CrudRepository<Tarea, Long> {
	
	@Query(value="select t.duracion from Tarea t where t.proyecto.id = :idProyecto")
	public Double buscarHorasAsignadas(@Param(value = "idProyecto") Long idProyecto);
	
}
