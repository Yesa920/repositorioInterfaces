package Conversiones;

import java.util.Scanner;

public class ejercicio3 {
	public static void main (String [] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime un decimal y lo paso a entero");
		double numero = leer.nextDouble();
		
		int numeroEntero = (int) numero;
	
		System.out.println("Numero ingresado " +numero);
		
		System.out.println("Numero con decimales " +numeroEntero);
	
	}
}

