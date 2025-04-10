package com.example.bbddConnector.peticion;

public class Usuario {
	private int id_usuario;
	private String nombre;
	private String contrasegna;
	private String email;
	private int idPlanSubscripcion;

	public Usuario() {

	}

	public Usuario(int id_usu, String nom, String cons, String ema, int pla) {
		super();
		this.id_usuario = id_usu;
		this.nombre = nom;
		this.contrasegna = cons;
		this.email = ema;
		this.idPlanSubscripcion = pla;
	}

	public String getContrasegna() {
		return contrasegna;
	}

	public void setContrasegna(String contra) {
		this.contrasegna = contra;
	}

	public int getIdPlanSubscripcion() {
		return idPlanSubscripcion;
	}

	public void setIdPlanSubscripcion(int idPlanSubs) {
		this.idPlanSubscripcion = idPlanSubs;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usu) {
		this.id_usuario = id_usu;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nom) {
		this.nombre = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String ema) {
		this.email = ema;
	}

	public int getPlan() {
		return idPlanSubscripcion;
	}

	public void setPlan(int pla) {
		this.idPlanSubscripcion = pla;
	}

	private void crearCuenta() {
	}

	private void accederApp() {

	}

	private void organizarSemanas() {

	}

	private void probarAplicacion() {

	}

	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", nombre=" + nombre + ", contrasegna=" + contrasegna + ", email="
				+ email + ", idPlanSubscripcion=" + idPlanSubscripcion + "]";
	}

}
