package Interfaz;

import java.util.Scanner;

public class Contar_Dígitos_de_un_Número {
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dime un numero");
		String variable= scanner.nextLine();
		
		int numero = Integer.parseInt(variable);
		
		if(numero<0) {
			System.out.println("dime un numero pero positivo");
		}
		else {
			int i=0;
			while(numero>0) {
				numero/=10;
				i++;
			}
			System.out.println("El numero tiene " + i + " digitos");
		}
		
	}
}
