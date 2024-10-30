package Interfaz;

import java.util.ArrayList;
import java.util.Scanner;

public class Operaciones_básicas_con_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> ListaDeNombres = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime nombre y escriba fin para finalizar el bucle");
		while (true) {
			String nombre = scanner.nextLine();
			if (nombre.equalsIgnoreCase("fin")) {
				break;
			} else {
				ListaDeNombres.add(nombre);
			}
		}
		for (String resultado : ListaDeNombres) {
			System.out.println(resultado);
		}

		System.out.println("Quieres eliminar un nombre");
		String eliminar = scanner.nextLine();
		eliminar = eliminar.toLowerCase();
		if (eliminar.equalsIgnoreCase("si")) {
			System.out.println("Cual nombre quieres eliminar");
			String eliminarNombre = scanner.nextLine();
			while (true) {
				if (ListaDeNombres.contains(eliminarNombre)) {
					ListaDeNombres.remove(eliminarNombre);
					System.out.println("El nombre '" + eliminarNombre + "' ha sido eliminado.");
					System.out.println("¿Quiere eliminar más?");
					String respuesta = scanner.nextLine();
					if (respuesta.equalsIgnoreCase("si")) {
						for (String resultado : ListaDeNombres) {

						}
					} else {
						break;
					}
				} else {
					System.out.println("El nombre '" + eliminar + "' no se encuentra en la lista.");
					System.out.println("¿Quiere eliminar más?");
					String respuesta = scanner.nextLine();
					if (respuesta == "si") {
						for (String resultado : ListaDeNombres) {

						}
					} else {
						break;
					}
				}
			}
		} else {

		}
		for (String resultado : ListaDeNombres) {
			System.out.println(resultado);
		}
	}

}
