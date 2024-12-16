package interfaces.ejercicio3;

public class Pricinpal {

	public static void main(String[] args) {
		Vehiculo bici  = new Bicicleta(null);
		Vehiculo coche  = new Coche(null);

        Vehiculo[] vehiculos = {
            new Coche("Toyota"),
            new Bicicleta("Montaña"),
            new Coche("Ford"),
            new Bicicleta("Carretera")
        };

       
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.acelerar();
            vehiculo.frenar();
            System.out.println(); 
        }
	

	}

}
