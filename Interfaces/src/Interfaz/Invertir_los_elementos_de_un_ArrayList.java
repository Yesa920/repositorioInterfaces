package Interfaz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Invertir_los_elementos_de_un_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> ListaDeNumeros = new ArrayList<>();
		Scanner scanner = new Scanner (System.in); 
		System.out.println("Escribe todos los numeros y el programa los invierte, escribe un numero negativo para salir");
		while(true) {
			int numero = scanner.nextInt();
			if(numero > 0) {
				ListaDeNumeros.add(numero);
			}
			else {
				break;
			}
		
	}
			System.out.println("Antes");
			for(Integer numeros : ListaDeNumeros) {
			
			System.out.print(numeros + " ");
			}
			System.out.println("");
			Collections.reverse(ListaDeNumeros);
			System.out.println("Despues");
			for(Integer numeros : ListaDeNumeros) {
				
				System.out.print(numeros + " ");
			}
	}
}
