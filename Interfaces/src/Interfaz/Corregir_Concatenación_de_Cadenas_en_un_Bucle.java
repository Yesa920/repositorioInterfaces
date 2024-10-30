package Interfaz;

public class Corregir_Concatenación_de_Cadenas_en_un_Bucle {
	public static void main(String[] args) {
		String[] palabras = { "Java", "es", "divertido" };
		System.out.println("Resultado: " + concatenar(palabras));
	}

	public static String concatenar(String[] palabras) {
		String resultado = "";
		for (int i = 0; i < palabras.length; i++) {
			resultado += palabras[i] + " ";
		}
		return resultado.trim();
	}
}
