package Interfaz;

import java.util.ArrayList;
import java.util.Scanner;

public class Sumar_todos_los_elementos_de_un_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> ListaDeNumeros = new ArrayList<>();
		Scanner scanner = new Scanner (System.in); 
		System.out.println("Escribe todos los numeros y el programa te los sumas, escribe un numero negativo para salir");
		int resultado = 0;
		while(true) {
			int numero = scanner.nextInt();
			if(numero > 0) {
				ListaDeNumeros.add(numero);
			}
			else {
				break;
			}
		
		for(int i = 0 ; i<ListaDeNumeros.size();i++) {
			resultado += ListaDeNumeros.get(i);
		}

	
		}
		System.out.println("La suma del array list es " + resultado);
	}

}
