package edu.curso.java.proyecto.trackandbug.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.curso.java.proyecto.trackandbug.bo.Proyecto;
import edu.curso.java.proyecto.trackandbug.repository.ProyectoRepository;



@Service
@Transactional
public class ProyectoServiceImp implements ProyectoService{


	@Autowired
	private ProyectoRepository proyectoRepository;
	
	
	@Override
	public Proyecto buscarProyectoPorId(Long idProyecto) {
		return  proyectoRepository.findById(idProyecto).get();
	}
	
	
	@Override
	public List<Proyecto> buscarProyectos() {
		return (List<Proyecto>) proyectoRepository.findAll();
	}


	@Override
	public void eliminarProyecto(Long idProyecto) {
		proyectoRepository.deleteById(idProyecto);
	}
	
	
	@Override
	public void actualizarProyecto(Proyecto proyecto) {
		proyectoRepository.save(proyecto);
	}
	
	
	@Override
	public Long altaProyecto(Proyecto proyecto) {
		proyectoRepository.save(proyecto);
		return proyecto.getIdProyecto();
	}

	

}
