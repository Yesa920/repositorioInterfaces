package Interfaz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Eliminar_elementos_por_valor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime un numero y el programa hace que elimine los elementos más pequeños");
		int numero = scanner.nextInt();

		ArrayList<Integer> numerosArray = new ArrayList<>();
		numerosArray.add(1);
		numerosArray.add(2);
		numerosArray.add(3);
		numerosArray.add(4);
		numerosArray.add(5);
		numerosArray.add(6);

		// Lo he sacado del chatgpt ya que me >6 asecas no me gustaba
		int maxNumero = Integer.MIN_VALUE;
		for (Integer numeroArrayMayor : numerosArray) {
			if (numeroArrayMayor > maxNumero) {
				maxNumero = numeroArrayMayor;
			}
		}

		if (numero > maxNumero) {
			System.out.println("El número " + numero + " está fuera de rango.");
		}

		HashMap<Integer, Integer> numerosMap = new HashMap<>();

		for (Integer numerito : numerosArray) {
			numerosMap.put(numerito, 1);

			if (numero > numerito) {
				numerosMap.remove(numerito);
			}
		}

		for (Integer resultado : numerosMap.keySet()) {
			System.out.println(resultado + "");
		}

	}

}
