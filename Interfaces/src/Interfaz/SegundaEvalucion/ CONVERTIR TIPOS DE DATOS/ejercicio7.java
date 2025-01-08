package Conversiones;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Esto es una division precisa , ingrese 2 numeros ");
		System.out.println("Ingresa un numero ");
        int numero = scanner.nextInt();

        System.out.println("Ingresa otro numero");
        int numero2 = scanner.nextInt();
        
        double resultado = (double)numero / (double) numero2;
        
        System.out.println(resultado);
        
	}

}
