package Conversiones;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa dolares y los paso a euros ");
        String dolares = scanner.nextLine();
        
        double dolaresInt= Integer.parseInt(dolares);
        
        double euros = dolaresInt * 0.97;
        
        System.out.println(euros);

	}

}
