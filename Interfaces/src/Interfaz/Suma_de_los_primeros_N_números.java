package Interfaz;
import java.util.Scanner;
public class Suma_de_los_primeros_N_números {
  public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dime un numero y te digo la suma de sus numeros primos");
		int numero = scan.nextInt();
		if(numero <0 ) {
			System.out.println("Dime un numero positivo");
		}
		else {
			int resultado = 0;
			for(int i=0;i<=numero;i++) {
				resultado += i;
			}
			System.out.println("La suma de los numeros primos de " + numero + " es de " + resultado);
		}
		
		
		}

}
