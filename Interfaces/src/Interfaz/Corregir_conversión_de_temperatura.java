package Interfaz;

public class Corregir_conversión_de_temperatura {
	public static void main(String[] args) {
		double celsius = 25;
		System.out.println(celsius + " grados Celsius son " + celsiusAFahrenheit(celsius) + " grados Fahrenheit.");
	}

	public static double celsiusAFahrenheit(double c) {
		return ((c * 9 / 5) + 32);

	}

}
