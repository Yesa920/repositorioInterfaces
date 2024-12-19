package examen;

import java.util.Scanner;

public class Ejercicio_3 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime un numero y el programa te dice que si es un numero primo");
		int numero = leer.nextInt();
		int contador = 0;
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				contador++;
			}
		}
		if (contador == 2) {
			System.out.println("El numero es primo");
		} else {
			System.out.println("El numero No es primo");
		}
	}

}
