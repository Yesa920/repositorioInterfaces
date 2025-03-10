package FantasycOPIAR;

import java.util.Random;
import java.util.Scanner;

public class Batalla {

	public static void iniciarCombate(Personaje jugador, Personaje enemigo) {
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.println("¡Comienza la batalla entre " + jugador.nombre + " y " + enemigo.nombre + "!");

		while (jugador.estaVivo() && enemigo.estaVivo()) {
			System.out.println(jugador.nombre + " ataca a " + enemigo.nombre);
			enemigo.recibirDano(jugador.atacar());

			if (!enemigo.estaVivo()) {
				System.out.println(enemigo.nombre + " ha sido derrotado!");
				jugador.subirNivel();
				break;
			}

			System.out.println(enemigo.nombre + " ataca a " + jugador.nombre);
			jugador.recibirDano(enemigo.atacar());

			if (!jugador.estaVivo()) {
				System.out.println(jugador.nombre + " ha sido derrotado!");
				break;
			}
		}
	}
}
