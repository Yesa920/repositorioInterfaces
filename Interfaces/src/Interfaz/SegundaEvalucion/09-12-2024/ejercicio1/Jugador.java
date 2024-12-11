package SegundaEvaluacion;

public class Jugador extends Identificador {

	public int dorsal;
	public String posicion;

	public Jugador() {

	}

	public Jugador(String nom, String NIF, int anho, int dor, String pos) {
		super();

		this.dorsal = dor;
		this.posicion = pos;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDordal(int dor) {
		this.dorsal = dor;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String pos) {
		this.posicion = pos;
	}

}
