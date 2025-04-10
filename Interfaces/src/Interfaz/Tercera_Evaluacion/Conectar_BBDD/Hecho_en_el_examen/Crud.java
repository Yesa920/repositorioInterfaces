package ExamenProgramacion;

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
	private static final String url = "jdbc:MySQL://localhost:3306/examen_BBDD";

	public static List<Clientes> getClientes() {
		Clientes cliente = new Clientes();

		ArrayList<Clientes> clientesLista = new ArrayList<Clientes>();

		try {

			// 1.CREAR CONEXION
			Connection myConexion = DriverManager.getConnection(url, userBD, passBD);

			// 2. CREAR OBJETO STATEMENT
			Statement miStatement = myConexion.createStatement();

			// 3. EJECUTAR SQL
			ResultSet miResulset = miStatement.executeQuery("SELECT * FROM clientes");

			// 4. Leer resultset
			while (miResulset.next()) {

				System.out.println("Id:  " + miResulset.getString("id") + " ");
				cliente.setId(miResulset.getInt("id"));

				System.out.println("Nombre: " + miResulset.getString("nombre") + " ");
				cliente.setNombre(miResulset.getString("nombre"));

				System.out.println("Email: " + miResulset.getString("email") + " ");
				cliente.setEmail(miResulset.getString("email"));

				System.out.println("Fecha_registro: " + miResulset.getString("fecha_registro") + " ");
				cliente.setFecha_registro(miResulset.getString("fecha_registro"));

//				clientesLista.add(cliente);

			}

		} catch (Exception e) {
			System.out.println("No conecta!! " + e);
		}

		return clientesLista;

	}

	public void insertCliente(int id_usu, String nom, String ema, String fecha_regis) throws SQLException {

		Connection myConexion = DriverManager.getConnection(url, userBD, passBD);

		String insert = "INSERT INTO clientes_1 (id,nombre,email,fecha_registro)" + "VALUES (?,?,?,?)";

		PreparedStatement miStatement = myConexion.prepareStatement(insert);

		miStatement.setInt(1, id_usu);
		miStatement.setString(2, nom);
		miStatement.setString(3, ema);
		miStatement.setString(4, fecha_regis);

		miStatement.executeUpdate();

	}

}
