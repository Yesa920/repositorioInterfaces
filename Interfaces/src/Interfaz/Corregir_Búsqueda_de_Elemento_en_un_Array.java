package Interfaz;

public class Corregir_Búsqueda_de_Elemento_en_un_Array {
	public static void main(String[] args) {
		int[] numeros = { 1, 2, 3, 4, 5 };
		int buscar = 3;
		System.out.println("¿El número está en el array? " + contiene(numeros, buscar));
	}

	public static boolean contiene(int[] arr, int valor) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == valor) {
				return true;
			}
		}
		return false;
	}

}
