package FantasycOPIAR;

public abstract class Personaje {
	protected String nombre;
	protected String raza;
	protected String clase;
	protected int nivel;
	protected int fuerza;
	protected int agilidad;
	protected int inteligencia;
	protected int vida;

	public Personaje(String nombre, String raza, String clase, int fuerza, int agilidad, int inteligencia) {
		this.nombre = nombre;
		this.raza = raza;
		this.clase = clase;
		this.nivel = 1;
		this.fuerza = fuerza;
		this.agilidad = agilidad;
		this.inteligencia = inteligencia;
		this.vida = 100;
	}

	public boolean estaVivo() {
		return vida > 0;
	}

	public void recibirDano(int dano) {
		vida -= dano;
		if (vida < 0)
			vida = 0;
	}

	public abstract int atacar();

	public void subirNivel() {
		nivel++;
		fuerza += 2;
		agilidad += 2;
		inteligencia += 2;
		vida += 20;
		System.out.println(nombre + " ha subido al nivel " + nivel);
	}
}
