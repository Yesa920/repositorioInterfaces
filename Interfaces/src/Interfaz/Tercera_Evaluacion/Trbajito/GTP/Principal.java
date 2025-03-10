package FantasycOPIAR;

public class Principal {
	public static void main(String[] args) {
		Personaje jugador = new Guerrero("Arthas", "Humano");
		Personaje enemigo = new Mago("Maleficus", "Elfo Oscuro");

		Batalla batalla = new Batalla();

		Batalla.iniciarCombate(jugador, enemigo);
	}
}
