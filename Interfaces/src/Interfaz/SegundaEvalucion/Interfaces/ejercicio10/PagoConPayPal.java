package interfaces.ejercicio10;

public class PagoConPayPal implements Pago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de " + monto + " mediante PayPal.");
    }
}
