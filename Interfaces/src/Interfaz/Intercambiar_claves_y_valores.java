package Interfaz;

import java.util.HashMap;

public class Intercambiar_claves_y_valores {

	public static void main(String[] args) {
		HashMap<String, Integer> numerosMap = new HashMap<>();
		numerosMap.put("Uno", 1);
		numerosMap.put("Dos", 2);
		numerosMap.put("Tres", 3);
		numerosMap.put("Cuatro", 4);
		numerosMap.put("Cinco", 5);
		numerosMap.put("Seis", 6);

		HashMap<Integer, String> numerosMapInverso = new HashMap<>();

		for (String letras : numerosMap.keySet()) {
			Integer numero = numerosMap.get(letras);
			numerosMapInverso.put(numero, letras);
		}

		System.out.println(numerosMapInverso);

	}

}
