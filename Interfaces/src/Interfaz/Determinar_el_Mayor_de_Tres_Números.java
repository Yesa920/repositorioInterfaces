package Interfaz;
import java.util.Scanner;
public class Determinar_el_Mayor_de_Tres_Números {
	public static void main (String[]args) {
		Scanner scanner1 = new Scanner(System.in);
		System.out.print("Dime tres numeros y te digo cual es el mayor de todos");
		System.out.print("Dime el primer numero");
		String variable1 = scanner1.nextLine();
		
		int numero1 = Integer.parseInt(variable1);
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("Dime el segundo numero");
		String variable2 = scanner2.nextLine();
		
		int numero2 = Integer.parseInt(variable2);

		Scanner scanner3 = new Scanner(System.in);
		System.out.print("Dime el tercer numero");
		String variable3 = scanner3.nextLine();
		
		int numero3 = Integer.parseInt(variable3);
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("El numero más grande es " + numero1);	
		}
		else if (numero2 > numero1 && numero2>numero3) {
			System.out.println("El numero más grande es " + numero2);
		}
		else if (numero3 > numero1 && numero2>numero1) {
			System.out.println("El numero más grande es " + numero3);
		}
		else if (numero2 == numero1 && numero3==numero2) {
			System.out.println("Los numeros son iguales");
		}
	}
}
