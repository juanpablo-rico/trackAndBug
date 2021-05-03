package edu.curso.java.proyecto.trackandbug.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.curso.java.proyecto.trackandbug.bo.*;
import edu.curso.java.proyecto.trackandbug.repository.*;


@Service
@Transactional
public class TareaServiceImp implements TareaService {

	@Autowired
	 TareaRepository tareaRepository;
	@Autowired
	TipoDeTareaRepository tipoDeTareaRepository;
	@Autowired
	TipoDeEstadoRepository tipoDeEstadoRepository;
	
	@Override
	public Tarea buscarTareaPorId(Long idTarea) {		
		return tareaRepository.findById(idTarea).get();
	}
	
	
	@Override
	public List<Tarea> buscarTarea() {	
		return (List<Tarea>) tareaRepository.findAll();
	}

	
	@Override
	public void eliminarTarea(Long idTarea) {
		tareaRepository.deleteById(idTarea);
	}
	
	
	@Override
	public void actualizarTarea(Tarea tarea) {
		tareaRepository.save(tarea);
	}


	@Override
	public Long altaTarea(Tarea tarea, Long idTipoDeTarea, Long idTipoDeEstado) {
		TipoDeTarea tipoDeTarea= tipoDeTareaRepository.findById(idTipoDeTarea).get();
		TipoDeEstado tipoDeEstado= tipoDeEstadoRepository.findById(idTipoDeEstado).get();
		tarea.setTipoDeTarea(tipoDeTarea);
		tarea.setTipoDeEstado(tipoDeEstado);
		tareaRepository.save(tarea);
		return tarea.getIdTarea();
	}

}