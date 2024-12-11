package SegundaEvaluacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_2_jugadores {

	public static void main(String[] args) {
		Identificador id = new Identificador();
		Jugador players = new Jugador();
		Masajista masa = new Masajista();
		Entrenador entre = new Entrenador();

		pedirDatos(players, masa, entre);

		mostrarDatos(players, masa, entre);
	}

	private static void mostrarDatos(Jugador players, Masajista masa, Entrenador entre) {
		System.out.println("La informacion de los jugadores" + players.getNombre());
		System.out.println("La informacion de los jugadores" + masa.getNombre());
		System.out.println("La informacion de los jugadores" + entre.getNombre());
	}

	private static void pedirDatos(Jugador players, Masajista masa, Entrenador entre) {

		Scanner leer = new Scanner(System.in);
		String nombreJugador = "a";

		while (nombreJugador != "Q") {

			ArrayList<Jugador> listaDeJugadores = new ArrayList<Jugador>();

			System.out.println("Dime todos los jugadores de un equipo, escribe un Q");
			nombreJugador = leer.next();

			players.setNombre(nombreJugador);
			listaDeJugadores.add(players);

			System.out.println("Dime el entrenador del equipo");
			String nombreEntrenador = leer.next();
			entre.setNombre(nombreEntrenador);

			System.out.println("Dime el masajista del equipo");
			String nombreMasajista = leer.next();
			masa.setNombre(nombreMasajista);

		}
	}

}
