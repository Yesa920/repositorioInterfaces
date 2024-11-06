package Interfaz;

import java.util.ArrayList;
import java.util.HashMap;

public class Contar_la_frecuencia_de_palabras_en_una_lista​ {

	public static void main(String[] args) {
		ArrayList<String> listaArray = new ArrayList<>();
		listaArray.add("manzana");
		listaArray.add("naranja");
		listaArray.add("manzana");
		listaArray.add("platano");
		listaArray.add("platano");
		listaArray.add("manzana");

		HashMap<String, String> contarMap = new HashMap<>();

		for (String contarLetras : listaArray) {
			if (contarMap.containsKey(contarLetras)) {
				contarMap.put(contarLetras, contarMap.get(contarLetras) + 1);
			} else {
				contarMap.put(contarLetras + 1, contarLetras);
			}

			System.out.println(contarMap);

		}
	}
}
