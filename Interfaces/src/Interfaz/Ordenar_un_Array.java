package Interfaz;
import java.util.Arrays;
import java.util.Random;
public class Ordenar_un_Array {
	public static void main (String [] args) {
		 int[] numeros = new int[10];

	        Random rand = new Random();
	        for (int i = 0; i < numeros.length; i++) {
	            numeros[i] = rand.nextInt(101); 
	        }
	        Arrays.sort(numeros);
	        System.out.println("Array ordenado: " + Arrays.toString(numeros));
	}
}
