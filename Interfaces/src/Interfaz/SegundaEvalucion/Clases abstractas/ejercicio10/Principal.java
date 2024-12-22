package abstractas.ejercicio10;

public class Principal {
	public static void main (String [] args) {
		 Transporte barco = new Barco("Barco de carga");
	        Transporte avión = new Avion("Avión comercial");
	        Transporte tren = new Tren("Tren de alta velocidad");

	       
	        System.out.println("Inicio del viaje:");
	        barco.desplazarse();
	        barco.parar();

	        avión.desplazarse();
	        avión.parar();

	        tren.desplazarse();
	        tren.parar();

	        System.out.println("Fin del viaje.");
	}
}
