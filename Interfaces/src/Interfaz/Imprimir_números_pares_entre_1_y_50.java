package Interfaz;

public class Imprimir_números_pares_entre_1_y_50 {
	public static void main (String [] args) {
		int numero = 1;
		for(int i=1;i<=50;i++) {
			if(i % 2 == 0) {
				numero = i;
				System.out.println("Los numeros pares del 1 al 50 son :" + numero);
			}
			else {
				
			}
			
		}
	}
}
