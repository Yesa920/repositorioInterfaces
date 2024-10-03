package Interfaz;

public class Suma_de_los_Números_del_1_al_100 {
	public static void main(String[]args) {
		int resultado = 0;
		for(int i=0;i<=100;i++) {
			resultado += i;
		}
		System.out.println("La suma de los numeros es " +resultado);
	}
}
