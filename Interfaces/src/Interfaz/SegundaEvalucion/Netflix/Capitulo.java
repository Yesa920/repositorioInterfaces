package Netflix;

public class Capitulo {
	@Override
	public String toString() {
		return "Capitulo [nombre=" + nombre + ", numero=" + numero + ", duracion=" + duracion + ", idioma=" + idioma
				+ "]";
	}

	private String nombre;
	private int numero;
	private int duracion;
	private String idioma;

	public Capitulo(String nom, int num, int dura, String idi) {

		this.nombre = nom;
		this.numero = num;
		this.duracion = dura;
		this.idioma = idi;
	}

	public Capitulo() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nom) {
		this.nombre = nom;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int num) {
		this.numero = num;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int dura) {
		this.duracion = dura;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idi) {
		this.idioma = idi;
	}

}
