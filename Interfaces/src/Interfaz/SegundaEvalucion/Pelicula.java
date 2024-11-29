package SegundaEvaluacion;

public class Pelicula {
	private String nombre;
	private String genero;
	private int agno;
	private double duracion;

	public Pelicula(String nom, String gen, int anho, double dur) {
		this.nombre = nom;
		this.genero = gen;
		this.agno = anho;
		this.duracion = dur;
	}

	public Pelicula() {
	}

	public String getNombrePelicula() {
		return nombre;
	}

	public void setNombrePelicula(String nom) {
		this.nombre = nom;
	}

	public String getGeneroPelicula() {
		return genero;
	}

	public void setGeneroPelicula(String gen) {
		this.genero = gen;
	}

	public int getAgno() {
		return agno;
	}

	public void setAgno(int anho) {
		this.agno = anho;
	}

	public double getDuracionPelicula() {
		return duracion;
	}

	public void setDuracionPelicula(double dur) {
		this.duracion = dur;
	}

}
