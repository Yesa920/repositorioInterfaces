package Interfaz;
import java.util.Scanner;
public class Invertir_un_número {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa un número: ");
        int numero = scanner.nextInt();
        int reves = 0;

        while (numero != 0) {
            int digito = numero % 10; 
            reves = reves * 10 + digito; 
            numero /= 10; 
        }

        System.out.println("Número invertido: " + reves);
    }
}
