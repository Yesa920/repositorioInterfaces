package FantasyFutbol;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) throws SQLException {
		Scanner leer = new Scanner(System.in);
		Jugador jugador = new Jugador();
		int defensa = 0;
		int centrocampista = 0;
		int delantero = 0;
		boolean pasarAnilacion = false;
		int jugadores_total = 11;
		Plantilla plantilla = new Plantilla();
		double plata = 200;
		System.out.println("Bienvenido a Fantasy/biwinguer como tu le quieras llamar");
		System.out.println("Tiene 200 millones de €");
		System.out.println("Elige tu analación");
		while (pasarAnilacion == false) {
			System.out.println("1.4-4-2");
			System.out.println("2.4-3-3");
			System.out.println("3.4-5-1");
			int opcionPlantilla = leer.nextInt();

			if (opcionPlantilla == 1) {
				defensa = 4;
				centrocampista = 4;
				delantero = 2;
				pasarAnilacion = true;
			}

			else if (opcionPlantilla == 2) {
				defensa = 4;
				centrocampista = 3;
				delantero = 3;
				pasarAnilacion = true;
			}

			else if (opcionPlantilla == 3) {
				defensa = 4;
				centrocampista = 5;
				delantero = 1;
				pasarAnilacion = true;
			}

			else {
				System.out.println("No se han encontrado la plantilla intentalo otra vez");
			}
		}
		while (jugadores_total == 0 && defensa == 0 && centrocampista == 0 && delantero == 0) {
			System.out.println("Aqui tiene una lista de nuestros jugadores");
			List<Jugador> listaDeJugadores = Crud.getJugador();
			System.out.println("Elige a un jugador");
			System.out.println("Escribe su nombre");
			String nombre = leer.nextLine();
			System.out.println("Escribe su posicion");
			String posicion = leer.next();
			posicion.toLowerCase();

			if (posicion != null && !posicion.isEmpty()) {
				posicion = posicion.substring(0, 1).toUpperCase() + posicion.substring(1);
			}

			if (!(Crud.getJugadorByNameAndPosition(nombre, posicion) == null)) {
				System.out.println("El jugador no existe o ya seleccionado");
			} else {

				if (posicion == "Defensa") {

					List<Jugador> jugador_seleccionado = Crud.getJugadorByNameAndPosition(nombre, posicion);

					defensa--;
					jugadores_total--;
					Crud.deleteFromJugadores(nombre, posicion);
				}
			}

			Crud.deleteFromJugadores(nombre, posicion);

		}

		leer.close();
	}
}
