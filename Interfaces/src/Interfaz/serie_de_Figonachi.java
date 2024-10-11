package Interfaz;

import java.util.Scanner;

public class serie_de_Figonachi {
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Dime un numero y te digo su numero figonacci");
		int numero = scanner.nextInt();
		int numero2 = 0, numero3 = 1;
		for(int i= 1; i<=numero;i++) {
			System.out.println(numero2 + " ");
            int siguiente = numero2 + numero3;
            numero2 = numero3;
            numero3 = siguiente;
		}
	}
}
