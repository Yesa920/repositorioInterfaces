package Interfaz;
import java.util.Scanner;
public class Contador_de_vocales_en_una_cadena {
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dime una frase y te digo cuantas vocales tiene");
        String cadena = scanner.nextLine();
        int contador = 0;
        cadena = cadena.toLowerCase();
        for(int i=0;i<=cadena.length()-1;i++) {
        	char letra = cadena.charAt(i);
        	if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
        		contador ++;
        	}
        	else {
        		
        	}
        
        	
        }
        System.out.println("EL texto tiene "+contador+" vocales");
        
        
	}
}
