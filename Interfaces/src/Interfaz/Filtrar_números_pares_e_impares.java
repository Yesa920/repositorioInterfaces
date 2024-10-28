package Interfaz;

import java.util.ArrayList;
import java.util.Scanner;

public class Filtrar_números_pares_e_impares {

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
		ArrayList<Integer> ListaDeNumerosPares = new ArrayList<>();
		ArrayList<Integer> ListaDeNumerosImpares = new ArrayList<>();
		for(int i=0;i<ListaDeNumeros.size();i++) {
			if(ListaDeNumeros.get(i) % 2 == 0) {
				ListaDeNumerosPares.add(i);
			}
			else {
				ListaDeNumerosImpares.add(i);
			}
		}
		
		System.out.println("Numeros pares " + ListaDeNumerosPares);
		
		
		System.out.println("Los numeros pares");
		for(Integer numeros : ListaDeNumerosPares) {
			System.out.print(numeros + " ");
		}
		System.out.println("");
		System.out.println("Los numeros impares");
		for(Integer numeros : ListaDeNumerosImpares) {
			System.out.print(numeros + " ");
		}
		
		System.out.println("Numeros impares " + ListaDeNumerosImpares);
	}
	

}
