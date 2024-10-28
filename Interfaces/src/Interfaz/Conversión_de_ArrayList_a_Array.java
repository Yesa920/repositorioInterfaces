package Interfaz;
import java.util.Random;
import java.util.ArrayList;
public class Conversión_de_ArrayList_a_Array {
	public static void main (String [] args) {
		
		ArrayList<Integer> ListaDeNumeros = new ArrayList<>();
		for(int i=0; i<10 ; i++) {
			Random random = new Random();
			int numeroAleatorio = random.nextInt(100) + 1;
			ListaDeNumeros.add(numeroAleatorio);
		}
		
		for(Integer numeros : ListaDeNumeros) {
			System.out.print(numeros + " ");
		}
	}
}
