package SegundaEvaluacion;

public class Temporada {
	private String nombre;
	private int capitulos;

	public Temporada(String nom, int cap) {
		this.nombre = nom;
		this.capitulos = cap;
	}

	public Temporada() {

	}

	public String getNombreTemporada() {
		return nombre;
	}

	public void setNombreTemporada(String nom) {
		this.nombre = nom;
	}

	public int getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(int cap) {
		this.capitulos = cap;
	}

}
