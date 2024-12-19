package examen;

public class Ejercicio_2 {

	public static void main(String[] args) {
		int[] numeros = { 3, 7, 2, 8, 4 };

		int minimo = numeros[0];

		int maximo = numeros[0];

		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > maximo) {
				maximo = numeros[i];
			}
			if (numeros[i] < minimo) {
				minimo = numeros[i];
			}
		}
		System.out.println("El numero más grande del array es " + maximo);
		System.out.println("El numero más pequeño del array es " + minimo);
	}

}
