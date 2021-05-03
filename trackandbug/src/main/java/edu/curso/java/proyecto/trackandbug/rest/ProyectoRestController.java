package edu.curso.java.proyecto.trackandbug.rest;


import java.util.ArrayList;
import java.util.List;

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
import org.springframework.web.bind.annotation.RestController;

import edu.curso.java.proyecto.trackandbug.bo.Proyecto;
import edu.curso.java.proyecto.trackandbug.service.ProyectoService;

@RestController
@RequestMapping(value = "/proyecto")
public class ProyectoRestController {


    @Autowired
    private ProyectoService proyectoService;
    
	  @GetMapping (path="/{id}")
	  public ResponseEntity<ProyectoDTO> buscarProyectosPorId(@PathVariable Long idProyecto){		  
		  Proyecto proyecto=  proyectoService.buscarProyectoPorId(idProyecto);		  
		  ProyectoDTO proyectoDTO = new ProyectoDTO(proyecto);
		  return ResponseEntity.ok(proyectoDTO);
	  }
	  
	  @GetMapping
		public ResponseEntity<List<ProyectoDTO>> buscarProyecto()
		{
			List<Proyecto> proyecto= proyectoService.buscarProyectos();
			List<ProyectoDTO> proyectoDTO= new ArrayList<ProyectoDTO>();
			for(Proyecto p : proyecto) {
				proyectoDTO.add(new ProyectoDTO(p));
			}
			return ResponseEntity.ok(proyectoDTO);
		}
	  
	  
	  @DeleteMapping(path = "/{id}")
	  public ResponseEntity<?> eliminarProyecto(@PathVariable Long idProyecto) {
	  	proyectoService.eliminarProyecto(idProyecto);
	  	return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	  }
	  
	  
	  @PutMapping(path = "/{id}")
	  public ResponseEntity<?> actualizarProyecto(@PathVariable Long idProyecto, @RequestBody ProyectoDTO proyectoDTO) {
	  	Proyecto proyecto= proyectoService.buscarProyectoPorId(idProyecto);
	  	proyecto.setHorasAsignadas(proyectoDTO.getHorasAsignadas());
	  	proyecto.setNombre(proyectoDTO.getNombre());
	  	proyecto.setIdProyecto(proyectoDTO.getIdProyecto());
	  	proyectoService.actualizarProyecto(proyecto);
	  	return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	  }
	  
	  
	  @PostMapping
	  public ResponseEntity<ProyectoDTO> altaProyecto(@RequestBody ProyectoDTO proyectoDTO){
	   Proyecto proyecto= new Proyecto();
	   proyecto.setNombre(proyectoDTO.getNombre());
	   proyecto.setHorasAsignadas(proyectoDTO.getHorasAsignadas());
     proyectoService.altaProyecto(proyecto);
		  return ResponseEntity.status(HttpStatus.CREATED).body(proyectoDTO);
	  }

}
