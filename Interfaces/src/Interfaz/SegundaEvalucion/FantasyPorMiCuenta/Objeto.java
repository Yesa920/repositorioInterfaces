package Fantasy;

public class Objeto {
	private String nombre;
	int vida;
	int unidades;

	public Objeto() {

	}

	public Objeto(String nom, int vid, int uni) {
		this.nombre = nom;
		this.vida = vid;
		this.unidades = uni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nom) {
		this.nombre = nom;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vid) {
		this.vida = vid;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int uni) {
		this.unidades = uni;
	}

}
