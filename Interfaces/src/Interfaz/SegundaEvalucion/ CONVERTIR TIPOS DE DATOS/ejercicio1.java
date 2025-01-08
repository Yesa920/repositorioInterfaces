package Conversiones;

import java.util.Scanner;

public class ejercicio1 {
	public static void main (String [] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime un numero y lo paso a decimal");
		int numero = leer.nextInt();
		
		double numeroDecimales = (double) numero;
	
		System.out.println("Numero ingresado " +numero);
		
		System.out.println("Numero con decimales " +numeroDecimales);
	
	}
}
