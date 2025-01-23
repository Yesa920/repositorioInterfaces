package Hundir_la_flota;

import java.util.Scanner;

public class Juego {
	
	 private Tablero tablero;

	    public Juego() {
	        tablero = new Tablero();
	       
	    }

	    public void iniciar() {
	    	Scanner leer = new Scanner(System.in);
	    	int opcion = 0;
	        while(opcion != 4) {
	            mostrarMenu();
	            opcion = leer.nextInt();
	            switch (opcion) {
	                case 1:
	                    colocarBarco();
	                    break;
	                case 2:
	                    realizarDisparo();
	                    break;
	                case 3:
	                    tablero.mostrarTablero();
	                    break;
	                case 4:
	                    System.out.println("Saliendo del juego. ¡Adiós!");
	                    break;
	                default:
	                    System.out.println("Opción no encontrada.Intentelo de nuevo");
	            }
	        }
	    }

	    private void mostrarMenu() {
	        System.out.println("Menú:");
	        System.out.println("1. Colocar barco");
	        System.out.println("2. Realizar disparo");
	        System.out.println("3. Mostrar tablero");
	        System.out.println("4. Salir");
	        System.out.print("Seleccione una opción: ");
	    }
	    private void colocarBarco() {
	    	Scanner leer = new Scanner(System.in);
	        System.out.print("Ingrese fila (0-9): ");
	        int fila = leer.nextInt();
	        System.out.print("Ingrese columna (0-9): ");
	        int columna = leer.nextInt();
	        System.out.print("Ingrese tamaño del barco: ");
	        int tamano = leer.nextInt();
	        System.out.print("Ingrese dirección (H para horizontal, V para vertical): ");
	        char direccion = leer.next().toUpperCase().charAt(0); // ni idea vamos

	        if (tablero.colocarBarco(fila, columna, tamano, direccion)) {
	            System.out.println("Barco colocado correctamente.");
	        } else {
	            System.out.println("No se pudo colocar el barco. Verifique los datos e intente nuevamente.");
	        }
	        
	    }
	    private void realizarDisparo() {
	    	Scanner leer = new Scanner(System.in);
	        System.out.print("Ingrese fila (0-9): ");
	        int fila = leer.nextInt();
	        System.out.print("Ingrese columna (0-9): ");
	        int columna = leer.nextInt();

	        System.out.println(tablero.disparar(fila, columna));
	    }
	
}
