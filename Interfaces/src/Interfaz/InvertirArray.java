package Interfaz;

public class InvertirArray {
	 public static void main(String[] args) {
	        // Crear un array de 5 números enteros
	        int[] numeros = {1, 2, 3, 4, 5};

	        // Crear un nuevo array para los números en orden inverso
	        int[] numerosInversos = new int[numeros.length];

	        // Llenar el array inverso
	        for (int i = 0; i < numeros.length; i++) {
	            numerosInversos[i] = numeros[numeros.length - 1 - i];
	        }

	        // Imprimir el nuevo array en orden inverso
	        System.out.print("Array en orden inverso: ");
	        for (int numero : numerosInversos) {
	            System.out.print(numero + " ");
	        }
	    }
}
