package Fantasy;

import java.util.Random;

public class Bot {
	private static Batalla jugador;
	private static double vidaRestanteDelBot;
	private int contarAtaqueBot = 0;

	public Bot(double vidaRestante) {
		this.vidaRestanteDelBot = vidaRestante;
		jugador = new Batalla(0);
	}

	public static double getVidaRestanteDelBot() {
		return vidaRestanteDelBot;
	}

	public static void setVidaRestanteDelBot(double vidaRestante) {
		vidaRestanteDelBot = vidaRestante;
	}

	public void botIniciar() {
	}

	double atacarDefenderCurarBot(Personaje arquero, Personaje mago, Personaje guerrero, Random random, Objeto vendas,
			Objeto botiquin, Objeto paracetamol, double dagnoDelJugador, int personajeDelBot,
			double vidaActualizadaJugador, double vidaDelJugador, int decisionBot, double vidaDelBot) {
		switch (decisionBot) {
		case 1:

			if (contarAtaqueBot == 0) {
				vidaActualizadaJugador = atacarBot(arquero, mago, guerrero, personajeDelBot, vidaDelJugador);
				contarAtaqueBot++;
			} else {
				vidaActualizadaJugador = atacarBot(arquero, mago, guerrero, personajeDelBot,
						jugador.getVidaDelJugadorRestante());
			}
			jugador.setVidaDelJugadorRestante(vidaActualizadaJugador);
			System.out.println("Tu vida restante es " + jugador.getVidaDelJugadorRestante());
			break;
		case 2:
			vidaDelBot = defenderBot(arquero, mago, guerrero, personajeDelBot, dagnoDelJugador,
					getVidaRestanteDelBot());
			setVidaRestanteDelBot(vidaDelBot);
			System.out.println("La vida del bot es " + getVidaRestanteDelBot());
			break;
		case 3:
			curarBot(random, vendas, botiquin, paracetamol, getVidaRestanteDelBot());
			break;
		}
		return vidaActualizadaJugador;
	}

	private static int atacarBot(Personaje arquero, Personaje mago, Personaje guerrero, int personajeDelBot,
			double vidaDelJugador) {
		Random random = new Random();
		int vidaNuevaJugador = 0;
		if (personajeDelBot == 1) {
			int dagnoArqueroBot = random.nextInt(5) + 1;
			vidaNuevaJugador = arquero.atacar(vidaDelJugador, dagnoArqueroBot);

		} else if (personajeDelBot == 2) {
			int dagnoMagoBot = random.nextInt(10) + 1;
			vidaNuevaJugador = mago.atacar(vidaDelJugador, dagnoMagoBot);
		} else if (personajeDelBot == 3) {
			int dagnoGuerreroBot = random.nextInt(15) + 1;
			vidaNuevaJugador = guerrero.atacar(vidaDelJugador, dagnoGuerreroBot);
		} else {
			System.out.println("¿Cómo has llegado aqui?");
		}

		return vidaNuevaJugador;
	}

	private static double defenderBot(Personaje arquero, Personaje mago, Personaje guerrero, int personajeJugador,
			double dagnoDelJugador, double vidaActualizadaDelBot) {
		if (personajeJugador == 1) {
			arquero.defender(vidaActualizadaDelBot, dagnoDelJugador);
		} else if (personajeJugador == 2) {
			mago.defender(vidaActualizadaDelBot, dagnoDelJugador);
		} else if (personajeJugador == 3) {
			guerrero.defender(vidaActualizadaDelBot, dagnoDelJugador);
		} else {
			System.out.println("¿Cómo has llegado aqui?");
		}
		System.out.println("El bot se ha defendido");
		return vidaActualizadaDelBot;
	}

	private static void curarBot(Random ramdon, Objeto vendas, Objeto botiquin, Objeto paracetamol,
			double vidaActualizadaBot) {
		boolean curado = false;
		System.out.println("El bot se esta curando");

		int curarseObjeto = ramdon.nextInt(3) + 1;
		switch (curarseObjeto) {
		case 1:
			if (paracetamol.unidades == 0) {
				System.out.println("Ya no te quedan más unidades");
				break;
			} else {
				System.out.println("Tu vida de ha actualizado de " + getVidaRestanteDelBot());
				vidaActualizadaBot = (int) (getVidaRestanteDelBot() + paracetamol.getVida());
				setVidaRestanteDelBot(vidaActualizadaBot);
				System.out.println("a " + getVidaRestanteDelBot());
				int actualizarUnidades = paracetamol.getUnidades() - 1;
				paracetamol.setUnidades(actualizarUnidades);
				curado = true;
			}
			break;
		case 2:
			if (botiquin.unidades == 0) {
				System.out.println("Ya no te quedan más unidades");
				break;
			} else {
				System.out.println("Tu vida de ha actualizado de " + getVidaRestanteDelBot());
				vidaActualizadaBot = (int) (getVidaRestanteDelBot() + botiquin.getVida());
				setVidaRestanteDelBot(vidaActualizadaBot);
				System.out.println("a " + getVidaRestanteDelBot());
				int actualizarUnidades = botiquin.getUnidades() - 1;
				botiquin.setUnidades(actualizarUnidades);
				curado = true;
			}
			break;
		case 3:
			if (vendas.unidades == 0) {
				System.out.println("Ya no te quedan más unidades");
				break;
			} else {
				System.out.println("Tu vida de ha actualizado de " + getVidaRestanteDelBot());
				vidaActualizadaBot = (int) (getVidaRestanteDelBot() + vendas.getVida());
				setVidaRestanteDelBot(vidaActualizadaBot);
				System.out.println("a " + getVidaRestanteDelBot());
				int actualizarUnidades = vendas.getUnidades() - 1;
				vendas.setUnidades(actualizarUnidades);
				curado = true;
			}
			break;
		default:
			System.out.println("Volver");
		}
	}

	static double obtenerVidaDeLosPersonajes(Personaje arquero, Personaje mago, Personaje guerrero,
			int eleccionDelPersonajeBot, double vidaActualDelEnemigo) {
		if (eleccionDelPersonajeBot == 1) {
			vidaActualDelEnemigo = arquero.getVida();
		} else if (eleccionDelPersonajeBot == 2) {
			vidaActualDelEnemigo = mago.getVida();
		} else if (eleccionDelPersonajeBot == 3) {
			vidaActualDelEnemigo = guerrero.getVida();
		}
		return vidaActualDelEnemigo;
	}

	int ElegirPersonajeBot(Random random, int eleccionDelPersonaje) {

		int opcion = random.nextInt(3) + 1;

		switch (opcion) {
		case 1:
			System.out.println("El bot ha elegido el:");
			System.out.println("Personaje elegido ARQUERO");
			eleccionDelPersonaje = 1;
			break;
		case 2:
			System.out.println("El bot ha elegido el:");
			System.out.println("Personaje elegido MAGO");
			eleccionDelPersonaje = 2;
			break;
		case 3:
			System.out.println("El bot ha elegido el:");
			System.out.println("Personaje elegido GUERRERO");
			eleccionDelPersonaje = 3;
			break;
		default:
			break;
		}
		return eleccionDelPersonaje;
	}
}
