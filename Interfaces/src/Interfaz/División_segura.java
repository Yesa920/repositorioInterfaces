package Interfaz;

import java.util.Scanner;

public class División_segura {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime 2 numeros");
		System.out.println("Dime el primer numero");
		int a = scanner.nextInt();

		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Dime el segundo numero");
		int b = scanner1.nextInt();

		System.out.println("División: " + dividir(a, b));

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
