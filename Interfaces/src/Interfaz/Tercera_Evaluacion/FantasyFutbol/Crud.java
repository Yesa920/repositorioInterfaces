package FantasyFutbol;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Crud {
	private static final String passBD = "";
	private static final String userBD = "root";
	private static final String url = "jdbc:MySQL://localhost:3306/jugador";

	public static List<Jugador> getJugador() {
		Jugador jugador = new Jugador();

		ArrayList<Jugador> jugadorLista = new ArrayList<Jugador>();

		try {

			// 1.CREAR CONEXION
			Connection myConexion = DriverManager.getConnection(url, userBD, passBD);

			// 2. CREAR OBJETO STATEMENT
			Statement miStatement = myConexion.createStatement();

			// 3. EJECUTAR SQL
			ResultSet miResulset = miStatement.executeQuery("SELECT * FROM Jugador");

			// 4. Leer resultset
			while (miResulset.next()) {

				System.out.println("_____________________________________");

				System.out.println("Nombre:  " + miResulset.getString("nombre") + " ");
				jugador.setNombre(miResulset.getString("nombre"));

				System.out.println("Posicion: " + miResulset.getString("posicion") + " ");
				jugador.setPosicion(miResulset.getString("posicion"));

				System.out.println("Precio: " + miResulset.getString("precio") + " ");
				jugador.setPrecio(miResulset.getDouble("precio"));

			}

		} catch (Exception e) {
			System.out.println("No conecta!! " + e);
		}

		return jugadorLista;

	}

	public static List<Jugador> getJugadorByName(String nombre) {

		ArrayList<Jugador> jugadorLista = new ArrayList<Jugador>();

		try {

			// 1.CREAR CONEXION
			Connection myConexion = DriverManager.getConnection(url, userBD, passBD);

			// 2. CREAR OBJETO STATEMENT
			PreparedStatement preparedStatement = myConexion.prepareStatement("SELECT * FROM Jugador where Nombre=?");

			preparedStatement.setString(1, nombre);

			// 3. EJECUTAR SQL
			ResultSet miResulset = preparedStatement.executeQuery();

			// 4. Leer resultset
			while (miResulset.next()) {

				// cliente = new modelo.Cliente.Cliente();
				Jugador jugador = new Jugador();

				System.out.println("_____________________________________");

				System.out.println("Nombre:  " + miResulset.getString("nombre") + " ");
				jugador.setNombre(miResulset.getString("nombre"));

				System.out.println("Posicion: " + miResulset.getString("posicion") + " ");
				jugador.setPosicion(miResulset.getString("posicion"));

				System.out.println("Precio: " + miResulset.getString("precio") + " ");
				jugador.setPrecio(miResulset.getDouble("precio"));

			}

		} catch (Exception e) {
			System.out.println("No conecta!! " + e);
		}

		return jugadorLista;

	}

	public static List<Jugador> getJugadorByNameAndPosition(String nombre, String posicion) {

		ArrayList<Jugador> jugadorLista = new ArrayList<Jugador>();

		try {

			// 1.CREAR CONEXION
			Connection myConexion = DriverManager.getConnection(url, userBD, passBD);

			// 2. CREAR OBJETO STATEMENT
			PreparedStatement preparedStatement = myConexion.prepareStatement("SELECT * FROM Jugador where posicion=?");

			preparedStatement.setString(1, nombre);
			preparedStatement.setString(2, posicion);

			// 3. EJECUTAR SQL
			ResultSet miResulset = preparedStatement.executeQuery();

			// 4. Leer resultset
			while (miResulset.next()) {

				// cliente = new modelo.Cliente.Cliente();
				Jugador jugador = new Jugador();

				System.out.println("_____________________________________");

				System.out.println("Nombre:  " + miResulset.getString("nombre") + " ");
				jugador.setNombre(miResulset.getString("nombre"));

				System.out.println("Posicion: " + miResulset.getString("posicion") + " ");
				jugador.setPosicion(miResulset.getString("posicion"));

				System.out.println("Precio: " + miResulset.getString("precio") + " ");
				jugador.setPrecio(miResulset.getDouble("precio"));

			}

		} catch (Exception e) {
			System.out.println("No conecta!! " + e);
		}

		return jugadorLista;

	}

	public void insertJugador(String nom, String pos, double pre) throws SQLException {

		Connection myConexion = DriverManager.getConnection(url, userBD, passBD);

		String insert = "INSERT INTO jugador (nombre, posicion, precio) VALUES (?,?,?)";

		PreparedStatement miStatement = myConexion.prepareStatement(insert);

		miStatement.setString(1, nom);
		miStatement.setString(2, pos);
		miStatement.setDouble(3, pre);

		miStatement.executeUpdate();

	}

	public static void deleteFromJugadores(String nom, String pos) throws SQLException {
		Connection myConexion = DriverManager.getConnection(url, userBD, passBD);

		String insert = "DELETE FROM Jugador where nombre=?";

		PreparedStatement miStatement = myConexion.prepareStatement(insert);

		miStatement.setString(1, nom);
		miStatement.setString(2, pos);

		miStatement.executeUpdate();

	}

}