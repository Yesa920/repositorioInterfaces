package interfaces.ejercicio9;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double radio = 5.0;
		double resultado = ConstantesMatematicas.calcularAreaCirculo(radio);
		System.out.println("El área del círculo con radio " + radio + " es: " + resultado);
		Scanner leer = new Scanner(System.in);
		 System.out.print("Ingrese un valor para x: ");
	        double x = leer.nextDouble();
	        double valorEx = Math.pow(ConstantesMatematicas.e, x);
	        System.out.println("El valor de e^" + x + " es: " + valorEx);

		
		 
	}

}
