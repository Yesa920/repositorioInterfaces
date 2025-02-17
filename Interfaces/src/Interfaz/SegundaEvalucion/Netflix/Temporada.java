package Netflix;

import java.util.List;

public class Temporada {
	private int numero;
	private int ango;
	private List<Capitulo> capitulo;

	public Temporada(int num, int an) {
		super();
		this.numero = num;
		this.ango = an;
	}

	public Temporada() {

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int num) {
		this.numero = num;
	}

	public int getAngo() {
		return ango;
	}

	public void setAngo(int an) {
		this.ango = an;
	}

}
