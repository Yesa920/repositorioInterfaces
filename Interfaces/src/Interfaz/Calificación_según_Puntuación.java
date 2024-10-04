package Interfaz;

import java.util.Scanner;

public class Calificación_según_Puntuación {
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime tu nota y el programa te dice que letra has sacado");
		String variable = scanner.nextLine();
		
		int numero = Integer.parseInt(variable);
		
		if(numero > 100) {
			System.out.println("Esa nota no existe escribela nuevamente");
		}
		else if (numero  >= 90) {
			System.out.println("Tu puntuación es A");
		}
		else if (numero  >= 80) {
			System.out.println("Tu puntuación es B");
		}
		else if (numero  >= 70) {
			System.out.println("Tu puntuación es C");
		}
		else if (numero  >= 60) {
			System.out.println("Tu puntuación es D");
		}
		else{
			System.out.println("Tu puntuación es F");
		}
	}
	
}
