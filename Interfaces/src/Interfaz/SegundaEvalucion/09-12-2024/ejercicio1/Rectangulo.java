package Segunda_evaluacion.ejercicio1;

public class Rectangulo extends Figura {

	public Rectangulo() {
		super();
	}

	public int operacionPerimetroRectangulo(int[] lados) {

		int resultado = lados[0] + lados[1] + lados[2] + lados[3];
		return resultado;
	}

	public int operacionAreaRectangulo(int base, int altura) {

		int resultado = base * altura;
		return resultado;
	}
}
