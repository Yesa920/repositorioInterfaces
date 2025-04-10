package com.example.bbddConnector.peticion;

import java.sql.SQLException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		boolean iniciarSesion = false;
		boolean pasarContrasegna = false;
		boolean pasarNombre = false;
		String nombreIniciarSesion = "";
		boolean pasarEliminarObjetivo = false;
		int contador_cliente = 4;
		boolean objetivo1Completado = false;
		boolean objetivo2Completado = false;
		boolean objetivo3Completado = false;
		boolean objetivo4Completado = false;
		int porcentajeDelReto = 0;
		Crud crud = new Crud();
		System.out.println("Bienvenido a ** .Inicie sesion o registrese para entrar a la aplicacion");
		System.out.println("1. Iniciar sesion");
		System.out.println("2. Registrarse");

		while (iniciarSesion == false) {

			int elegirIniciarSesionRegistrarse = leer.nextInt();

			if (elegirIniciarSesionRegistrarse == 1) {

				while (pasarNombre == false) {

					System.out.println("Introduzca su nombre");
					nombreIniciarSesion = leer.next();
					int usuarioCorrecto = Crud.getUsuariosByNombre(nombreIniciarSesion);
					if (usuarioCorrecto == 1) {
						pasarNombre = true;
						System.out.println("Usuario correcto");
					} else {
						System.out.println("Usuario incorrecto vuelvalo a intentar");
					}
				}
				while (pasarContrasegna == false) {
					System.out.println("Introduzca su contrasegna");
					String contrasegnaIniciarSesion = leer.next();
					int usuarioCorrecto = Crud.getUsuariosByNombreAndPassword(nombreIniciarSesion,
							contrasegnaIniciarSesion);
					if (usuarioCorrecto == 2) {
						pasarContrasegna = true;
						System.out.println("Contrasegna correcta");
						iniciarSesion = true;
					} else {
						System.out.println("Contrasegna incorrecto vuelvalo a intentar");
					}

				}

			} else if (elegirIniciarSesionRegistrarse == 2) {

				System.out.println("Introduzca el nombre del nuevo usuario");
				String nombreRegistrarse = leer.next();
				System.out.println("Introduzca la contrasegna del nuevo usuario");
				String contrasegnaRegistrarse = leer.next();
				System.out.println("Introduzca el correo del nuevo usuario");
				String correoRegistrarse = leer.next();
				System.out.println("Introduzca sistema de pago del nuevo usuario");
				System.out.println("1. Para el plan basico (0€)");
				System.out.println("2. Para el plan premium (9,99€)");
				System.out.println("3. Para el plan basico (19,99€)");
				int Registrarse = leer.nextInt();

				try {
					crud.insertUsuario(contador_cliente, nombreRegistrarse, contrasegnaRegistrarse, correoRegistrarse,
							Registrarse);
					iniciarSesion = true;
					contador_cliente++;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("No se pudo registrarse intentalo de nuevo");
				}

			} else {
				System.out.println("No has elegido ninguna de las opciones vuelve lo a intentar");
			}
		}

		int contar_habito = 1;

		System.out.println("Buena y bienvenido a nuestro aplicacion introduce como van ser tus proximas semanas");
		System.out.println("1º. Semana");
		String objetivo1Semana = leer.nextLine();
		motrarFrecuenciaHabito();
		int objetivo1SemanaTiempo = leer.nextInt();

		try {
			Crud.insertHabito(contar_habito, objetivo1Semana, objetivo1SemanaTiempo, contador_cliente);
			contar_habito++;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("2º. Semana");
		String objetivo2Semana = leer.nextLine();
		motrarFrecuenciaHabito();
		int objetivo2SemanaTiempo = leer.nextInt();

		try {
			Crud.insertHabito(contar_habito, objetivo2Semana, objetivo2SemanaTiempo, contador_cliente);
			contar_habito++;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("3º. Semana");
		String objetivo3Semana = leer.nextLine();
		motrarFrecuenciaHabito();
		int objetivo3SemanaTiempo = leer.nextInt();

		try {
			Crud.insertHabito(contar_habito, objetivo3Semana, objetivo3SemanaTiempo, contador_cliente);
			contar_habito++;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("4º. Semana");
		String objetivo4Semana = leer.nextLine();
		motrarFrecuenciaHabito();
		int objetivo4SemanaTiempo = leer.nextInt();

		try {
			Crud.insertHabito(contar_habito, objetivo4Semana, objetivo4SemanaTiempo, contador_cliente);
			contar_habito++;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (pasarEliminarObjetivo = false) {

			System.out.println("Has elegido los retos,¿desea eliminar alguno?");
			System.out.println("Elige entre 1 , 2 , 3, 4 ");
			int quitarObjetivo = leer.nextInt();
			switch (quitarObjetivo) {
			case 1:
				try {
					crud.deleteFromRetoByUsuario(1);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Ya has eliminado el reto o no hay");
				}
				break;
			case 2:
				try {
					crud.deleteFromRetoByUsuario(2);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Ya has eliminado el reto o no hay");
				}
				break;
			case 3:
				try {
					crud.deleteFromRetoByUsuario(3);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Ya has eliminado el reto o no hay");
				}
				break;
			case 4:
				try {
					crud.deleteFromRetoByUsuario(4);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Ya has eliminado el reto o no hay");
				}
				break;
			default:
				System.out.println("No has elegido ninguna de las opciones. Intentalo otra vez");

			}
			System.out.println("¿Quieres eliminar otro reto?");
			String eliminarMasRetos = leer.next();
			if (eliminarMasRetos.equalsIgnoreCase("si")) {

			} else {
				pasarEliminarObjetivo = true;
			}

		}

		System.out.println("¿El usuario ha cumpliado el objetivo 1?");
		String pasarObjetivo1 = leer.next();
		if (pasarObjetivo1.equalsIgnoreCase("si")) {
			System.out.println("Felicidades por tu esfuerzo");
			porcentajeDelReto += 25;
			objetivo1Completado = true;
		} else {
			System.out.println("Intentalo mejor la proxima vez");
		}
		System.out.println("¿El usuario ha cumpliado el objetivo 2?");
		String pasarObjetivo2 = leer.next();
		if (pasarObjetivo2.equalsIgnoreCase("si")) {
			System.out.println("Felicidades por tu esfuerzo");
			porcentajeDelReto += 25;
			objetivo2Completado = true;
		} else {
			System.out.println("Intentalo mejor la proxima vez");
		}
		System.out.println("¿El usuario ha cumpliado el objetivo 3?");
		String pasarObjetivo3 = leer.next();
		if (pasarObjetivo3.equalsIgnoreCase("si")) {
			System.out.println("Felicidades por tu esfuerzo");
			porcentajeDelReto += 25;
			objetivo3Completado = true;
		} else {
			System.out.println("Intentalo mejor la proxima vez");
		}
		System.out.println("¿El usuario ha cumpliado el objetivo 4?");
		String pasarObjetivo4 = leer.next();
		if (pasarObjetivo4.equalsIgnoreCase("si")) {
			System.out.println("Felicidades por tu esfuerzo");
			porcentajeDelReto += 25;
			objetivo4Completado = true;
		} else {
			System.out.println("Intentalo mejor la proxima vez");
		}
		
		System.out.println("Vale tu porcetanje de efectividad es de " + porcentajeDelReto + " %");

		if() {
			
		}
		
	}

	private static void motrarFrecuenciaHabito() {
		System.out.println("Elige cuanto lo quieres hacer");
		System.out.println("1. Diario");
		System.out.println("2. Una vez a la semana");
		System.out.println("3. Una vez a la mes");
	}

}
