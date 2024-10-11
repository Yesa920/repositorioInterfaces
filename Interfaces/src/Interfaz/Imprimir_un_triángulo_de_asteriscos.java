package Interfaz;

import java.util.Scanner;

public class Imprimir_un_triángulo_de_asteriscos {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime un numero y el programa te hace un triangulo con * con los asteriscos que has puesto");
		int numero = scanner.nextInt();
		for(int i=0;i <= numero;i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}
}
