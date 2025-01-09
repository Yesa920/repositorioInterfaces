package SegundaEvaluacion.relacionesClases;

public class Propietario {
	private int id;
	private String nombre;
	private String apellido;

	public Propietario(int id, String nom, String ape) {
		this.id = id;
		this.nombre = nom;
		this.apellido = ape;
	}

	public Propietario() {

	}

	public int getId() {
		return id;
	}

	public void setId(int identidicacion) {
		this.id = identidicacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nom) {
		this.nombre = nom;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String ape) {
		this.apellido = ape;
	}

}
