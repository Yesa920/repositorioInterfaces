package abstractas.ejercicio4;

import java.util.Scanner;

public class Principal {
	public static void main(String [] args) {
		Figura[] figuras = new Figura[] {
	            new Circulo(5),
	            new Rectangulo(4, 7),
	            new Triangulo(3, 4, 5, 7 ,6)
	        };

	        for (Figura figura : figuras) {
	            System.out.println("Figura: " + figura.getClass().getSimpleName());
	            System.out.println("Área: " +  figura.calcularArea());
	            System.out.println("Perímetro: " + figura.calcularPerimetro());
	            System.out.println();
	        }
	    }

	}

	

