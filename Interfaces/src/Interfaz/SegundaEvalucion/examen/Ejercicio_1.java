package examen;

import java.util.Scanner;

public class Ejercicio_1 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime un numero y te hace todos los numeros pares");
		int numero = leer.nextInt();
		int resultado = 0;
		for (int i = 1; i <= numero; i++) {
			if (i % 2 == 0) {
				resultado += i;
			}
		}
		System.out.println("La suma de numeros pares son " + resultado);

	}
}
