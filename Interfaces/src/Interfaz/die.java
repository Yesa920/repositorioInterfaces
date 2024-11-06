package Interfaz;

import java.util.ArrayList;
import java.util.HashMap;

public class die {

	public static void main(String[] args) {
		ArrayList<String> listaArray = new ArrayList<>();
		listaArray.add("manzana");
		listaArray.add("naranja");
		listaArray.add("manzana");
		listaArray.add("platano");
		listaArray.add("platano");
		listaArray.add("manzana");

		HashMap<String, Integer> contarMap = new HashMap<>();

		for (String contarLetras : listaArray) {
			if (contarMap.containsKey(contarLetras)) {
				contarMap.put(contarLetras, contarMap.get(contarLetras) + 1);
			} else {
				contarMap.put(contarLetras, 1);
			}

		}
		System.out.println("Frecuencia de palabras:" + contarMap);
	}
}
