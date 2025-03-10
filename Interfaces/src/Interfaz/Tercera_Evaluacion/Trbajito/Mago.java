package Fantasy;

public class Mago extends Personaje {

	public Mago() {

	}

	public Mago(double vid, double d, int agil) {
		super(vid, d, agil);

	}

	@Override
	protected int atacar(double vidaDelEnemigo, int dagnoDelMago) {
		double resultadoDagnoDelMago = (double) dagnoDelMago * 1.2;
		System.out.println("El mago ha hecho " + resultadoDagnoDelMago + " de daño");
		vidaDelEnemigo = vidaDelEnemigo - dagnoDelMago;
		return (int) vidaDelEnemigo;
	}

	@Override
	protected int defender(double dagnoDelBot, double vidaActual) {
		int resultadoFinal = (int) ((dagnoDelBot / 2) * defensa);
		vidaActual = vidaActual - resultadoFinal;
		return (int) vidaActual;
	}

}
