package Interfaz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Múltiples_excepciones {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Dime 2 numeros");
			System.out.println("Dime el primer numero");
			int a = scanner.nextInt();

			Scanner scanner1 = new Scanner(System.in);
			System.out.println("Dime el segundo numero");
			int b = scanner1.nextInt();

			System.out.println("División: " + dividir(a, b));
		} catch (InputMismatchException i) {
			System.err.println("El dividendo o el divisor tiene decimales");
		}
	}

	public static int dividir(int x, int y) {

		try {
			return x / y;
		} catch (ArithmeticException e) {
			System.err.println("No se puede dividir entre 0");
			return 0;
		}

	}

}
