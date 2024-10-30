package Interfaz;

public class Corregir_Suma_de_Números_Pares_en_un_Rango {

	public static void main(String[] args) {

		System.out.println("Suma de números pares de 1 a 10: " + sumarPares(1, 10));
	}

	public static int sumarPares(int inicio, int fin) {
		int suma = 0;
		for (int i = inicio; i <= fin; i++) {
			if (i % 2 == 0) {
				suma += i;
			}
		}
		return suma;
	}
}
