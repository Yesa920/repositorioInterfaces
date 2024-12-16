package abstractas.ejercicio3;

import java.util.Scanner;

public class Principal {
	public static void main(String [] args) {
		Empleado empleado1 = new EmpleadoAsalariado("Carlos", 2000);
        Empleado empleado2 = new EmpleadoPorHora("María", 40, 15);


        System.out.println("Información del empleado 1:");
        empleado1.mostrarInfo();
        System.out.println("Salario: $" + empleado1.calcularSalario());

        System.out.println("\nInformación del empleado 2:");
        empleado2.mostrarInfo();
        System.out.println("Salario: $" + empleado2.calcularSalario());
    }

	
}
