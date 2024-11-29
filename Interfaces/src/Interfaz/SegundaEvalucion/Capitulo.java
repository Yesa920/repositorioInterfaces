package SegundaEvaluacion;

public class Capitulo {
	private String nombre;
	private int duracion;

	public Capitulo(String nom, int dur) {
		this.nombre = nom;
		this.duracion = dur;
	}

	public Capitulo() {

	}

	public String getNombreCapitulo() {
		return nombre;
	}

	public void setNombreCapitulo(String nom) {
		this.nombre = nom;
	}

	public int getDuracionCapitulo() {
		return duracion;
	}

	public void setDuracionCapitulo(int dur) {
		this.duracion = dur;
	}
}
