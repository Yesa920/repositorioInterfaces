package Interfaz;

import java.util.Scanner;

public class Número_de_dígitos_de_un_número {
	
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Dime un numero y el programa te dice cuantos digitos tiene ese numero");
		int numero = scan.nextInt();
		
		if(numero <0) {
			System.out.println("Dime un numero natural");
		}
		else {
			int resultado = 0;
			for(int i=1;i<=numero;) {
				numero = numero /10;
				resultado ++;
			}
			System.out.println("El numero tiene " + resultado + " digitos");
		}
		
	}
}
