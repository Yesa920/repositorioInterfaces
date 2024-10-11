package Interfaz;

import java.util.Scanner;

public class Número_perfecto {
	public static void main (String [] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Dime un numero y el programa te adivina");
		int numero = scanner.nextInt();

	     int resultado = 0;

	      for (int i = 1; i <= numero / 2; i++) {
	            if (numero % i == 0) {
	                resultado += i;
	                
	            }
	            
	        } 
	      if (resultado == numero) {
	            System.out.println(numero + " es un número perfecto.");
	        } else {
	            System.out.println(numero + " no es un número perfecto.");
	        }
	     
	   		
	    
	
		
		
		
	}
}
