package Hundir_la_flota;

import java.util.Scanner;

public class Juego {

	private Tablero tablero;

	public Juego() {
		tablero = new Tablero();

	}

	public void iniciar() {
		Scanner leer = new Scanner(System.in);
		int opcion = 0;
		while (opcion != 4) {
			mostrarMenu();
			opcion = leer.nextInt();
			switch (opcion) {
			case 1:
				colocarBarco();
				break;
			case 2:
				realizarDisparo();
				break;
			case 3:
				tablero.mostrarTablero();
				break;
			case 4:
				System.out.println("Saliendo del juego. ¡Adiós!");
				break;
			default:
				System.out.println("Opción no encontrada.Intentelo de nuevo");
			}
		}
	}

	private void mostrarMenu() {
		System.out.println("Menú:");
		System.out.println("1. Colocar barco todos los barcos");
		System.out.println("2. Realizar disparo");
		System.out.println("3. Mostrar tablero");
		System.out.println("4. Salir");
		System.out.print("Seleccione una opción: ");
	}

	private void colocarBarco() {
		Scanner leer = new Scanner(System.in);
		int contarBarcos = 0;
		int contarBarco2 = 0;
		int contarBarco3 = 0;
		int contarBarco4 = 0;
		int contarBarco5 = 0;
		while (contarBarcos < 7) {
			boolean suficientesBarcos = false;
			System.out.print("Ingrese fila (0-9): (El numero de arriba)");
			int fila = leer.nextInt();
			System.out.print("Ingrese columna (0-9): (El numero de la izquierda)");
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
				if (tablero.colocarBarco(fila, columna, tamano, direccion)) {
					System.out.println("Barco colocado correctamente.");
					tablero.mostrarTablero();
				} else {
					System.out.println("No se pudo colocar el barco. Verifique los datos e intente nuevamente.");
				}
			} else {

			}
		}
	}

	private void realizarDisparo() {
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese fila (0-9): ");
		int fila = leer.nextInt();
		System.out.print("Ingrese columna (0-9): ");
		int columna = leer.nextInt();

		System.out.println(tablero.disparar(fila, columna));
	}
}
