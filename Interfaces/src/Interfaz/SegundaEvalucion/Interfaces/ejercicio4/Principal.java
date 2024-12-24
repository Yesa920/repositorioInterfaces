package interfaces.ejercicios4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Operacion suma = (a, b) -> a + b;
	        Operacion resta = (a, b) -> a - b;
	        Operacion multiplicacion = (a, b) -> a * b;
	        Operacion division = (a, b) -> {
	            if (b == 0) {
	               System.err.println("No se puede dividir entre cero");
	            }
	            return a / b;
	        };

	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Buenas bienvenido a la calculadora seleccione una operación:");
	        System.out.println("1. Suma");
	        System.out.println("2. Resta");
	        System.out.println("3. Multiplicación");
	        System.out.println("4. División");
	        System.out.print("Opción: ");

	        int opcion = scanner.nextInt();

	        System.out.print("Ingrese el primer número: ");
	        double num1 = scanner.nextInt();
	        System.out.print("Ingrese el segundo número: ");
	        double num2 = scanner.nextInt();

	       
	        
	            Operacion operacionSeleccionada;
	            switch (opcion) {
	                case 1:
	                    operacionSeleccionada = suma;
	                    break;
	                case 2:
	                    operacionSeleccionada = resta;
	                    break;
	                case 3:
	                    operacionSeleccionada = multiplicacion;
	                    break;
	                case 4:
	                    operacionSeleccionada = division;
	                    break;
	                default:
	                    System.out.println("Opción inválida.");
	                    return;
	            }

	            double resultado = operacionSeleccionada.ejecutar(num1, num2);
	            System.out.println("El resultado es: " + resultado);
	        

	        scanner.close();
	    }
	}


