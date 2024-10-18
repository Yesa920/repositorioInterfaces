package Interfaz;

public class Rotación_de_un_Array {
	public static void main (String [] args) {
		int [] numeros = {1 , 2, 3 , 4 ,5};
		
        int ultimo = numeros[numeros.length - 1];  
        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];  
        }
        numeros[0] = ultimo;  

        
        System.out.println("El array final es :");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
		
        }
	}
}
