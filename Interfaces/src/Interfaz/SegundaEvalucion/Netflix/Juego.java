package Netflix;

public class Juego {
	@Override
	public String toString() {
		return "Juego [nombre=" + nombre + ", genero=" + genero + ", plataforma=" + plataforma + "]";
	}

	private String nombre;
	private String genero;
	private String plataforma;

	public Juego(String nom, String gen, String plata) {

		this.nombre = nom;
		this.genero = gen;
		this.plataforma = plata;
	}

	public Juego() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nom) {
		this.nombre = nom;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String gen) {
		this.genero = gen;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plata) {
		this.plataforma = plata;
	}

}
