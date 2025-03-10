package Fantasy;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Batalla {
	private static Bot bot;
	private double vidaDelJugadorRestante;

	public Batalla() {

	}

	public double getVidaDelJugadorRestante() {
		return vidaDelJugadorRestante;
	}

	public void setVidaDelJugadorRestante(double vidaDelJugadorRestante) {
		this.vidaDelJugadorRestante = vidaDelJugadorRestante;
	}

	public Batalla(double vidaDelJugadorRestante) {
		super();
		this.vidaDelJugadorRestante = vidaDelJugadorRestante;
	}

	public void iniciarPartida() {
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
		bot = new Bot(0);
		int eleccionDelPersonaje = 0;
		double dagnoDelBot = 0;
		double vidaActual = 0;

		double dagnoJugador = random.nextInt();

		int personajeJugador = elegirPersonaje(leer, eleccionDelPersonaje);
		int personajeDelBot = bot.ElegirPersonajeBot(random, eleccionDelPersonaje);

		double vidaActualizadaJugador = obtenerVidaDeLosPersonajes(arquero, mago, guerrero, personajeJugador,
				vidaActual);
		double vidaDelBot = Bot.obtenerVidaDeLosPersonajes(arquero, mago, guerrero, personajeDelBot, vidaActual);
		bot = new Bot(vidaDelBot);

		setVidaDelJugadorRestante(vidaActualizadaJugador);

		int decisionBot = random.nextInt(3) + 1;

		double vidaRestanteDelBot = 1;
		int contarAtaque = 0;
		boolean terminaJuego = false;
		while (terminaJuego == false) {
			if (getVidaDelJugadorRestante() <= 0) {
				System.out.println("El bot a ganado");
				terminaJuego = true;
			} else if (bot.getVidaRestanteDelBot() <= 0) {
				System.out.println("Has ganado");
				terminaJuego = true;
			} else {
				System.out.println("Listo , ya empieza el combate.");
				System.out.println("Es tu turno. Tienes estas opciones");
				System.out.println("1. Atacar");
				System.out.println("2. Defender");
				System.out.println("3. Curar");
				System.out.println("4. Salir, es decir ,rendirte");
				int decisionJugador = leer.nextInt();

				switch (decisionJugador) {
				case 1:
					if (contarAtaque == 0) {
						vidaRestanteDelBot = atacarJugador(arquero, mago, guerrero, personajeJugador, decisionBot,
								vidaDelBot, dagnoJugador);
						contarAtaque++;
					} else {
						vidaRestanteDelBot = atacarJugador(arquero, mago, guerrero, personajeJugador, decisionBot,
								bot.getVidaRestanteDelBot(), dagnoJugador);
					}
					bot.setVidaRestanteDelBot(vidaRestanteDelBot);
					System.out.println("La vida del enemigo es " + bot.getVidaRestanteDelBot());

					System.out.println("Turno del bot");
					vidaActualizadaJugador = bot.atacarDefenderCurarBot(arquero, mago, guerrero, random, vendas,
							botiquin, paracetamol, dagnoDelBot, personajeDelBot, getVidaDelJugadorRestante(),
							vidaDelBot, decisionBot, vidaDelBot);
					setVidaDelJugadorRestante(vidaActualizadaJugador);

					break;
				case 2:

					System.out.println("Turno del bot");
					dagnoDelBot = bot.atacarDefenderCurarBot(arquero, mago, guerrero, random, vendas, botiquin,
							paracetamol, dagnoDelBot, personajeDelBot, getVidaDelJugadorRestante(), vidaDelBot,
							decisionBot, vidaDelBot);

					vidaActualizadaJugador = defenderJugador(arquero, mago, guerrero, personajeJugador, dagnoDelBot,
							getVidaDelJugadorRestante());
					System.out.println("Tu vida es " + getVidaDelJugadorRestante());
					break;
				case 3:
					curarse(leer, vendas, botiquin, paracetamol);
					System.out.println("Turno del bot");
					bot.atacarDefenderCurarBot(arquero, mago, guerrero, random, vendas, botiquin, paracetamol,
							dagnoDelBot, personajeDelBot, getVidaDelJugadorRestante(), vidaDelBot, decisionBot,
							vidaDelBot);
					break;
				case 4:
					System.out.println("Te saliste de la partida y el botardo te gano");
					terminaJuego = true;
					break;

				}
			}
		}

	}

	private void curarse(Scanner leer, Objeto vendas, Objeto botiquin, Objeto paracetamol) {
		int vidaActualizada = 0;
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
					break;
				} else {
					System.out.println("Tu vida de ha actualizado de " + getVidaDelJugadorRestante());
					vidaActualizada = (int) (getVidaDelJugadorRestante() + paracetamol.getVida());
					setVidaDelJugadorRestante(vidaActualizada);
					System.out.println("a " + getVidaDelJugadorRestante());
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
					System.out.println("Tu vida de ha actualizado de " + getVidaDelJugadorRestante());
					vidaActualizada = (int) (getVidaDelJugadorRestante() + botiquin.getVida());
					setVidaDelJugadorRestante(vidaActualizada);
					System.out.println("a " + getVidaDelJugadorRestante());
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
					System.out.println("Tu vida de ha actualizado de " + getVidaDelJugadorRestante());
					vidaActualizada = (int) (getVidaDelJugadorRestante() + vendas.getVida());
					setVidaDelJugadorRestante(vidaActualizada);
					System.out.println("a " + getVidaDelJugadorRestante());
					int actualizarUnidades = vendas.getUnidades() - 1;
					vendas.setUnidades(actualizarUnidades);
					curado = true;
				}
				break;
			default:
				System.out.println("Volver");
			}
		}
	}

	private static double atacarJugador(Personaje arquero, Personaje mago, Personaje guerrero, int personajeJugador,
			double decisionBot, double vidaDelEnemigo, double dagnoJugador) {
		Random random = new Random();
		if (personajeJugador == 1) {
			int dagnoArqueroJugador = random.nextInt(5) + 1;
			decisionBot = arquero.atacar(vidaDelEnemigo, dagnoArqueroJugador);

		} else if (personajeJugador == 2) {
			int dagnoMagoJugador = random.nextInt(10) + 1;
			decisionBot = mago.atacar(vidaDelEnemigo, dagnoMagoJugador);
		} else if (personajeJugador == 3) {
			int dagnoGuerreroJugador = random.nextInt(15) + 1;
			decisionBot = guerrero.atacar(vidaDelEnemigo, dagnoGuerreroJugador);
		} else {
			System.out.println("¿Cómo has llegado aqui?");
		}
		return decisionBot;
	}

	private static int defenderJugador(Personaje arquero, Personaje mago, Personaje guerrero, int personajeJugador,
			double dagnoDelBot, double vidaActualizada) {
		int vidaTotal = 0;
		if (personajeJugador == 1) {
			vidaTotal = arquero.defender(vidaActualizada, dagnoDelBot);
		} else if (personajeJugador == 2) {
			vidaTotal = mago.defender(vidaActualizada, dagnoDelBot);
		} else if (personajeJugador == 3) {
			vidaTotal = guerrero.defender(vidaActualizada, dagnoDelBot);
		} else {
			System.out.println("¿Cómo has llegado aqui?");
		}
		return vidaTotal;
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
