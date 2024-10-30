package Interfaz;

public class Corregir_factorial {
	public static void main(String[] args) {
		int numero = 5;
		System.out.println("Factorial de " + numero + ": " + calcularFactorial(numero));
	}

	public static int calcularFactorial(int n) {
		int resultado = 1;
		for (int i = 1; i <= n; i++) {
			resultado *= i;
		}
		return resultado;
	}

}
