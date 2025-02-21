package Fantasy;

import java.util.Random;
import java.util.Scanner;

public class Bot {
	private static Principal jugador;

	public void botIniciar() {
		Scanner leer = new Scanner(System.in);
		Personaje arquero = new Arquero(100.0, 0.2, 1);
		Personaje mago = new Mago(70.0, 0.8, 1);
		Personaje guerrero = new Guerrero(70.0, 1.2, 1);
		Random random = new Random();
		Objeto vendas = new Objeto("Vendas", 25, 1);
		Objeto botiquin = new Objeto("Botiquin", 50, 1);
		Objeto paracetamol = new Objeto("Paracetamol", 5, 1);
		int decisionPersonaje = random.nextInt(3) + 1;
		int eleccionDelPersonaje = 0;
		double dagnoDelBot = 0;
		double vidaActual = 0;

		jugador = new Principal();

		int personajeDelBot = ElegirPersonajeBot(random, eleccionDelPersonaje);
		double vidaActualizadaBot = obtenerVidaDeLosPersonajes(arquero, mago, guerrero, personajeDelBot, vidaActual);

		int personajeJugador = jugador.elegirPersonaje(leer, eleccionDelPersonaje);
		int dagnoJugador = jugador.atacarDagnoJugador(personajeJugador);
		double vidaDelEnemigo = jugador.obtenerVidaDeLosPersonajes(arquero, mago, guerrero, personajeJugador,
				vidaActual);

		int decisionAtaque = random.nextInt(3) + 1;

		switch (decisionAtaque) {
		case 1:
			vidaActualizadaBot = atacarBot(arquero, mago, guerrero, personajeDelBot, vidaDelEnemigo);
			break;
		case 2:
			defenderBot(arquero, mago, guerrero, personajeDelBot, dagnoDelBot, vidaActualizadaBot);
			break;
		case 3:
			curarBot(random, vendas, botiquin, paracetamol, vidaActualizadaBot);
			break;
		}

	}

	private static int atacarBot(Personaje arquero, Personaje mago, Personaje guerrero, int personajeDelBot,
			double vidaDelEnemigo) {
		Random random = new Random();
		int vidaNuevaBot = 0;
		if (personajeDelBot == 1) {
			int dagnoArqueroBot = random.nextInt(5) + 1;
			vidaNuevaBot = arquero.atacar(vidaDelEnemigo, dagnoArqueroBot);

		} else if (personajeDelBot == 2) {
			int dagnoMagoBot = random.nextInt(10) + 1;
			vidaNuevaBot = mago.atacar(vidaDelEnemigo, dagnoMagoBot);
		} else if (personajeDelBot == 3) {
			int dagnoGuerreroBot = random.nextInt(15) + 1;
			vidaNuevaBot = guerrero.atacar(vidaDelEnemigo, dagnoGuerreroBot);
		} else {
			System.out.println("¿Cómo has llegado aqui?");
		}

		return vidaNuevaBot;
	}

	private static void defenderBot(Personaje arquero, Personaje mago, Personaje guerrero, int personajeJugador,
			double dagnoDelBot, double vidaActualizada) {
		if (personajeJugador == 1) {
			arquero.defender(vidaActualizada, dagnoDelBot);
		} else if (personajeJugador == 2) {
			mago.defender(vidaActualizada, dagnoDelBot);
		} else if (personajeJugador == 3) {
			guerrero.defender(vidaActualizada, dagnoDelBot);
		} else {
			System.out.println("¿Cómo has llegado aqui?");
		}
	}

	private static void curarBot(Random ramdon, Objeto vendas, Objeto botiquin, Objeto paracetamol,
			double vidaActualizada) {
		boolean curado = false;
		System.out.println("Buenas tienes estos objetos pero usalos con :");
		System.out.println("Pulsa 1.Para paracetamol");
		System.out.println("Pulsa 2.Para botiquin");
		System.out.println("Pulsa 3.Para vendas");
		System.out.println(paracetamol.unidades + " unidades te quedan paracetamol");
		System.out.println(botiquin.unidades + " unidades te quedan botiquines");
		System.out.println(vendas.unidades + " unidades te quedan vendas");

		int curarseObjeto = ramdon.nextInt(3) + 1;
		while (curado == false) {
			switch (curarseObjeto) {
			case 1:
				if (paracetamol.unidades == 0) {
					System.out.println("Ya no te quedan más unidades");
				} else {
					System.out.println("Tu vida de ha actualizado de " + vidaActualizada + " a "
							+ (vidaActualizada + paracetamol.vida));
					curado = false;
				}
				break;
			case 2:
				if (botiquin.unidades == 0) {
					System.out.println("Ya no te quedan más unidades");
					curado = false;
				} else {
					System.out.println("Tu vida de ha actualizado de " + vidaActualizada + " a "
							+ (vidaActualizada + botiquin.vida));
					curado = false;
				}
				break;
			case 3:
				if (paracetamol.unidades == 0) {
					System.out.println("Ya no te quedan más unidades");
				} else {
					System.out.println("Tu vida de ha actualizado de " + vidaActualizada + " a "
							+ (vidaActualizada + paracetamol.vida));
					curado = false;
				}
				break;
			default:
				System.out.println("No se ha encontrado el objeto intentalo de nuevo");
			}
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
