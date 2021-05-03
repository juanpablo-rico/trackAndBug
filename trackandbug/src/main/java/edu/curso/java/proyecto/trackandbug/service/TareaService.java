package edu.curso.java.proyecto.trackandbug.service;

import java.util.List;

import edu.curso.java.proyecto.trackandbug.bo.Tarea;

public interface TareaService {
	public List<Tarea> buscarTarea();
	public Tarea buscarTareaPorId(Long idTarea);
    public void eliminarTarea(Long idTarea);
	public void actualizarTarea(Tarea tarea);
    public Long altaTarea(Tarea tarea, Long idTipoDeTarea,Long idTipoDeEstado);

}



