package SegundaEvaluacion;

public class Masajista extends Identificador {
	public int numeroColegiado;

	public Masajista() {

	}

	public Masajista(String nom, String NIF, int anho, int numCol) {
		super();
		this.numeroColegiado = numCol;
	}

	public int getNumeroColegiado() {
		return numeroColegiado;
	}

	public void setNumeroColegiado(int numCol) {
		this.numeroColegiado = numCol;
	}

}
