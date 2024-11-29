package SegundaEvaluacion;

public class Alumno {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private int edad;

	public Alumno(String nom, String ape1, String ape2, String nif, int eda) {
		this.nombre = nom;
		this.apellido1 = ape1;
		this.apellido2 = ape2;
		this.dni = nif;
		this.edad = eda;
	}

	public Alumno() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
