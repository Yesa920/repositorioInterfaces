package Conversiones.ejercicio12;

import java.util.ArrayList;

import abstractas.ejercicio1.Vehiculos;

public class Principal {

	public static void main(String[] args) {
		
		
		ArrayList <Vehiculo> listaDeVehiculos = new ArrayList <>();
		
		listaDeVehiculos.add(new Coche());
		listaDeVehiculos.add(new Moto());
		listaDeVehiculos.add(new Coche());
		listaDeVehiculos.add(new Moto());
		//Instance of buscado por internet
		for (Vehiculo vehiculo : listaDeVehiculos) {
            if (vehiculo instanceof Coche) {
                System.out.println("Este es un objeto de tipo Coche:");
            } else if (vehiculo instanceof Moto) {
                System.out.println("Este es un objeto de tipo Moto:");
            }
           
            vehiculo.mostrarTipo();
        }
		
		

	}

}
