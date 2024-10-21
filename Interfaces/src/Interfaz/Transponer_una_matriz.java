package Interfaz;

public class Transponer_una_matriz {
	public static void main (String [] args) {
		int [] [] numeros= {
				{1,2,3},
				{4,5,6}
			
		};
		
		int fila = numeros.length;
        int columna = numeros[0].length;
		int [] [] Alreves = new int [columna][fila];
		for(int i=0;i<fila;i++) {
			for(int j=0;j<columna;j++) {
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
