package Interfaz;

import java.util.ArrayList;
import java.util.Scanner;

public class Buscar_en_un_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> ListaDeNumeros = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime 10 numeros");
		for (int i = 1; i <= 10; i++) {
			int numero = scanner.nextInt();
			ListaDeNumeros.add(numero);

		}
		for (Integer numeros : ListaDeNumeros) {
			System.out.print(numeros + " ");
		}

		System.out.println("¿Quieres buscar un numero?");
		String siono1 = scanner.next();
		if (siono1.equalsIgnoreCase("si")) {
			System.out.println("¿Cual numero quieres buscar?");
			int numeroComprobar = scanner.nextInt();
			if (ListaDeNumeros.contains(numeroComprobar)) {
				int indice = ListaDeNumeros.indexOf(numeroComprobar);
				System.out.println("El numero esta en " + numeroComprobar + " en el indice " + indice);
			} else {
				System.out.println("Perdon no esta el numero");
			}

			System.out.println("¿Quiere buscar más numeros?");
			String resultado1 = scanner.next();
			if (resultado1.equalsIgnoreCase("si")) {
				System.out.println("¿Cual quiere buscar?");
				int buscar = scanner.nextInt();
				int resultado2 = ListaDeNumeros.indexOf(buscar);
				if (ListaDeNumeros.contains(buscar)) {
					System.out.println("El numero esta en " + buscar + " en el indice " + resultado2);
				} else {
					System.out.println("Perdon esta el numero");
				}
			}

		}
	}
}
