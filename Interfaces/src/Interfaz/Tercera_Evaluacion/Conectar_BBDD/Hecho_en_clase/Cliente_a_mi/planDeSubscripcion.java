package com.example.bbddConnector.peticion;

public class planDeSubscripcion {
	private int idPlanSubscripcion;
	private String tipo;
	private double costo;
	private boolean anuncios;

	public planDeSubscripcion() {

	}

	public planDeSubscripcion(int idPlanSubs, String ti, double cos, boolean anun) {
		super();
		this.idPlanSubscripcion = idPlanSubs;
		this.tipo = ti;
		this.costo = cos;
		this.anuncios = anun;
	}

	public String getTipo() {
		return tipo;
	}

	public int getIdPlanSubscripcion() {
		return idPlanSubscripcion;
	}

	public void setIdPlanSubscripcion(int idPlanSubs) {
		this.idPlanSubscripcion = idPlanSubs;
	}

	public void setTipo(String ti) {
		this.tipo = ti;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double cos) {
		this.costo = cos;
	}

	public boolean isAnuncios() {
		return anuncios;
	}

	public void setAnuncios(boolean anun) {
		this.anuncios = anun;
	}

	public void elegirPlan() {

	}

}
