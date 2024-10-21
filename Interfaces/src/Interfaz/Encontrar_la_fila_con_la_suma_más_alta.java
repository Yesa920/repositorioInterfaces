package Interfaz;

public class Encontrar_la_fila_con_la_suma_más_alta {
	public static void main (String [] args) {
		int [] [] numeros = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int FilaMasGrande=0;
		int FilaGrande = 0;
		int SumarFilas = 0;

		for(int i=0;i<numeros.length;i++) {
			for(int j=0;j<numeros.length;j++) {
					SumarFilas+=numeros[i][j]; 
					FilaGrande=i+1;
					}
			if(SumarFilas>FilaMasGrande) {
				FilaMasGrande = SumarFilas;
				FilaGrande = i+1;
			}
			
		}
		System.out.println("La fila " + FilaGrande +" tiene la suma más alta , que es "+FilaMasGrande);
		
	}
}
