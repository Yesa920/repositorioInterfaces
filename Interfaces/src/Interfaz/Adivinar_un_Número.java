package Interfaz;
import java.util.Random;
import java.util.Scanner;
public class Adivinar_un_Número {
	public static void main(String[]args) {
		 Random random = new Random();
		 int numeroAleatorio = random.nextInt(100) + 1;
		 Scanner scanner = new Scanner(System.in);
			System.out.print("Intenta adivinar el numero");
			String variable = scanner.nextLine();
			
			int numero = Integer.parseInt(variable);
			
		 while(numero != numeroAleatorio) {
			 numero = scanner.nextInt();
			 if(numero>numeroAleatorio){
				 System.out.println("El numero es más pequeño");
			 }
			 else if(numero<numeroAleatorio){
				 System.out.println("El numero es más grande");
			 }
			 else{
				 System.out.println("Has adivinado");
			 }
			 
			 
		 }
		 scanner.close();
	}
}