package interfaces.ejercicio10;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		 System.out.println("Seleccione el método de pago:");
	        System.out.println("1. Tarjeta");
	        System.out.println("2. PayPal");
	        System.out.println("3. Efectivo");
	        int opcion = leer.nextInt();

	      Pago metodoDePago;

	        switch (opcion) {
	            case 1:
	                metodoDePago = new PagoConTarjeta();
	                break;
	            case 2:
	                metodoDePago = new PagoConPayPal();
	                break;
	            case 3:
	                metodoDePago = new PagoEnEfectivo();
	                break;
	            default:
	                System.out.println("Opción no válida. Se usará pago en efectivo por defecto.");
	                metodoDePago = new PagoEnEfectivo();
	        }

	        System.out.print("Ingrese el monto a pagar: ");
	        double monto = leer.nextDouble();
	        metodoDePago.procesarPago(monto);

	        leer.close();
	    }
	}

