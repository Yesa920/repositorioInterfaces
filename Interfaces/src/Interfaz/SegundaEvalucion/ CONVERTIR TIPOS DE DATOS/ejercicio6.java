package Conversiones;

import java.time.Year;
import java.util.Scanner;

public class ejercicio6 {
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa un valor: ");
        String input = scanner.nextLine();
        
        int valorDecimal =Integer.parseInt(input);
        
        int anioActual = Year.now().getValue();
        
        
        System.out.println(anioActual - valorDecimal);
        
	}
}
