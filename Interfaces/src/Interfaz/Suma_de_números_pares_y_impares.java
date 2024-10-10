package Interfaz;
import java.util.Scanner;
public class Suma_de_números_pares_y_impares {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int pares = 0;
	        int impares = 0;

	        System.out.println("Dime 10 numero y el programa te da la suma de los numero pares e impares separados:");

	        for (int i = 0; i < 10; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            int numero = scanner.nextInt();

	            if (numero % 2 == 0) {
	                pares += numero;
	            } else {
	                impares += numero;
	            }
	        }

	        System.out.println("Suma de números pares: " + pares);
	        System.out.println("Suma de números impares: " + impares);
	    }
}
