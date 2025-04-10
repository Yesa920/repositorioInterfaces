package com.example.bbDDConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import io.micrometer.common.util.StringUtils;
import modelo.Cliente.Cliente;

public class CRUD {

	private static final String passBD = "";
	private static final String userBD = "root";
	private static final String url = "jdbc:MySQL://localhost:3306/pruebas";

	public static List<Cliente> getClientes() {

		ArrayList<Cliente> clientesLista = new ArrayList<Cliente>();

		try {

			// 1.CREAR CONEXION
			Connection myConexion = DriverManager.getConnection(url, userBD, passBD);

			// 2. CREAR OBJETO STATEMENT
			Statement miStatement = myConexion.createStatement();

			// 3. EJECUTAR SQL
			ResultSet miResulset = miStatement.executeQuery("SELECT * FROM Clientes");

			modelo.Cliente.Cliente cliente = null;

			// 4. Leer resultset
			while (miResulset.next()) {

				cliente = new modelo.Cliente.Cliente();

				System.out.println("DNI: " + miResulset.getString("DNI") + " ");
				cliente.setDni(miResulset.getString("DNI"));

				System.out.println("NOMBRE: " + miResulset.getString("NOMBRE") + " ");
				cliente.setNombre(miResulset.getString("NOMBRE"));

				System.out.println("APELLIDOS: " + miResulset.getString("APELLIDOS") + " ");
				cliente.setApellidos(miResulset.getString("APELLIDOS"));

				System.out.println("FECHA: " + miResulset.getString("FECHA") + " ");
				cliente.setFecha(miResulset.getString("FECHA"));

				clientesLista.add(cliente);

			}

		} catch (Exception e) {
			System.out.println("No conecta!! " + e);
		}

		return clientesLista;

	}

	public static List<Cliente> getClientesByDNI(String dni) {

		ArrayList<Cliente> clientesLista = new ArrayList<Cliente>();

		try {

			// 1.CREAR CONEXION
			Connection myConexion = DriverManager.getConnection(url, userBD, passBD);

			// 2. CREAR OBJETO STATEMENT
			PreparedStatement preparedStatement = myConexion.prepareStatement("SELECT * FROM Clientes where DNI=?");

			preparedStatement.setString(1, dni);

			// 3. EJECUTAR SQL
			ResultSet miResulset = preparedStatement.executeQuery();

			modelo.Cliente.Cliente cliente = null;

			// 4. Leer resultset
			while (miResulset.next()) {

				cliente = new modelo.Cliente.Cliente();

				System.out.println("DNI: " + miResulset.getString("DNI") + " ");
				cliente.setDni(miResulset.getString("DNI"));

				System.out.println("NOMBRE: " + miResulset.getString("NOMBRE") + " ");
				cliente.setNombre(miResulset.getString("NOMBRE"));

				System.out.println("APELLIDOS: " + miResulset.getString("APELLIDOS") + " ");
				cliente.setApellidos(miResulset.getString("APELLIDOS"));

				System.out.println("FECHA: " + miResulset.getString("FECHA") + " ");
				cliente.setFecha(miResulset.getString("FECHA"));

				clientesLista.add(cliente);

			}

		} catch (Exception e) {
			System.out.println("No conecta!! " + e);
		}

		return clientesLista;

	}

	public void updateCLiente(String dni, String nombre, String ape, String fecha) throws SQLException {

		Connection myConexion = DriverManager.getConnection(url, userBD, passBD);

		String sql = "UPDATE Clientes SET ";

		if (!StringUtils.isEmpty(nombre))
			sql.concat(" NOMBRE = ? ");
		if (!StringUtils.isEmpty(ape))
			sql.concat(" APELLIDOS = ? ");
		if (!StringUtils.isEmpty(fecha))
			sql.concat(" FECHA = ? ");

		sql.concat("WHERE DNI = ?");

		PreparedStatement miStatement = myConexion.prepareStatement(sql);

		miStatement.setString(1, nombre);
		miStatement.setString(2, ape);
		miStatement.setString(3, fecha);
		miStatement.setString(4, dni);

		miStatement.executeUpdate();

	}

	public void insertCliente(String nombre, String ape, String dni, String fecha, String user, String pass)
			throws SQLException {

		Connection myConexion = DriverManager.getConnection(url, userBD, passBD);

		String insert = "INSERT INTO clientes (nombre, apellidos, dni, fecha)" + "VALUES (?,?,?,?,?,?)";

		PreparedStatement miStatement = myConexion.prepareStatement(insert);

		miStatement.setString(1, nombre);
		miStatement.setString(2, ape);
		miStatement.setString(3, dni);
		miStatement.setString(4, fecha);
		miStatement.setString(5, user);
		miStatement.setString(6, pass);

		miStatement.executeUpdate();

	}

	public void deleteFromClientes(String dni) throws SQLException {
		Connection myConexion = DriverManager.getConnection(url, userBD, passBD);

		String insert = "DELETE FROM Clientes where DNI=?";

		PreparedStatement miStatement = myConexion.prepareStatement(insert);

		miStatement.setString(1, dni);

		miStatement.executeUpdate();

	}

}
