package Interfaz;
import java.util.Scanner;
public class Par_impar {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dime un numero y el programa te dice si es par o impar ");
		
		String variable1 = scanner.nextLine();
		
		int numero = Integer.parseInt(variable1);
		
		
		if(numero % 2 == 0) {
			System.out.println("El numero es par");
		}
		else {
			System.out.println("El numero es impar");
		}
		
	}
}
