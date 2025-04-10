package ExamenProgramacion;

import java.sql.SQLException;
import java.util.List;

public class Principal {
	public static void main(String[] args) {

		Crud crud = new Crud();
		List<Clientes> clientes = crud.getClientes();

		for (Clientes c : clientes) {
			System.out.println(c.getId());
			System.out.println(c.getNombre());
			System.out.println(c.getEmail());
			System.out.println(c.getFecha_registro());
		}
		try {
			crud.insertCliente(3, "Diego", "surviv@gmail.com", "0000-00-00");
			System.out.println("El cliente a sido correctamente añadido");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
