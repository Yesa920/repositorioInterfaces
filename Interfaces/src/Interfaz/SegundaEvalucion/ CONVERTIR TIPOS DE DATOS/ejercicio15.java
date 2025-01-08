package Conversiones;

import java.util.Scanner;

public class ejercicio15 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa una numero largo más de 5 digitos ");
        Long num1Largo = scanner.nextLong();
        
        System.out.println("Ingresa una numero largo más de 5 digitos ");
        Long num2Largo = scanner.nextLong();
        
        System.out.println("Ahora elige estas opciones");
        System.out.println("Elige 1 para sumar");
        System.out.println("Elige 2 para restar");
        System.out.println("Elige 3 para multiplicar");
        System.out.println("Elige 4 para dividir");
        
        int opcion = scanner.nextInt();
        
        switch(opcion) {
        case 1:
        	double resultadoSuma = (double)num1Largo + (double)num2Largo;
        	System.out.println("El resultado de la suma es " +resultadoSuma);
        	break;
        case 2:
        	double resultadoResta = (double)num1Largo - (double)num2Largo;
        	System.out.println("El resultado de la resta es " +resultadoResta);
        	break;
        case 3:
        	double resultadoMultiplicacion = (double)num1Largo * (double)num2Largo;
        	System.out.println("El resultado de la resta es " +resultadoMultiplicacion);
        	break;
        case 4:
        	double resultadoDivision = (double)num1Largo / (double)num2Largo;
        	System.out.println("El resultado de la resta es " +resultadoDivision);
        	break;
        default: System.out.println("No has elegido bien la opcion");
        
        }
        scanner.close();
	}
}
