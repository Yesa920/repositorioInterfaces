package Fantasy;

public class Guerrero extends Personaje {

	public Guerrero() {

	}

	public Guerrero(double vid, double d, int agil) {
		super(vid, d, agil);
	}

	@Override
	protected int atacar(double vidaDelEnemigo, int dagnoDelGuerrero) {
		double resultadoDagnoDelGuerrero = (double) dagnoDelGuerrero * 1.2;
		System.out.println("El guerrero ha hecho " + resultadoDagnoDelGuerrero + " de daño");
		vidaDelEnemigo = vidaDelEnemigo - dagnoDelGuerrero;
		return (int) vidaDelEnemigo;
	}

	@Override
	protected int defender(double dagnoDelBot, double vidaActual) {
		int resultadoFinal = (int) ((dagnoDelBot / 2) * defensa);
		vidaActual = vidaActual - resultadoFinal;
		return (int) vidaActual;
	}

}
