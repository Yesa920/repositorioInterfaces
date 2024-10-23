package Interfaz;
import java.util.Random;
import java.util.Scanner;
public class Adivinar_un_Número {
	public static void main(String[]args) {
		 Random random = new Random();
		 int numeroAleatorio = random.nextInt(100) + 1;
		 Scanner scanner = new Scanner(System.in);
			System.out.println("Intenta adivinar el numero");
		 for(int i=0; i<=200;i++) {	
			
			int numero = scanner.nextInt();
				
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
	
	}
}
