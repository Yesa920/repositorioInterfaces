package Interfaz;

public class Promedio_de_los_Elementos {
	public static void main (String [] args) {
		int[] numeros = {87, 56,43, 7, 8, 32};
		int resultado = 0;
		for(int i=0;i<=numeros.length;i++) {
			resultado += numeros.length - 1 ;
		}
		System.out.println("La media de del array es "+resultado);
	}
}
