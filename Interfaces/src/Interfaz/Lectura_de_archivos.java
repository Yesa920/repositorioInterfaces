package Interfaz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Lectura_de_archivos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce el nombre del archivo a leer: ");
		String nombreArchivo = scanner.nextLine();

		try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
			String linea;
			System.out.println("Contenido del archivo:");
			while ((linea = lector.readLine()) != null) {
				System.out.println(linea);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: El archivo '" + nombreArchivo + "' no existe.");
		} catch (IOException e) {
			System.out.println("Error: Ocurrió un problema al leer el archivo.");
			e.printStackTrace(); // Para detalles del error en caso de depuración
		}
	}
}
