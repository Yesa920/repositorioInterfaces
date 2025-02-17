package Netflix;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Usuario user = new Usuario();
		Pelicula peli = new Pelicula();
		Juego game = new Juego();
		Serie ser = new Serie();
		Temporada tem = new Temporada();
		Capitulo cap = new Capitulo();

		Pelicula peli1 = new Pelicula("El gato sin patas", "Drama", "Alberto Ibañez", 2017, 114);
		Pelicula peli2 = new Pelicula("More promote", "Bélico/Aventura", "surviv_skiper", 2020, 56);
		Pelicula peli3 = new Pelicula("55 dias en pekin", "Bélico/Aventura", "Nicholas Ray", 1963, 154);
		Pelicula peli4 = new Pelicula("Rocket League la pelicula", "Diversion", "Antonio Garcia Asua", 2017, 169);
		Pelicula peli5 = new Pelicula("Y la batalla vuelve a empezar", "Bélico/Acción", "Valery Sablin", 1967, 146);
		Pelicula peli6 = new Pelicula("1917", "Bélico/Acción", "Sam Mendes", 2019, 119);

		ArrayList<Pelicula> peliculas = new ArrayList<>();
		peliculas.add(peli6);
		peliculas.add(peli5);
		peliculas.add(peli4);
		peliculas.add(peli3);
		peliculas.add(peli2);
		peliculas.add(peli1);

		Serie ser1 = new Serie("Las aventuras de Sagar Amigo", "Comedia");
		Temporada temp1 = new Temporada(1, 2020);
		Temporada temp2 = new Temporada(2, 2020);
		Temporada temp3 = new Temporada(3, 2020);
		Capitulo cap1 = new Capitulo("Sagar en nepal, amigo", 1, 48, "Español");
		Capitulo cap2 = new Capitulo("¿Como puede sobrevir desde 0?", 2, 67, "Español");
		Capitulo cap3 = new Capitulo("Como vivir como sagar", 3, 67, "Español");

		Serie ser2 = new Serie("Como llegar a Leyenda Supersonica en Rocket league", "Juegos");
		Temporada temp21 = new Temporada(1, 2020);
		Temporada temp22 = new Temporada(2, 2020);
		Temporada temp23 = new Temporada(3, 2020);
		Capitulo cap12 = new Capitulo("Como rotar en Rocket League", 1, 67, "Español");
		Capitulo cap13 = new Capitulo("Como volar en Rocket League", 2, 48, "Español");
		Capitulo cap14 = new Capitulo("Como marcar una open en Rocket League", 3, 128, "Español");

		Juego jue1 = new Juego("Rocket League", "Juego de deportes", "PC , PS4/PS5 , XBOX SERIE X, Nintendo Switch");
		Juego jue2 = new Juego("Pou", "Juego de simulación casual", "PC , PS4/PS5 , Movil");
		Juego jue3 = new Juego("Surviv.io", "Disparos", "PC , Movil");

		ArrayList<Juego> listaJuego = new ArrayList<>();
		listaJuego.add(jue3);
		listaJuego.add(jue2);
		listaJuego.add(jue1);

		Usuario user1 = new Usuario("surviv", "skiper", "mes a mes", "12/11/2017", "paypal", "C/20 C. Trinidad",
				"España", "Usuario");

		System.out.println("Bienvenido al Neclics");

		iniciarSesion(leer, user, user1);

		boolean salirDeLaPantalla = false;
		while (salirDeLaPantalla == false) {
			System.out.println("Pulse alguna de las siguiente opciones");
			System.out.println("Pulse 1 para ver las peliculas");
			System.out.println("Pulse 2 para ver las series");
			System.out.println("Pulse 3 para ver las juegos");
			System.out.println("Pulse 4 para salir");

			int opcion = leer.nextInt();

			switch (opcion) {
			case 1:
				mostrarPelicula(leer, peliculas);
				break;

			case 2:

				buscarSerie(leer, ser1, cap1, cap2, cap3, ser2, cap12, cap13, cap14);

				break;

			case 3:
				mostrarJuegos(leer, listaJuego);
				break;
			case 4:
				salirDeLaPantalla = true;
				break;
			default:
				System.out.println("No se ha encontrado nada intentalo de nuevo");
			}
			System.out.println("¿Quieres buscar otra vez?");
			String salir = leer.next();
			String salirDeLaAplicacion = leer.nextLine();

			if (salirDeLaAplicacion.equalsIgnoreCase("no") || salir.equalsIgnoreCase("no")) {
				salirDeLaPantalla = true;
			}
		}
	}

	private static void mostrarJuegos(Scanner leer, ArrayList<Juego> listaJuego) {
		boolean pasarJuego = false;
		System.out.println("Buenas bienvenido a la sala de juego");

		for (Juego j : listaJuego) {
			System.out.println(j.toString());
		}

		while (pasarJuego == false) {
			String saltar = leer.nextLine();
			String opcionJuego = leer.nextLine();
			if (opcionJuego.equalsIgnoreCase("Rocket League")) {
				System.out.println(
						"Ve al sitio web de Epic Games Store.\r\n" + "Descarga e instala el cliente de Epic Games.\r\n"
								+ "Inicia sesión o crea una cuenta gratuita en Epic Games.\r\n"
								+ "Busca \"Rocket League\" en la tienda.\r\n"
								+ "Haz clic en el botón \"Obtener\" y luego en \"Instalar\".");
				break;
			}

			else if (opcionJuego.equalsIgnoreCase("Pou")) {
				System.out.println("Abre la Google Play Store en tu dispositivo Android.\r\n"
						+ "Escribe \"Pou\" en la barra de búsqueda.\r\n"
						+ "Selecciona el juego oficial desarrollado por Zakeh Ltd.\r\n"
						+ "Presiona el botón \"Instalar\".\r\n"
						+ "Una vez completada la instalación, abre la aplicación y empieza a jugar.");
				break;
			} else if (opcionJuego.equalsIgnoreCase("Surviv.io")) {
				System.out.println("https://survev.io/");
				break;
			} else {
				System.out.println("No hay ningun juego , intentalo otra vez");
			}
		}
	}

	private static void mostrarPelicula(Scanner leer, ArrayList<Pelicula> peliculas) {
		for (Pelicula p : peliculas) {
			System.out.println(p.toString());
		}
		boolean pasarPelicula = false;
		while (pasarPelicula == false) {
			System.out.println("Elige cual el nombre pelicula quieres ver");
			String saltar = leer.nextLine();
			String opcionPelicula = leer.nextLine();

			switch (opcionPelicula) {
			case "El gato sin patas":
				System.out.println("ve a este enlace a verla");
				System.out.println("https://www.youtube.com/watch?v=B9kjGxv2d7s");
				pasarPelicula = true;
				break;
			case "More promote":
				System.out.println("ve a este enlace a verla");
				System.out.println("https://www.youtube.com/watch?v=Yp87ECD6-dw&t=322s");
				pasarPelicula = true;
				break;
			case "55 dias en pekin":
				System.out.println("ve a este enlace a verla");
				System.out.println("https://youtu.be/LHvEhb1B3uI?si=Bmen46CkDx6m0pTt");
				pasarPelicula = true;
				break;
			case "Rocket League la pelicula":
				System.out.println("ve a este enlace a verla");
				System.out.println("https://youtu.be/Hgj1D9eibcM?si=SmTX96pARxwJak3W");
				pasarPelicula = true;
				break;
			case "Y la batalla vuelve a empezar":
				System.out.println("ve a este enlace a verla");
				System.out.println("https://youtu.be/Udysp_jP0F0?si=PXX3rK1K_TjKUsiF");
				pasarPelicula = true;
				break;
			case "1917":
				System.out.println("ve a este enlace a verla");
				System.out.println("https://youtu.be/uccEB0jS3FA?si=JqLMgFJOWRXnNVSq");
				pasarPelicula = true;
				break;

			default:
				System.out.println("No se ha encontrado , vuelva intentarlo");

			}
		}
	}

	private static void buscarSerie(Scanner leer, Serie ser1, Capitulo cap1, Capitulo cap2, Capitulo cap3, Serie ser2,
			Capitulo cap12, Capitulo cap13, Capitulo cap14) {
		System.out.println(ser1.toString());
		System.out.println(ser2.toString());
		boolean pasarCapitulo = false;
		boolean pasarSerie = false;
		System.out.println("Elige cual serie quieres elegir");
		while (pasarSerie == false) {
			String saltar = leer.nextLine();
			String opcionSerie = leer.nextLine();

			if (opcionSerie.equalsIgnoreCase("Las aventuras de Sagar Amigo")) {
				pasarSerie = true;

				while (pasarCapitulo == false) {
					System.out.println("Hay tres temporadas cual elige");
					int opcionTemporadaSA = leer.nextInt();
					if (opcionTemporadaSA == 1) {
						System.out.println(cap1.toString());
						break;
					} else if (opcionTemporadaSA == 2) {
						System.out.println(cap2.toString());
						break;
					} else if (opcionTemporadaSA == 3) {
						System.out.println(cap3.toString());
						break;
					} else {
						System.out.println("No ha encontrado el capitulo");
					}
				}
			}

			else if (opcionSerie.equalsIgnoreCase("Como llegar a Leyenda Supersonica en Rocket league")) {
				pasarSerie = true;
				while (pasarCapitulo == false) {
					System.out.println("Hay tres temporadas cual elige");
					int opcionTemporadaRL = leer.nextInt();
					if (opcionTemporadaRL == 1) {
						System.out.println(cap12.toString());
						break;
					} else if (opcionTemporadaRL == 2) {
						System.out.println(cap13.toString());
						break;
					} else if (opcionTemporadaRL == 3) {
						System.out.println(cap14.toString());
						break;
					} else {
						System.out.println("No ha encontrado el capitulo");
					}
				}
			} else {
				System.out.println("No se ha encontrado la serie, intentalo de nuevo");
			}
		}
	}

	private static void iniciarSesion(Scanner leer, Usuario user, Usuario user1) {
		System.out.println("Introduce el usuario y la contraseña");
		System.out.println("Si no tiene usuario ingrese -1");

		boolean pasarUsuario = false;
		boolean pasarContrasegna = false;

		while (pasarUsuario == false) {
			String usuario = leer.nextLine();

			if (usuario.equalsIgnoreCase("-1")) {

				Usuario user2 = new Usuario(null, null, null, "13/01/2025", null, null, null, "Usuario");
				System.out.println("Ingrese el nombre del usuario");
				String usuarioNuevo = leer.nextLine();

				user2.setNombre(usuarioNuevo);

				System.out.println("Ingrese la contraseña del usuario");
				String contrasegnaNuevo = leer.nextLine();

				user2.setContrasegna(contrasegnaNuevo);

				System.out.println("Ingrese el metodo de pago");
				String metodoDePagoNuevo = leer.nextLine();

				user2.setMetodo_pago(metodoDePagoNuevo);

				System.out.println("Introduce tu direccion");
				String direccionNuevo = leer.nextLine();

				user2.setDireccion(direccionNuevo);

				System.out.println("Introduce tu pais");
				String paisNuevo = leer.nextLine();

				user2.setPais(paisNuevo);

				pasarUsuario = true;
				pasarContrasegna = true;
			} else if (usuario.equalsIgnoreCase(user1.getNombre())) {
				System.out.println("Usuario encontrado");
				pasarUsuario = true;
			} else {
				System.out.println("Usuario incorrecto, vuelva a intertarlo");
			}

		}

		System.out.println("Ingrese la contraseña");
		while (pasarContrasegna == false) {

			String contrasegna = leer.nextLine();

			if (contrasegna.equalsIgnoreCase(user1.getContrasegna())) {
				System.out.println("Contraseña correcta");
				break;
			} else {
				System.out.println("Contraseña incorrecta, vuelva intertarlo");
			}
		}
	}
}
