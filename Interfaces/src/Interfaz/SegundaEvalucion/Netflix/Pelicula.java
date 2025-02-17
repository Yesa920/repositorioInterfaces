package Netflix;

import java.util.List;

public class Pelicula {
	@Override
	public String toString() {
		return "Pelicula nombre=" + nombre + ", genero=" + genero + ", directo=" + directo + ", agno=" + agno
				+ ", duracion=" + duracion;
	}

	private String nombre;
	private String genero;
	private String directo;
	private int agno;
	private int duracion;
	private List<Usuario> usuario;

	public Pelicula(String nom, String gen, String dire, int ag, int dura) {
		this.nombre = nom;
		this.genero = gen;
		this.directo = dire;
		this.agno = ag;
		this.duracion = dura;

	}

	public Pelicula() {

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

	public String getDirecto() {
		return directo;
	}

	public void setDirecto(String dire) {
		this.directo = dire;
	}

	public int getAgno() {
		return agno;
	}

	public void setAgno(int ag) {
		this.agno = ag;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int dura) {
		this.duracion = dura;
	}

}
