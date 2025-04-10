package com.example.bbddConnector;

import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		boolean quieresSeguir = false;
		List<Comida> comida = Crud.getComida();
		while (quieresSeguir == false) {

			System.out.println("Elige una de las siguientes opciones");
			System.out.println("1. Buscar por el nombre de una comida");
			System.out.println("2. Buscar por el nombre por pais");
			System.out.println("3. Buscar por lo más popular");
			System.out.println("4. Buscar por codigo QR");
			int buscarComida = leer.nextInt();

			switch (buscarComida) {

			case 1:
				System.out.println("Busca la comida que quieres");
				String buscaPorNombre = leer.nextLine();
				break;
			case 2:
				System.out.println("Busca la comida que quieres");
				String buscaPorPais = leer.nextLine();
				break;
			case 3:
				for (Comida c : comida) {
					System.out.println(c.getNombre());
					System.out.println(c.getPais());
					System.out.println(c.getEnergia());
					System.out.println(c.getAzucar());
					System.out.println(c.getGrasas_saturadas());
					System.out.println(c.getSal());
					System.out.println(c.getProteinas());
					System.out.println("\n");
				}
				break;
			case 4:
				break;
			default:
				System.out.println("Opcion no encontrada porfavor introduzca la opcion nuevamente");

			}

			System.out.println("¿Quieres buscar otra cosa?");
			String buscarMas = leer.nextLine();
			if (buscarMas.equalsIgnoreCase("si")) {

			} else {
				quieresSeguir = true;
			}

		}

	}
}
