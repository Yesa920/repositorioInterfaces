package Hundir_la_flota;

import java.util.Scanner;

public class Juego {

	private Tablero tableroJugador;
	private Bot bot;

	public Juego() {
		tableroJugador = new Tablero();
		bot = new Bot();
	}

	public void iniciar() {
		Scanner leer = new Scanner(System.in);

		System.out.println(
				"Buenas bienvenio a hundir la flota o battleship .Este juego consiste en derribar los barcos del enemigo antes de que el enemigo derribe tus barcos."
						+ "Buena suerte");

		System.out.println("Coloca tus barcos:");
		System.out.println("Este tu tablero para que te hagas una ideaS");
		tableroJugador.mostrarTablero();
		colocarBarcosJugador();
		System.out.println("El bot está colocando sus barcos...");
		bot.colocarBarcos();

		boolean juegoActivo = true;
		while (juegoActivo) {

			System.out.println("Tu turno:");
			tableroJugador.mostrarTablero();
			realizarDisparoJugador();

			if (bot.getTablero().todosBarcosHundidos()) {
				System.out.println("¡Felicidades! ¡Has ganado!");
				juegoActivo = false;
				continue;
			}

			System.out.println("Turno del bot:");
			realizarDisparoBot();

			if (tableroJugador.todosBarcosHundidos()) {
				System.out.println("¡El bot ha ganado! Get better");
				juegoActivo = false;
			}
		}
	}

	private void colocarBarcosJugador() {
		Scanner leer = new Scanner(System.in);
		int contarBarcos = 0;
		int contarBarco2 = 0;
		int contarBarco3 = 0;
		int contarBarco4 = 0;
		int contarBarco5 = 0;
		while (contarBarcos < 7) {
			boolean suficientesBarcos = false;
			System.out.print("Ingrese fila (0-9): (El numero de la izquierda)");
			int fila = leer.nextInt();
			System.out.print("Ingrese columna (0-9): (El numero de arriba)");
			int columna = leer.nextInt();
			System.out.print(
					"Ingrese tamaño del barco: , recuerde que hay 3 barcos de 2 posiciones, 2 de 3 posiciones, 1 de 4 posiciones, 1 de 5 posiciones ");
			int tamano = leer.nextInt();
			switch (tamano) {
			case 2:
				if (contarBarco2 < 3) {
					System.out.println("Se ha colocado un barco de 2 posiciones");
					contarBarco2++;
					contarBarcos++;
				} else {
					System.out.println("Ya has colocado todos los barcos");
					suficientesBarcos = true;
				}
				break;
			case 3:
				if (contarBarco3 < 2) {
					System.out.println("Se ha colocado un barco de 3 posiciones");
					contarBarco3++;
					contarBarcos++;
				} else {
					System.out.println("Ya has colocado todos los barcos");
					suficientesBarcos = true;
				}
				break;
			case 4:
				if (contarBarco4 < 1) {
					System.out.println("Se ha colocado un barco de 4 posiciones");
					contarBarco4++;
					contarBarcos++;
				} else {
					System.out.println("Ya has colocado todos los barcos");
					suficientesBarcos = true;
				}
				break;
			case 5:
				if (contarBarco5 < 1) {
					System.out.println("Se ha colocado un barco de 5 posiciones");
					contarBarco5++;
					contarBarcos++;
				} else {
					System.out.println("Ya has colocado todos los barcos");
					suficientesBarcos = true;
				}
				break;
			default:
				System.out.println("No se ha encontrado el barco intentalo de nuevo");
			}

			if (suficientesBarcos == false) {
				System.out.print("Ingrese dirección (H para horizontal, V para vertical): ");
				char direccion = leer.next().toUpperCase().charAt(0); // ni idea vamos
				if (tableroJugador.colocarBarco(fila, columna, tamano, direccion)) {
					System.out.println("Barco colocado correctamente.");
					tableroJugador.mostrarTablero();
				} else {
					System.out.println("No se pudo colocar el barco. Verifique los datos e intente nuevamente.");
					switch (tamano) {
					case 2:
						contarBarco2--;
						contarBarcos--;
						break;
					case 3:
						contarBarco3--;
						contarBarcos--;
						break;
					case 4:
						contarBarco4--;
						contarBarcos--;
						break;
					case 5:
						contarBarco5--;
						contarBarcos--;
						break;
					}
				}
			} else {

			}
		}
	}

	private void realizarDisparoJugador() {
		Scanner leer = new Scanner(System.in);

		boolean disparoValido = false;
		while (!disparoValido) {
			System.out.println("Vale ya has puesto todos tu barcos , es el momento de dispara ataca");

			System.out.print("Introduce fila (0-9) (El numero de la izquierda): ");
			int fila = leer.nextInt();
			System.out.print("Introduce columna (0-9) (El numero de arriba): ");
			int columna = leer.nextInt();

			String resultado = bot.getTablero().disparar(fila, columna);
			System.out.println(resultado);

			if (fila == 23052006 && columna == 23052006) {

			}

			disparoValido = !resultado.equals("Ya disparaste aquí.");
		}
	}

	private void realizarDisparoBot() {
		int[] disparo = bot.realizarDisparo();
		String resultado = tableroJugador.disparar(disparo[0], disparo[1]);
		System.out.println("El bot disparó a (" + disparo[0] + ", " + disparo[1] + "): " + resultado);
	}
}