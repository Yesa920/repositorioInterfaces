package Interfaz;

import java.util.ArrayList;
import java.util.HashMap;

public class Verificar_si_hay_valores_duplicados {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(6);

		boolean HayRepetidos = false;

		HashMap<Integer, Integer> numerosMap = new HashMap<>();

		for (Integer numero : numeros) {
			if (numerosMap.containsKey(numero)) {

				numerosMap.put(numero, numerosMap.get(numero) + 1);

			} else {

				numerosMap.put(numero, 1);
			}
		}

		for (Integer cuenta : numerosMap.values()) {
			if (cuenta > 1) {
				HayRepetidos = true;
			}
		}

		if (HayRepetidos == true) {
			System.out.println("Hay numeros repetidos");
		} else {
			System.out.println("No hay numeros repetidos");
		}
	}
}
