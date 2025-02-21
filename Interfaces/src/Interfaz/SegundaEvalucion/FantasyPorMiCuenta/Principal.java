package Fantasy;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Principal {
	private static Bot bot;

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Random random = new Random();
		// vida , daño que luego en el metodo se aclara , defensa cuanta menor sea el
		// numero mayor sera la defensa, agilidad
		Personaje arquero = new Arquero(100.0, 0.2, 1);
		Personaje mago = new Mago(70.0, 0.8, 1);
		Personaje guerrero = new Guerrero(70.0, 1.2, 1);
		// El nombre y la vida que cura el objeto
		Objeto vendas = new Objeto("Vendas", 25, 1);
		Objeto botiquin = new Objeto("Botiquin", 50, 1);
		Objeto paracetamol = new Objeto("Paracetamol", 5, 1);

		bot = new Bot();

		int eleccionDelPersonaje = 0;
		double dagnoDelBot = 0;
		double vidaActual = 0;

		double dagnoJugador = random.nextInt();

		int personajeJugador = elegirPersonaje(leer, eleccionDelPersonaje);
		int personajeDelBot = bot.ElegirPersonajeBot(random, eleccionDelPersonaje);

		double vidaActualizada = obtenerVidaDeLosPersonajes(arquero, mago, guerrero, personajeJugador, vidaActual);
		double vidaDelBot = bot.obtenerVidaDeLosPersonajes(arquero, mago, guerrero, personajeDelBot, vidaActual);

		boolean terminaJuego = false;
		while (terminaJuego == false) {
			if (vidaActualizada <= 0) {
				System.out.println("El bot a ganado");
				terminaJuego = true;
			} else if (vidaDelBot <= 0) {
				System.out.println("Has ganado");
				terminaJuego = true;
			} else {
				System.out.println("Listo , ya empieza el combate.");
				System.out.println("Es tu turno. Tienes estas opciones");
				System.out.println("1. Atacar");
				System.out.println("2. Defender");
				System.out.println("3. Curar");
				System.out.println("4. Salir, es decir ,rendirte");
				int decisionAtaque = leer.nextInt();

				switch (decisionAtaque) {
				case 1:
					atacarJugador(arquero, mago, guerrero, personajeJugador, vidaDelBot, vidaActualizada, dagnoJugador);
					System.out.println("Turno del bot");
					break;
				case 2:
					defenderJugador(arquero, mago, guerrero, personajeJugador, dagnoDelBot, vidaActualizada);
					System.out.println("Turno del bot");
					break;
				case 3:
					curarJugador(leer, vendas, botiquin, paracetamol, vidaActualizada);
					System.out.println("Turno del bot");
					break;
				case 4:
					System.out.println("Te saliste de la partida y el botardo te gano");
					terminaJuego = true;
					break;

				}
			}
		}

	}

	private static void atacarJugador(Personaje arquero, Personaje mago, Personaje guerrero, int personajeJugador,
			double vidaDelEnemigo, double vidaActualizada, double dagnoJugador) {
		Random random = new Random();
		if (personajeJugador == 1) {
			int dagnoArqueroJugador = random.nextInt(5) + 1;
			arquero.atacar(vidaDelEnemigo, dagnoArqueroJugador);

		} else if (personajeJugador == 2) {
			int dagnoMagoJugador = random.nextInt(10) + 1;
			mago.atacar(vidaDelEnemigo, dagnoMagoJugador);
		} else if (personajeJugador == 3) {
			int dagnoGuerreroJugador = random.nextInt(15) + 1;
			guerrero.atacar(vidaDelEnemigo, dagnoGuerreroJugador);
		} else {
			System.out.println("¿Cómo has llegado aqui?");
		}
		System.out.println("La vida del enemigo es " + vidaDelEnemigo + " daño");
		System.out.println("Tu vida es " + vidaActualizada);
	}

	private static void defenderJugador(Personaje arquero, Personaje mago, Personaje guerrero, int personajeJugador,
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

	private static void curarJugador(Scanner leer, Objeto vendas, Objeto botiquin, Objeto paracetamol,
			double vidaActualizada) {
		boolean curado = false;
		System.out.println("Buenas tienes estos objetos pero usalos con :");
		System.out.println("Pulsa 1.Para paracetamol");
		System.out.println("Pulsa 2.Para botiquin");
		System.out.println("Pulsa 3.Para vendas");
		System.out.println(paracetamol.unidades + " unidades te quedan paracetamol");
		System.out.println(botiquin.unidades + " unidades te quedan botiquines");
		System.out.println(vendas.unidades + " unidades te quedan vendas");

		int curarseObjeto = leer.nextInt();
		while (curado == false) {
			switch (curarseObjeto) {
			case 1:
				if (paracetamol.unidades == 0) {
					System.out.println("Ya no te quedan más unidades");
				} else {
					System.out.println("Tu vida de ha actualizado de " + vidaActualizada + " a "
							+ (vidaActualizada + paracetamol.vida));
					vidaActualizada = vidaActualizada - paracetamol.getVida();
					int actualizarUnidades = paracetamol.getUnidades() - 1;
					paracetamol.setUnidades(actualizarUnidades);
					curado = true;
				}
				break;
			case 2:
				if (botiquin.unidades == 0) {
					System.out.println("Ya no te quedan más unidades");
					curado = true;
				} else {
					System.out.println("Tu vida de ha actualizado de " + vidaActualizada + " a "
							+ (vidaActualizada + botiquin.vida));
					vidaActualizada = vidaActualizada - paracetamol.getVida();
					int actualizarUnidades = paracetamol.getUnidades() - 1;
					paracetamol.setUnidades(actualizarUnidades);
					curado = true;
				}
				break;
			case 3:
				if (paracetamol.unidades == 0) {
					System.out.println("Ya no te quedan más unidades");
				} else {
					System.out.println("Tu vida de ha actualizado de " + vidaActualizada + " a "
							+ (vidaActualizada + paracetamol.vida));
					vidaActualizada = vidaActualizada - paracetamol.getVida();
					int actualizarUnidades = paracetamol.getUnidades() - 1;
					paracetamol.setUnidades(actualizarUnidades);
					curado = true;
				}
				break;
			default:
				System.out.println("Volver");
			}
		}
	}

	static double obtenerVidaDeLosPersonajes(Personaje arquero, Personaje mago, Personaje guerrero,
			int eleccionDelPersonaje, double vidaActual) {
		if (eleccionDelPersonaje == 1) {
			vidaActual = arquero.getVida();
		} else if (eleccionDelPersonaje == 2) {
			vidaActual = mago.getVida();
		} else if (eleccionDelPersonaje == 3) {
			vidaActual = guerrero.getVida();
		}
		return vidaActual;
	}

	static int elegirPersonaje(Scanner leer, int eleccionDelPersonaje) {
		boolean personajeSeguro = false;
		boolean correctoDecisionPersonaje = false;
		while (personajeSeguro == false) {
			while (correctoDecisionPersonaje == false) {
				mostrarMenu();

				int decisionPersonaje = 0;

				try {
					decisionPersonaje = leer.nextInt();
				} catch (InputMismatchException e) {
					System.err.println("Debe poner el numero no el nombre del personaje");
				}

				switch (decisionPersonaje) {
				case 1:
					System.out.println("Personaje elegido ARQUERO");
					eleccionDelPersonaje = 1;
					break;
				case 2:
					System.out.println("Personaje elegido MAGO");
					eleccionDelPersonaje = 2;
					break;
				case 3:
					System.out.println("Personaje elegido GUERRERO");
					eleccionDelPersonaje = 3;
					break;
				default:
					System.out.println("No se ha encontrado el personaje intentalo de nuevo");

				}
				// se le puede quitar esto ya que al ser una palabra no es necesario por
				// NextLine en la variable personajeSeguroConfirma

				System.out.println("¿Estas seguro de que quieres elegir a ese personaje? Escriba si");

				String personajeSeguroConfirma = leer.next();
				if (personajeSeguroConfirma.equalsIgnoreCase("si")) {
					personajeSeguro = true;
					correctoDecisionPersonaje = true;
				}
			}
		}
		return eleccionDelPersonaje;
	}

	private static void mostrarMenu() {
		System.out.println("Bienvenido al Fantasy.");
		System.out.println("Elija uno de nuestro personajes , depues peleara contra un bot");
		System.out.println("Escribe 1 para el arquero , escribe 2 para el mago , escribe 3 para el guerrero");
		System.out.println("Arquero, Estadisticas: Vida:100 , Daño(0-5) , Defensa: 1.8, Agilidad: 1");
		System.out.println("Mago, Estadisticas: Vida:70 , Daño(0-10) , Defensa: 1, Agilidad: 1");
		System.out.println("Guerrero, Estadisticas: Vida:70 , Daño(0-15) , Defensa: 0.8, Agilidad: 1");
	}

	public int atacarDagnoJugador(int personajeJugador) {
		Random random = new Random();
		int dagnoJugador = 0;
		if (personajeJugador == 1) {
			dagnoJugador = random.nextInt(5) + 1;

		} else if (personajeJugador == 2) {
			dagnoJugador = random.nextInt(10) + 1;

		} else if (personajeJugador == 3) {
			dagnoJugador = random.nextInt(15) + 1;

		} else {
			System.out.println("¿Cómo has llegado aqui?");
		}

		return dagnoJugador;

	}

}
