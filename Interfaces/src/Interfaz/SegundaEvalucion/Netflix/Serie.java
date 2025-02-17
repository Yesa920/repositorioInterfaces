package Netflix;

import java.util.List;

public class Serie {
	@Override
	public String toString() {
		return "Serie [nombre=" + nombre + ", genero=" + genero + "]";
	}

	private String nombre;
	private String genero;
	private List<Temporada> temporada;

	public Serie(String nom, String gen) {
		this.nombre = nom;
		this.genero = gen;

	}

	public Serie() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<Temporada> getTemporada() {
		return temporada;
	}

	public void setTemporada(List<Temporada> temporada) {
		this.temporada = temporada;
	}

}
