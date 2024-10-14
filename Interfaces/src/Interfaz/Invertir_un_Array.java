package Interfaz;

public class Invertir_un_Array {
	public static void main (String [] args) {
		int [] numeros = {4,5,6,7,8};
		int[] numerosInversos = new int[numeros.length];
		for(int i=0;i<numeros.length;i++) {
			numerosInversos[i] = numeros[numeros.length - 1 - i];
		}
		System.out.print("Array en orden inverso: ");
        for (int numero : numerosInversos) {
            System.out.print(numero + " ");
        }
	}
}
