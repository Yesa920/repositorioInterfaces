package Segunda_evaluacion.ejercicio1;

public class Triangulo extends Figura {
	public int lados;

	public Triangulo() {
		super();
	}

	public int operacionPerimetroTriangulo(int[] lados) {

		int resultado = lados[0] + lados[1] + lados[2];
		return resultado;
	}

	public double operacionAreaTriangulo(int base, int altura) {

		double resultado = (base * altura) / 2;
		return resultado;
	}

	public int getLados() {
		return lados;
	}

	public void setLados(int lad) {
		this.lados = lad;
	}
}
