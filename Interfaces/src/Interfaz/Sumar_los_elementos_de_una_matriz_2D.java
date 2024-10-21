package Interfaz;

public class Sumar_los_elementos_de_una_matriz_2D {
	public static void main(String [] args) {
		int [] []numeros = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		
		};
		int resultado=0;
		for(int i=0;i<=numeros.length - 1;i++) {
			for(int j=0;j<=numeros.length -1 ;j++) {
				resultado+=numeros[i][j];
			}
		}
		System.out.println("El resultado de la raid es " +resultado);
	}
}

