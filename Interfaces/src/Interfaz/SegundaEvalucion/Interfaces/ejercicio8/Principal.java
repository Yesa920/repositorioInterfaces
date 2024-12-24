package interfaces.ejercicio8;

public class Principal {

	public static void main(String[] args) {
		 Conversor conversorDolaresAEuros = new Conversor() {
	            private static final double TASA_CAMBIO = 0.96; 

	            @Override
	            public double convertir(double dolares) {
	                return dolares * TASA_CAMBIO;
	            }
	        };

	        double dolares = 100.0;
	        double euros = conversorDolaresAEuros.convertir(dolares);
	        System.out.println(dolares + " dólares son a " + euros + " euros.");

	       
	        double metros = 2.5;
	        double centimetros = Conversor.convertirMetrosACentimetros(metros);
	        System.out.println(metros + " metros son a " + centimetros + " centímetros.");
	    }

	}


