package Interfaz;

public class TRansportar_una_matriz_cuadrada {
	public static void main (String [] args) {
		int [] [] numeros= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int [] [] Alreves = new int [numeros.length][numeros.length];
		for(int i=0;i< numeros.length;i++) {
			for(int j=0;j<numeros[i].length;j++) {
			Alreves[j][i]=numeros[i][j];
				
			}
		}	
		for (int [] filas : Alreves) {
            for (int valor : filas) {
                System.out.print(valor + " ");
            }
            System.out.println();
		}
	}
}