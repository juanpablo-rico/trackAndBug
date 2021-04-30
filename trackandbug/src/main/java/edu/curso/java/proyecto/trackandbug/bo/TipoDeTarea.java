package edu.curso.java.proyecto.trackandbug.bo;

import javax.persistence.*;

public class TipoDeTarea {

	@Id
	@GeneratedValue
	private Long Id;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}


}
