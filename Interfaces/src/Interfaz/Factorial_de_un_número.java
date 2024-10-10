package Interfaz;

import java.util.Scanner;

public class Factorial_de_un_número {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dime un numero y el programa te dice cual es su factorial");
		int numero = scan.nextInt();
		
		int resultado = 1;
		
		for(int i=1;i<=numero;i++) {
			resultado = resultado * i;
			
		}
		System.out.println("El resultado de la factorial es " + resultado);
	}
}
