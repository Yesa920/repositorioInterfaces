package SegundaEvaluacion;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		Alumno alumno = new Alumno();

		Scanner leer = new Scanner(System.in);
		System.out.println("Dime el nombre del alumnos");
		String nombre = leer.next();

		System.out.println("Dime el primer apellido del alumnos");
		String apellido1 = leer.next();

		System.out.println("Dime el segundo apellido del alumnos");
		String apellido2 = leer.next();

		System.out.println("Dime el DNI del alumnos");
		String dni = leer.next();

		System.out.println("Dime el edad del alumnos");
		int edad = leer.nextInt();

		alumno.setNombre(nombre);
		alumno.setApellido1(apellido1);
		alumno.setApellido2(apellido2);
		alumno.setDni(dni);
		alumno.setEdad(edad);

		System.out.println(alumno.getNombre());
		System.out.println(alumno.getApellido1());
		System.out.println(alumno.getApellido2());
		System.out.println(alumno.getDni());
		System.out.println(alumno.getEdad());
	}

}
