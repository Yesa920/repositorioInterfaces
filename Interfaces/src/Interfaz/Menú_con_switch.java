package Interfaz;

import java.util.Scanner;

public class Menú_con_switch {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Presiona 1 para una suma , presiona para una 2 resta, presiona 3 para multiplicar,"
				+ " presiona 4 para dividir y presiona 5 para salir");
		String variable = scanner.nextLine();
		
		int numero = Integer.parseInt(variable);
		
		switch(numero) {
		case 1:
			Scanner scanner1 = new Scanner(System.in);
			System.out.println("Dime el primer numero");
			
			String variable1 = scanner1.nextLine();
			
			int numero1 = Integer.parseInt(variable1);
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("Dime el sundo numero");
			
			String variable2 = scanner2.nextLine();
			
			int numero2 = Integer.parseInt(variable2);
			
			int resultado = numero1+numero2;
			
			System.out.println("La suma de tus numeros es "+ resultado);
			
			break;
		case 2:
			Scanner scanner12 = new Scanner(System.in);
			System.out.println("Dime el primer numero");
			
			String variable12 = scanner12.nextLine();
			
			int numero12 = Integer.parseInt(variable12);
			
			Scanner scanner22 = new Scanner(System.in);
			System.out.println("Dime el sundo numero");
			
			String variable22 = scanner22.nextLine();
			
			int numero22 = Integer.parseInt(variable22);
			
			int resultado2 = numero12-numero22;
			
			System.out.println("La resta de tus numeros es "+ resultado2);
			
			break;
		case 3:
			Scanner scanner13 = new Scanner(System.in);
			System.out.println("Dime el primer numero");
			String variable13 = scanner13.nextLine();
			
			int numero13 = Integer.parseInt(variable13);
			
			Scanner scanner23 = new Scanner(System.in);
			System.out.println("Dime el sundo numero");
			String variable23 = scanner23.nextLine();
			
			int numero23 = Integer.parseInt(variable23);
			
			int resultado3 = numero13*numero23;
			
			System.out.println("La multiplicación de tus numeros es "+ resultado3);
			
			break;
		case 4:
			Scanner scanner14 = new Scanner(System.in);
			System.out.println("Dime el primer numero");
			String variable14 = scanner14.nextLine();
			
			int numero14 = Integer.parseInt(variable14);
			
			Scanner scanner24 = new Scanner(System.in);
			System.out.println("Dime el sundo numero");
			
			String variable24 = scanner24.nextLine();
			
			int numero24 = Integer.parseInt(variable24);
			
			int resultado4 = numero14/numero24;
			
			System.out.println("La división de tus numeros es "+ resultado4);
			
			break;
		case 5:
			System.exit(0);
			break;
		}
	}
}
