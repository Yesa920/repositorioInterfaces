package SegundaEvaluacion.relacionesClases;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		Coche coche1 = new Coche();

		coche1.setId(14);
		coche1.setMarca("Seat");
		coche1.setModelo("Ibiza");

		List<Propietario> listaDePropietario = new ArrayList<>();

		Propietario prop1 = new Propietario(14, "Adrian", "Vargas");
		Propietario prop2 = new Propietario(17, "Sagar", "Amigo");

		listaDePropietario.add(prop1);
		listaDePropietario.add(prop2);

		coche1.setPropietario(listaDePropietario);

		System.out.println("El auto " + coche1.getMarca() + " " + coche1.getModelo() + " tiene como propietarios a: "
				+ coche1.getPropietario().toString());

	}
}
