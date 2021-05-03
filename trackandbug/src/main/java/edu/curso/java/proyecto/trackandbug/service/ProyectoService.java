package edu.curso.java.proyecto.trackandbug.service;


import java.util.List;

import edu.curso.java.proyecto.trackandbug.bo.*;

public interface ProyectoService {
	
	public List<Proyecto> buscarProyectos();
	public Proyecto buscarProyectoPorId(Long idProyecto);
	public void eliminarProyecto(Long id);
	public void actualizarProyecto(Proyecto proyecto);
	public Long altaProyecto(Proyecto proyecto);
}