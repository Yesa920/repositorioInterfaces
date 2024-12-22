package abstractas.ejercicio8;

public class ProductoRopa extends Producto {
    public double getIMPUESTO() {
		return IMPUESTO;
	}

	public void setIMPUESTO(double Imp) {
		IMPUESTO = Imp;
	}

	public double getDESCUENTO() {
		return DESCUENTO;
	}

	public void setDESCUENTO(double Desc) {
		DESCUENTO = Desc;
	}

	private double IMPUESTO = 0.08; 
    private double DESCUENTO = 0.05; 

    public ProductoRopa(String nom, double preBas) {
        super(nom, preBas);
    }

    @Override
    public void calcularPrecioFinal() {
        double precioConImpuesto = precioBase + (precioBase * IMPUESTO);
        double resultado = precioConImpuesto - (precioConImpuesto * DESCUENTO);
        System.out.println(resultado);
    }
}
