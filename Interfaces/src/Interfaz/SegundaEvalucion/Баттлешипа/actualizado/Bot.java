package Hundir_la_flota;

import java.util.Random;

public class Bot {
	private Random random = new Random();

	private Tablero tablero;

	public Bot() {
		tablero = new Tablero();
		random = new Random();
	}

	public Tablero getTablero() {
		return tablero;
	}

	public void colocarBarcos() {
		int[] tamanosBarcos = { 5, 4, 3, 3, 2, 2, 2 };

		for (int tamano : tamanosBarcos) {
			boolean colocado = false;

			while (!colocado) {
				int fila = random.nextInt(10);
				int columna = random.nextInt(10);
				char direccion;
				if (random.nextBoolean()) {
					direccion = 'H';
				} else {
					direccion = 'V';
				}

				colocado = tablero.colocarBarco(fila, columna, tamano, direccion);
			}
		}
	}

	public int[] realizarDisparo() {
		int fila = 0, columna = 0;
		while (!esValidoDisparo(fila, columna)) {
			fila = random.nextInt(10);
			columna = random.nextInt(10);
		}

		return new int[] { fila, columna };
	}

	private boolean esValidoDisparo(int fila, int columna) {
		char celda = tablero.getTablero()[fila][columna];
		return celda != '-' && celda != 'X';
	}
}
