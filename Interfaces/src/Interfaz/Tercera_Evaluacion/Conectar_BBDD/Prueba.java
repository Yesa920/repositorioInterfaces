package com.example.bbDDConnector;

import java.sql.SQLException;
import java.util.List;

import modelo.Cliente.Cliente;

public class Prueba {

	public static void main(String[] args) throws SQLException {

		CRUD crud = new CRUD();

		List<Cliente> clientes = crud.getClientes();

		for (Cliente c : clientes) {
			System.out.println(c.getNombre());
			System.out.println(c.getApellidos());
			System.out.println(c.getDni());
			System.out.println(c.getFecha());
		}

		crud.insertCliente("primi", "ape", "351321", "19850312", "user", "pass");

	}

}
