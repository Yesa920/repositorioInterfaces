package Interfaz;
import java.util.Random;
import java.util.Scanner;

public class Juego_de_adivinanza_con_intentos_limitados {
	public static void main(String[]args) {
			 Random random = new Random();
			 int numeroAleatorio = random.nextInt(100) + 1;
			 
				
				int intentos = 5;
				boolean acierto = true;
				
		for(int i=1 ; i<=intentos; i++) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("Intenta adivinar el numero");
			String variable = scanner.nextLine();
			int numero = Integer.parseInt(variable);
			
//			 while(numero != numeroAleatorio) {
				 if(numero>numeroAleatorio){
					 System.out.println("El numero es más pequeño, lleva "+i+" intentos");
				 }
				 else if(numero<numeroAleatorio){
					 System.out.println("El numero es mayor, lleva "+i+" intentos");
				 }
				 else{
					 acierto = false;
					 break;
				 }
				
//			 }
			
				 
				
			}
		 if(acierto = false) {
			 System.out.println("Has adivinado el numero");

		 }
		 else {
			 System.out.println("Lo siento, espero que tengas mas suerte la proxima vez");
		 }
		 
		 System.out.println("El numero es " +numeroAleatorio);

	}
}
	
