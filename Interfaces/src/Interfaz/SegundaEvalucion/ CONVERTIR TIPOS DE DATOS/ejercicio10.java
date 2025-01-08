package Conversiones;

import java.util.Scanner;

public class ejercicio10 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa un valor: ");
        String numero1 = scanner.nextLine();
        
		System.out.println("Ingresa un valor: ");
        String numero2 = scanner.nextLine();
        
        Integer numero1Int = Integer.parseInt(numero1);
        Integer numero2Int = Integer.parseInt(numero2);
        
        int resultado = numero1Int.compareTo(numero2Int);
        
        if (resultado > 0) {
            System.out.println("El primer número (" + numero1 + ") es mayor que el segundo número (" + numero2 + ").");
        } else if (resultado < 0) {
            System.out.println("El segundo número (" + numero2 + ") es mayor que el primer número (" + numero1 + ").");
        } else {
            System.out.println("Ambos números son iguales.");
        }
	}
}
