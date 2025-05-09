package com.example.accesoAFicheros;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeerArchivos {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime cuantas letras quieres que te pase en el fichero");
		int numero = leer.nextInt();
		Leer_Archivos notas = new Leer_Archivos();

		notas.leer(numero);
		leer.close();
	}

}

class Leer_Archivos {

	public void leer(int numero) {
		try {
			FileReader entrada = new FileReader("C:/Proyectos/Ejemplo.txt");

			int c = entrada.read();

			while (c != -1) {

				c = entrada.read();

				c = c + numero;

				char letra = (char) c;

				System.out.print(letra);

			}

			entrada.close();

		} catch (IOException e) {
			System.out.println("No se ha podido acceder al archivo");
		}

	}

}