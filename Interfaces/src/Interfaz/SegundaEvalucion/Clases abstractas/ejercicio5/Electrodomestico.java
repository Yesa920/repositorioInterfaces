package abstractas.ejercicio5;

public abstract class Electrodomestico {
	
	protected String marca;
	
	public Electrodomestico() {
		
	}
	public Electrodomestico(String mar) {
		this.marca = mar;
	}
	
	public abstract void funcionPrincipal();
	
	public void encender() {
		System.out.println("El electrodomestico esta encendido");
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String mar) {
		this.marca = mar;
	}
}