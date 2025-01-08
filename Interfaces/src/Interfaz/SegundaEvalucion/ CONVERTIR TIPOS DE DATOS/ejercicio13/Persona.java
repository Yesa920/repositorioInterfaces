package Conversiones.ejercicio13;

public class Persona {
	private String nombre;
	private int edad;
	public Persona(String nom, int eda) {
		super();
		this.nombre = nom;
		this.edad = eda;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nomb) {
		this.nombre = nomb;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int eda) {
		this.edad = eda;
	}
}
