package Interfaz;

import java.util.Scanner;

public class Sumar_los_números_entre_dos_valores {
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime 2 numero y el programa te dice la suma y la suma de sus numeros de todos los numeros");
		System.out.println("Dime el primer numero");
        int numero = scanner.nextInt();
        
        
        
        Scanner scanner1 = new Scanner(System.in);
		System.out.println("Dime el segundo numero");
        int numero1 = scanner1.nextInt();
        
        int inicio = Math.min(numero, numero1);
        int fin = Math.max(numero, numero1);
        int resultado = 0;
        for(int i=inicio;i<=fin;i++) {
        		resultado += i;
        	}
        System.out.println("el resultado es : " + resultado);
       }
        
}

