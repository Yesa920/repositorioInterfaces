package abstractas.ejercicio8;

public class ProductoElectronico extends Producto{

	 private double IMPUESTO = 0.15; 

	    public double getIMPUESTO() {
		return IMPUESTO;
	}

	public void setIMPUESTO(double Imp) {
		IMPUESTO = Imp;
	}

		public ProductoElectronico(String nom, double preBas) {
	        super(nom, preBas);
	    }

	    @Override
	    public void calcularPrecioFinal() {
	    	double resultado = precioBase + (precioBase * IMPUESTO);
	        System.out.println(resultado); 
	    }

}
