package Interfaz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ordenar_un_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> ListaDeNumeros = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime numeros y el programa te los ordena");

		while (true) {
			int numero = scanner.nextInt();
			if (numero > 0) {
				ListaDeNumeros.add(numero);
			} else {
				break;
			}

		}
		Collections.sort(ListaDeNumeros);

		for (Integer numeros : ListaDeNumeros) {
			System.out.print(numeros + " ");
		}

	}
}
