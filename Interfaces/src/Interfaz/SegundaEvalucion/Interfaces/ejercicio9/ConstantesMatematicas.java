package interfaces.ejercicio9;

public interface ConstantesMatematicas {

	double e = 2.71828;
	
	public static double calcularAreaCirculo(double radio) {
		double resultado =Math.PI * radio * radio;
		return resultado;
	};
	
	public static double elevado(double x) {
		double resultado = e * x;
		return resultado;
	};
	
}
