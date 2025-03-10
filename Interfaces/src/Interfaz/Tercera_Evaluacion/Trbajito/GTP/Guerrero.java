package FantasycOPIAR;

public class Guerrero extends Personaje {
	public Guerrero(String nombre, String raza) {
		super(nombre, raza, "Guerrero", 10, 5, 3);
	}

	@Override
	public int atacar() {
		return fuerza * 2;
	}
}
