package FantasycOPIAR;

class Mago extends Personaje {
	public Mago(String nombre, String raza) {
		super(nombre, raza, "Mago", 3, 5, 10);
	}

	@Override
	public int atacar() {
		return inteligencia * 2;
	}
}
