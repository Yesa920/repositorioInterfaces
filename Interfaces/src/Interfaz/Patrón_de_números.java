package Interfaz;
import java.util.Scanner;
public class Patrón_de_números {
	public static void main (String [] args) {
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Dime un numero y el programa te hace un triangulo con los numeros anteriores que has puesto");
			int numero = scanner.nextInt();
			
			for(int i=1;i <= numero;i++) {
				for(int j=1; j<=i; j++) {
					
					System.out.print(i + " ");
				}
				System.out.println("");
			}
			
		}
	}

