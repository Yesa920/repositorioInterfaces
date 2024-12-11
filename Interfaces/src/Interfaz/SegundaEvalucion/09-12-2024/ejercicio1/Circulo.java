package Segunda_evaluacion.ejercicio1;

public class Circulo extends Figura {

	public Circulo() {
		super();
	}

	public double operacionPerimetroCirculo(int radio) {

		double resultado = (double) (2 * (Math.PI) * radio);

		return resultado;
	}

	public double operacionAreaCirculo(int radio) {

		double resultado = (double) ((Math.PI) * (radio * radio));
		return resultado;
	}
}
