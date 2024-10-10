package Interfaz;
import java.util.Scanner;
public class Suma_de_los_dígitos_de_un_número {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa un número entero: ");
        int numero = scanner.nextInt();
        int resultado = 0;
       

        while (numero > 0) {
            int digito = numero % 10;
            resultado += digito;
            numero /= 10; 
        }

        System.out.println("La suma de los dígitos es: " + resultado);
    }
}
