package Interfaz;
import java.util.Scanner;
public class Promedio_de_una_serie_de_números {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime la cuantos numero quieres");
        int numero = scanner.nextInt();

        double suma = 0;

        for (int i = 0; i < numero; i++) {
            System.out.print("Dime el numero " + (i + 1) + ": ");
            double numero1 = scanner.nextDouble();
            suma += numero1;
        }

     
        double media = suma / numero;
        
        System.out.println("El promedio de los " + numero + " números ingresados es: " + media);

    
    }
		
}

