package abstractas.ejercicio5;

public class Principal {
	public static void main (String [] args) {
		 Electrodomestico refrigerador = new Refrigerador();
	     Electrodomestico lavadora = new Lavadora();
	     Electrodomestico microondas = new Microondas();
	     
	     refrigerador.encender();
	        refrigerador.funcionPrincipal();

	        lavadora.encender();
	        lavadora.funcionPrincipal();

	        microondas.encender();
	        microondas.funcionPrincipal();
	        
	}
}
