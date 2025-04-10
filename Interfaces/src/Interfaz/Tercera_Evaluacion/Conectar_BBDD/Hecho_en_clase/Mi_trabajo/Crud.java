package com.example.bbddConnector;

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

	public static List<Comida> getComida() {
		Comida comida = new Comida();

		ArrayList<Comida> comidasLista = new ArrayList<Comida>();

		try {

			// 1.CREAR CONEXION
			Connection myConexion = DriverManager.getConnection(url, userBD, passBD);

			// 2. CREAR OBJETO STATEMENT
			Statement miStatement = myConexion.createStatement();

			// 3. EJECUTAR SQL
			ResultSet miResulset = miStatement.executeQuery("SELECT * FROM Comida");

			// 4. Leer resultset
			while (miResulset.next()) {

				System.out.println("Nombre:  " + miResulset.getString("nombre") + " ");
				comida.setNombre(miResulset.getString("nombre"));

				System.out.println("Pais: " + miResulset.getString("pais") + " ");
				comida.setPais(miResulset.getString("pais"));

				System.out.println("Energia: " + miResulset.getString("energia") + " ");
				comida.setEnergia(miResulset.getInt("energia"));

				System.out.println("Azucar: " + miResulset.getString("azucar") + " ");
				comida.setAzucar(miResulset.getInt("azucar"));

				System.out.println("Grasas saturadas: " + miResulset.getString("grasas_saturadas") + " ");
				comida.setGrasas_saturadas(miResulset.getInt("grasas_saturadas"));

				System.out.println("Sal: " + miResulset.getString("SAL") + " ");
				comida.setSal(miResulset.getInt("sal"));

				System.out.println("PROTEINAS: " + miResulset.getString("proteinas") + " ");
				comida.setProteinas(miResulset.getInt("proteinas"));

//				clientesLista.add(cliente);

			}

		} catch (Exception e) {
			System.out.println("No conecta!! " + e);
		}

		return comidasLista;

	}

	public static List<Comida> getClientesByDNI(String nombre) {

		ArrayList<Comida> comidaLista = new ArrayList<Comida>();

		try {

			// 1.CREAR CONEXION
			Connection myConexion = DriverManager.getConnection(url, userBD, passBD);

			// 2. CREAR OBJETO STATEMENT
			PreparedStatement preparedStatement = myConexion.prepareStatement("SELECT * FROM Clientes where Nombre=?");

			preparedStatement.setString(1, nombre);

			// 3. EJECUTAR SQL
			ResultSet miResulset = preparedStatement.executeQuery();

			// 4. Leer resultset
			while (miResulset.next()) {

				// cliente = new modelo.Cliente.Cliente();
				Comida comida = new Comida();

				System.out.println("Nombre:  " + miResulset.getString("nombre") + " ");
				comida.setNombre(miResulset.getString("nombre"));

				System.out.println("Pais: " + miResulset.getString("pais") + " ");
				comida.setPais(miResulset.getString("pais"));

				System.out.println("Energia: " + miResulset.getString("energia") + " ");
				comida.setEnergia(miResulset.getInt("energia"));

				System.out.println("Azucar: " + miResulset.getString("azucar") + " ");
				comida.setAzucar(miResulset.getInt("azucar"));

				System.out.println("Grasas saturadas: " + miResulset.getString("grasas_saturadas") + " ");
				comida.setGrasas_saturadas(miResulset.getInt("grasas_saturadas"));

				System.out.println("Sal: " + miResulset.getString("SAL") + " ");
				comida.setSal(miResulset.getInt("sal"));

				System.out.println("PROTEINAS: " + miResulset.getString("proteinas") + " ");
				comida.setProteinas(miResulset.getInt("proteinas"));

				// clientesLista.add(cliente);

			}

		} catch (Exception e) {
			System.out.println("No conecta!! " + e);
		}

		return comidaLista;

	}

	public void updateCLiente(String dni, String nombre, String ape, String fecha) throws SQLException {

		Connection myConexion = DriverManager.getConnection(url, userBD, passBD);

		String sql = "UPDATE Clientes SET ";

		if (!StringUtils.isNullOrEmpty(nombre))
			sql.concat(" NOMBRE = ? ");
		if (!StringUtils.isNullOrEmpty(ape))
			sql.concat(" APELLIDOS = ? ");
		if (!StringUtils.isNullOrEmpty(fecha))
			sql.concat(" FECHA = ? ");

		sql.concat("WHERE DNI = ?");

		PreparedStatement miStatement = myConexion.prepareStatement(sql);

		miStatement.setString(1, nombre);
		miStatement.setString(2, ape);
		miStatement.setString(3, fecha);
		miStatement.setString(4, dni);

		miStatement.executeUpdate();

	}

	public void insertCliente(String nom, String pa, int ener, int azu, int gra_satur, int s, int pro)
			throws SQLException {

		Connection myConexion = DriverManager.getConnection(url, userBD, passBD);

		String insert = "INSERT INTO comida (nombre, pais, energia, azucar,grasas_saturadas,sal,proteinas)"
				+ "VALUES (?,?,?,?,?,?)";

		PreparedStatement miStatement = myConexion.prepareStatement(insert);

		miStatement.setString(1, nom);
		miStatement.setString(2, pa);
		miStatement.setInt(3, ener);
		miStatement.setInt(4, azu);
		miStatement.setInt(5, gra_satur);
		miStatement.setInt(6, s);
		miStatement.setInt(7, pro);

		miStatement.executeUpdate();

	}

	public void deleteFromClientes(String nom) throws SQLException {
		Connection myConexion = DriverManager.getConnection(url, userBD, passBD);

		String insert = "DELETE FROM Clientes where nombre=?";

		PreparedStatement miStatement = myConexion.prepareStatement(insert);

		miStatement.setString(1, nom);

		miStatement.executeUpdate();

	}

}
