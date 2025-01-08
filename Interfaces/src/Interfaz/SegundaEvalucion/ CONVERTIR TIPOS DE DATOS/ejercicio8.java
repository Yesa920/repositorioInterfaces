package Conversiones;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime tres notas y te hago la media");
		System.out.println("Ingresa un numero ");
		int numero = leer.nextInt();
		
		System.out.println("Ingresa otro numero ");
		int numero2 = leer.nextInt();
		
		System.out.println("Ingresa uno más numero ");
		int numero3 = leer.nextInt();
		
		
		double resultado = ((double) numero + (double) numero2 + (double) numero3)/3;
		
		
		System.out.println(resultado);
	}

}
