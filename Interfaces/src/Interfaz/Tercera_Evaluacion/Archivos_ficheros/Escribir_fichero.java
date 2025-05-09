package com.example.accesoAFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Escribir_fichero {

	public static void main(String[] args) {
		String ruta = "entrada.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
			String linea;
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
