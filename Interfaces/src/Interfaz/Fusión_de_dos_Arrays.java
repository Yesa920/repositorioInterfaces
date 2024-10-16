package Interfaz;

public class Fusión_de_dos_Arrays {
	public static void main (String [] args) {
		int [] numeros = { 87 , 54, 34};
		int [] numeros1 = {76 , 67 };
		
		int[] arrayFusionado = new int[numeros1.length + numeros.length];
		
		System.arraycopy(numeros, 0, arrayFusionado, 0, numeros.length);
		System.arraycopy(numeros1, 0, arrayFusionado, numeros.length, numeros1.length);

		  
		
		System.out.print("El nuevo arrray junto es: ");
        for (int i : arrayFusionado) {
            System.out.print(i + " ");
        }
	}
}
