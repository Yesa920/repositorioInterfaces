package Interfaz;

import java.util.InputMismatchException;
import java.util.Scanner;

class EdadInvalidaException extends Exception {
	public EdadInvalidaException(String mensaje) {
		super(mensaje);
	}
}

public class Excepción_personalizada {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Dime tu edad:");
			int numero = scanner.nextInt();
			setEdad(numero);
		} catch (EdadInvalidaException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Error: La edad tiene que ser un número entero.");
		}
	}

	public static void setEdad(int edad) throws EdadInvalidaException {
		if (edad < 0) {
			throw new EdadInvalidaException("La edad no puede ser negativa.");
		}
	}
}
