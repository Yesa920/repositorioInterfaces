package Fantasy;

public class Arquero extends Personaje {

	public Arquero() {

	}

	public Arquero(double e, double d, int agil) {
		super(e, d, agil);
	}

	@Override
	protected int atacar(double vidaDelEnemigo, int dagnoDelArquero) {
		System.out.println("El arquero ha hecho " + dagnoDelArquero + " de daño");
		vidaDelEnemigo = vidaDelEnemigo - dagnoDelArquero;
		return (int) vidaDelEnemigo;

	}

	@Override
	protected int defender(double vidaActual, double dagnoDelBot) {
		int resultadoFinal = (int) ((dagnoDelBot / 2) * defensa);
		vidaActual = vidaActual - resultadoFinal;
		return (int) vidaActual;
	}

}
