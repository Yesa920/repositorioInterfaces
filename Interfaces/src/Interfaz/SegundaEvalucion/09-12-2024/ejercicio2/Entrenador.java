package SegundaEvaluacion;

public class Entrenador extends Identificador {
	public int idFederacion;

	public Entrenador() {
	}

	public Entrenador(String nom, String NIF, int anho, int idFed) {
		super();
		this.idFederacion = idFed;
	}

	public int getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(int idFed) {
		this.idFederacion = idFed;
	}

}
