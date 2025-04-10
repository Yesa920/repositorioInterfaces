package com.example.bbddConnector.peticion;

public class habito {
	private int id_habito;
	private String nombre;
	private int frecuencia;
	private int id_usuario;

	public habito() {

	}

	public habito(int id_hab, String nom, int frecu, int id_usu) {
		super();
		this.id_habito = id_hab;
		this.nombre = nom;
		this.frecuencia = frecu;
		this.id_usuario = id_usu;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usu) {
		this.id_usuario = id_usu;
	}

	public int getId_habito() {
		return id_habito;
	}

	public void setId_habito(int id_hab) {
		this.id_habito = id_hab;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nom) {
		this.nombre = nom;
	}

	public int getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(int frecu) {
		this.frecuencia = frecu;
	}

	public void crearReto() {

	}

	public void eliminarReto() {

	}
}
