package interfaces.ejercicio8;

public interface Conversor {

	public abstract double convertir(double valor);
	public static double convertirMetrosACentimetros(double metros) {
		double resultado = metros * 100;
		return resultado;
	} 
}
