package com.example.accesoAFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Escribir_fichero {

	public static void main(String[] args) {

		String[] nombres = { "Izan", "Luis", "Skiper", "PrimiRey" };

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("nombres.txt"))) {
			for (String nombre : nombres) {
				bw.write(nombre);
				bw.newLine();

			}
			System.out.println("La informacion ha sido escrita exitosamente");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error");
		}
	}

}
