package interfaces.ejercicio10;

public class PagoEnEfectivo implements Pago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de " + monto + " en efectivo.");
    }

}
