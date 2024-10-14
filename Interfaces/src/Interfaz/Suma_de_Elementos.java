package Interfaz;

public class Suma_de_Elementos {
	public static void main (String [] args) {
		int[] numeros = new int[5];
		int resultado = 0;
		for(int i=0;i<numeros.length;i++) {
			resultado += i;
		}
		System.out.println("La suma de los numeros es " +resultado);
	}
	
}
