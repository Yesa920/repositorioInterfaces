package abstractas.ejercicio8;

public class Principal {
	public static void main (String [] args) {
		 Producto tv = new ProductoElectronico("Televisor", 500.0);
	        Producto manzana = new ProductoAlimenticio("Manzana", 2.0);
	        Producto pantalon = new ProductoRopa("Pantalón", 40.0);

	        
	        tv.calcularPrecioFinal();
	        manzana.calcularPrecioFinal();
	        pantalon.calcularPrecioFinal();
		
		
		
		
	}
}
