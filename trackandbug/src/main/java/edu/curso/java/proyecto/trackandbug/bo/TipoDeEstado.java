package edu.curso.java.proyecto.trackandbug.bo;

import javax.persistence.*;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class TipoDeEstado {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long idTipoDeEstado;
	private String nombre;
	private String descripcion;
	
	@OneToOne
	private TipoDeEstado tipoDeEstado;
	
	
	public Long getIdTipoDeEstado() {
		return idTipoDeEstado;
	}

	public void setIdTipoDeEstado(Long idTipoDeEstado) {
		this.idTipoDeEstado = idTipoDeEstado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public TipoDeEstado getTipoDeEstado() {
		return tipoDeEstado;
	}

	public void setTipoDeEstado(TipoDeEstado tipoDeEstado) {
		this.tipoDeEstado = tipoDeEstado;
	}	

	public Long getId() {
		return idTipoDeEstado;
	}

	public void setId(Long id) {
		this.idTipoDeEstado = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((idTipoDeEstado == null) ? 0 : idTipoDeEstado.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((tipoDeEstado == null) ? 0 : tipoDeEstado.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoDeEstado other = (TipoDeEstado) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (idTipoDeEstado == null) {
			if (other.idTipoDeEstado != null)
				return false;
		} else if (!idTipoDeEstado.equals(other.idTipoDeEstado))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (tipoDeEstado == null) {
			if (other.tipoDeEstado != null)
				return false;
		} else if (!tipoDeEstado.equals(other.tipoDeEstado))
			return false;
		return true;
	}
	
}
