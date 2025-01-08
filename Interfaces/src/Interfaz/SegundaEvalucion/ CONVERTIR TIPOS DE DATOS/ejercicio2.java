package Conversiones;

import java.util.Scanner;

public class ejercicio2 {
	public static void main (String [] args) {
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Bienvenido , el programa te va a calcular el area del triangulo");
		System.out.println("Dime la altura triangulo");
		
		int altura = leer.nextInt();
		
		System.out.println("Dime la base triangulo");
		
		int base = leer.nextInt();
		
		double resultado = ((double) altura * (double) base)/2;
		
		System.out.println("El resultado es "+resultado);
		
		
	}
}
