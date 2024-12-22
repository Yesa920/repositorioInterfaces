package abstractas.ejercicio8;

public class ProductoAlimenticio extends Producto{
	private double DESCUENTO = 0.10; 

    public ProductoAlimenticio(String nom, double preBas) {
        super(nom, preBas);
    }

    @Override
   
    public void calcularPrecioFinal() {
    	double resultado = precioBase - (precioBase * DESCUENTO);
 	   	System.out.println(resultado); 
    }
    
}
