package Fantasy;

public abstract class Personaje {

	protected double vida;
	protected double defensa;
	protected int agilidad;

	public Personaje() {

	}

	public Personaje(double e, double d, int agil) {
		this.vida = e;
		this.defensa = d;
		this.agilidad = agil;
	}

	public double getVida() {
		return vida;
	}

	public void setVida(int vid) {
		this.vida = vid;
	}

	public double getDefensa() {
		return defensa;
	}

	public void setDefensa(int defen) {
		this.defensa = defen;
	}

	public int getAgilidad() {
		return agilidad;
	}

	public void setAgilidad(int agil) {
		this.agilidad = agil;
	}

	protected abstract int atacar(double vidaDelEnemigo, int dagno);

	protected abstract int defender(double vidaActual, double dagnoDelBot);

}
