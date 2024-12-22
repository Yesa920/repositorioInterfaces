package abstractas.ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main (String [] args) {
		ArrayList<Trabajador> trabajadores = new ArrayList<>();

   
        trabajadores.add(new Programador("Alice", 40, 30.0));
        trabajadores.add(new Diseñador("Bob", 5, 500.0));
        trabajadores.add(new Gerente("Charlie", 3000.0, 500.0));

        for (Trabajador trabajador : trabajadores) {
            trabajador.trabajar();
            trabajador.mostrarInformacion();
            System.out.println();
        }
    }
}

