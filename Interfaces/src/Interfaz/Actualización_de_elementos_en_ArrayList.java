package Interfaz;

import java.util.ArrayList;
import java.util.Scanner;

public class Actualización_de_elementos_en_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> ListaDeNumeros = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime 10 numeros");
		for (int i = 0; i < 10; i++) {
			int numero = scanner.nextInt();
			ListaDeNumeros.add(numero);
		}
		for (Integer numeros : ListaDeNumeros) {
			System.out.print(numeros + " ");
		}
		boolean salirBucle = true;
		System.out.println(" ");
		System.out.println("¿Quieres cambiar algun numero?");
		String respuesta = scanner.next();
		while (salirBucle = true) {
			if (respuesta.equalsIgnoreCase("si")) {
				System.out.println("¿En que posición quieres  cambiarlo?");
				int cambio = scanner.nextInt();
				System.out.println("¿Cual numero quieres cambiar?");
				int cambio1 = scanner.nextInt();
				ListaDeNumeros.set(cambio, cambio1);

				System.out.println("Asi se quedaria la lista , ¿quieres cambiar algo más?");
				for (Integer numeros : ListaDeNumeros) {

					System.out.print(numeros + " ");
				}
				System.out.println("");
				System.out.println("¿Quieres cambiar más numeros?");
				String respuesta1 = scanner.next();
				if (respuesta1.equalsIgnoreCase("si")) {

				} else {

					salirBucle = false;
					break;
				}
			} else {
				salirBucle = false;
				break;
			}
		}
	}

}
