package interfaces.ejercicio10;

public class PagoConTarjeta implements Pago{
	 @Override
	    public void procesarPago(double monto) {
	        System.out.println("Procesando pago de " + monto + " mediante Tarjeta.");
	    }
}
