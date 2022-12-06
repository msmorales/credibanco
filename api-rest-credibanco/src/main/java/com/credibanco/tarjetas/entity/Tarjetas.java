package com.credibanco.tarjetas.entity;

import java.io.Serializable;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TARJETAS")
public class Tarjetas implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_tarjeta", nullable = false)
	private String id;
	@Column(nullable = false)
	private String pan;
	@Column(nullable = false)
	private String cedula;
	@Column(nullable = false)
	private String titular;
	@Column(nullable = false)
	private String tipo;
	@Column(nullable = false)
	private String telefono;
	@Column(nullable = false)
	private int cupo;
	@Column(nullable = false)
	private String estado;
	@Column(nullable = false)
	private String identificador;
	@Column(nullable = false)
	private String numeroValidacion;
	@Column(nullable = false)
	private String panEnmascarado;

	public Tarjetas(String id, String pan, String cedula, String titular, String tipo, String telefono, int cupo,
			String estado, String identificador, String numeroValidacion, String panEnmascarado) {
		this.id = id;
		this.pan = pan;
		this.cedula = cedula;
		this.titular = titular;
		this.tipo = tipo;
		this.telefono = telefono;
		this.cupo = cupo;
		this.estado = estado;
		this.identificador = identificador;
		this.numeroValidacion = numeroValidacion;
		this.panEnmascarado = panEnmascarado;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getCupo() {
		return cupo;
	}

	public void setCupo(int cupo) {
		this.cupo = cupo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getNumeroValidacion() {
		return numeroValidacion;
	}

	public void setNumeroValidacion(String numeroValidacion) {
		this.numeroValidacion = numeroValidacion;
	}

	public String getPanEnmascarado() {
		return panEnmascarado;
	}

	public void setPanEnmascarado(String panEnmascarado) {
		this.panEnmascarado = panEnmascarado;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
