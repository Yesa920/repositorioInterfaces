package Interfaz;

import java.util.Scanner;

public class Tabla_de_Multiplicar {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dime un numero");
		String variable= scanner.nextLine();
		
		int numero = Integer.parseInt(variable);
		
		for(int i=1;i<11;i++) {
			int resultado = numero*i;
			System.out.println(numero +" x "+ i +" = " +resultado);
		}
	}
}
