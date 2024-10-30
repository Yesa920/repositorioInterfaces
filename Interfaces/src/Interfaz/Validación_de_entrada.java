package Interfaz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validación_de_entrada {

	public static void main(String[] args) {

		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Dime un numero natural");
			int numero = scanner.nextInt();
			if (numero < 0) {
				{
					System.err.println("No has escrito un numero natural");
				}

			}
		} catch (InputMismatchException i) {
			System.err.println("No has escrito un numero natural");
		}
	}

}
