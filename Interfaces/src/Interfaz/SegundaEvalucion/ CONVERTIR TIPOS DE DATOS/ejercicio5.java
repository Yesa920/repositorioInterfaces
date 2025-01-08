package Conversiones;

import java.util.Scanner;

public class ejercicio5 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa un valor: ");
        String input = scanner.nextLine();

        try {
            double numero = Double.parseDouble(input);
            System.out.println("El valor ingresado como número es: " + numero);
            System.out.println("El valor multiplicado por 10 es: " + (numero * 10));
        } catch (NumberFormatException e) {
       
            System.out.println("El valor ingresado no es un número válido.");
        }
	}
}
