package Interfaz;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Eliminar_elementos_duplicados_en_un_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> ListaDeNumeros = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Dime numeros y el programa si detecta que un numero es repetido lo elimina, escriba un numero negativo para salir");
		while (true) {
			int numero = scanner.nextInt();
			if (numero > 0) {
				ListaDeNumeros.add(numero);
			} else {
				break;
			}
			LinkedHashSet<Integer> sinDuplicados = new LinkedHashSet<>(ListaDeNumeros);
			ListaDeNumeros.clear();
			ListaDeNumeros.addAll(sinDuplicados);

		}
		for (Integer numeros : ListaDeNumeros) {
			System.out.println(numeros + " ");

		}

	}

}
