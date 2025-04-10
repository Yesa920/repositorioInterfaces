package com.example.bbddConnector.peticion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.util.StringUtils;

public class Crud {

	private static final String passBD = "";
	private static final String userBD = "root";
	private static final String url = "jdbc:MySQL://localhost:3306/comida";

	public static List<Usuario> getUsuario() {
		Usuario usuario = new Usuario();

		ArrayList<Usuario> usuarioLista = new ArrayList<Usuario>();

		try {

			// 1.CREAR CONEXION
			Connection myConexion = DriverManager.getConnection(url, userBD, passBD);

			// 2. CREAR OBJETO STATEMENT
			Statement miStatement = myConexion.createStatement();

			// 3. EJECUTAR SQL
			ResultSet miResulset = miStatement.executeQuery("SELECT * FROM usuario");

			// 4. Leer resultset
			while (miResulset.next()) {

				System.out.println("Id_usuario:  " + miResulset.getString("id_usuario") + " ");
				usuario.setId_usuario(miResulset.getInt("id_usuario"));

				System.out.println("Nombre: " + miResulset.getString("nombre") + " ");
				usuario.setNombre(miResulset.getString("nombre"));

				System.out.println("Contrasegna: " + miResulset.getString("contrasegna") + " ");
				usuario.setNombre(miResulset.getString("contrasegna"));

				System.out.println("Email: " + miResulset.getString("email") + " ");
				usuario.setEmail(miResulset.getString("email"));

				System.out.println("Plan elegido: " + miResulset.getString("idPlanSubscripcion") + " ");
				usuario.setPlan(miResulset.getInt("idPlanSubscripcion"));

//				clientesLista.add(cliente);

			}

		} catch (Exception e) {
			System.out.println("No conecta!! " + e);
		}

		return usuarioLista;

	}

	public static int getUsuariosByNombre(String nombre) {

		ArrayList<Usuario> usuarioLista = new ArrayList<Usuario>();
		int usuarioCorrecto = 0;
		try {

			// 1.CREAR CONEXION
			Connection myConexion = DriverManager.getConnection(url, userBD, passBD);

			// 2. CREAR OBJETO STATEMENT
			PreparedStatement preparedStatement = myConexion.prepareStatement("SELECT * FROM Clientes where Nombre=?");

			preparedStatement.setString(2, nombre);

			// 3. EJECUTAR SQL
			ResultSet miResulset = preparedStatement.executeQuery();

			// 4. Leer resultset
			while (miResulset.next()) {

				// cliente = new modelo.Cliente.Cliente();
				Usuario usuario = new Usuario();

				System.out.println("Id_usuario:  " + miResulset.getString("id_usuario") + " ");
				usuario.setId_usuario(miResulset.getInt("id_usuario"));

				System.out.println("Nombre: " + miResulset.getString("nombre") + " ");
				usuario.setNombre(miResulset.getString("nombre"));

				System.out.println("Contrasegna: " + miResulset.getString("contrasegna") + " ");
				usuario.setContrasegna(miResulset.getString("contrasegna"));

				System.out.println("Email: " + miResulset.getString("email") + " ");
				usuario.setEmail(miResulset.getString("email"));

				System.out.println("Plan elegido: " + miResulset.getString("idPlanSubscripcion") + " ");
				usuario.setPlan(miResulset.getInt("idPlanSubscripcion"));

				if (nombre.equalsIgnoreCase(usuario.getNombre())) {
					usuarioCorrecto = 1;
				}

				// clientesLista.add(cliente);

			}

		} catch (Exception e) {
			System.out.println("No conecta!! " + e);
		}

		return usuarioCorrecto;

	}

	public static int getUsuariosByNombreAndPassword(String nombre, String contrasegna) {
		int usuarioCorrecto = 0;
		ArrayList<Usuario> usuarioLista = new ArrayList<Usuario>();

		try {

			// 1.CREAR CONEXION
			Connection myConexion = DriverManager.getConnection(url, userBD, passBD);

			// 2. CREAR OBJETO STATEMENT
			String sql = "SELECT * FROM Clientes where Nombre=? and contrasegna=?";

			PreparedStatement preparedStatement = myConexion.prepareStatement(sql);

			preparedStatement.setString(1, nombre);
			preparedStatement.setString(2, contrasegna);

			// 3. EJECUTAR SQL
			ResultSet miResulset = preparedStatement.executeQuery();

			// 4. Leer resultset
			while (miResulset.next()) {

				// cliente = new modelo.Cliente.Cliente();
				Usuario usuario = new Usuario();

				System.out.println("Id_usuario:  " + miResulset.getString("id_usuario") + " ");
				usuario.setId_usuario(miResulset.getInt("id_usuario"));

				System.out.println("Nombre: " + miResulset.getString("nombre") + " ");
				usuario.setNombre(miResulset.getString("nombre"));

				System.out.println("Contrasegna: " + miResulset.getString("contrasegna") + " ");
				usuario.setContrasegna(miResulset.getString("contrasegna"));

				System.out.println("Email: " + miResulset.getString("email") + " ");
				usuario.setEmail(miResulset.getString("email"));

				System.out.println("Plan elegido: " + miResulset.getString("idPlanSubscripcion") + " ");
				usuario.setPlan(miResulset.getInt("idPlanSubscripcion"));

				if (nombre.equalsIgnoreCase(usuario.getNombre()) && contrasegna.equalsIgnoreCase(usuario.getNombre())) {
					usuarioCorrecto = 2;
				}

				// clientesLista.add(cliente);

			}

		} catch (Exception e) {
			System.out.println("No conecta!! " + e);
		}

		return usuarioCorrecto;

	}

	public void updateCLiente(int id_usu, String nom, String cons, String ema, int pla) throws SQLException {

		Connection myConexion = DriverManager.getConnection(url, userBD, passBD);

		String sql = "UPDATE Clientes SET ";

		if (!StringUtils.isNullOrEmpty(ema))
			sql.concat(" NOMBRE = ? ");

		sql.concat("WHERE id_usu = ?");

		PreparedStatement miStatement = myConexion.prepareStatement(sql);

		miStatement.setInt(1, id_usu);
		miStatement.setString(2, nom);
		miStatement.setString(3, cons);
		miStatement.setString(4, ema);
		miStatement.setInt(5, pla);

		miStatement.executeUpdate();

	}

	public void insertUsuario(int id_usu, String nom, String cons, String ema, int pla) throws SQLException {

		Connection myConexion = DriverManager.getConnection(url, userBD, passBD);

		String insert = "INSERT INTO comida (id_usuario, nombre, contraseña, email,plan)" + "VALUES (?,?,?,?,?,?)";

		PreparedStatement miStatement = myConexion.prepareStatement(insert);

		miStatement.setInt(1, id_usu);
		miStatement.setString(2, nom);
		miStatement.setString(3, cons);
		miStatement.setString(4, ema);
		miStatement.setInt(5, pla);

		miStatement.executeUpdate();

	}

	public static void insertHabito(int id_hab, String nom, int frecu, int id_usu) throws SQLException {

		Connection myConexion = DriverManager.getConnection(url, userBD, passBD);

		String insert = "INSERT INTO comida (id_usuario, nombre, contraseña, email,plan)" + "VALUES (?,?,?,?,?,?)";

		PreparedStatement miStatement = myConexion.prepareStatement(insert);

		miStatement.setInt(1, id_hab);
		miStatement.setString(2, nom);
		miStatement.setInt(3, frecu);
		miStatement.setInt(4, id_usu);

		miStatement.executeUpdate();

	}

	public void deleteFromRetoByUsuario(int id_habito) throws SQLException {
		Connection myConexion = DriverManager.getConnection(url, userBD, passBD);

		String insert = "DELETE FROM habito where id_habito=?";

		PreparedStatement miStatement = myConexion.prepareStatement(insert);

		miStatement.setInt(1, id_habito);

		miStatement.executeUpdate();

	}

}
