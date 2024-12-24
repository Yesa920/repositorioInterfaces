package interfaces.ejercicio6;

public class Principal {
	public static void main(String[] args) {
		
		Producto elem1 = new Electrodomestico("Lavadora", 100);
		Producto elem2 = new Electrodomestico("Nevera", 800);
		Producto elem3 = new Electrodomestico("Microondas", 50);
		
		Producto ropa1 = new Ropa("Camiseta", 10);
		Producto ropa2 = new Ropa("Pantalón", 10);
		
		System.out.println("Electrodomesticos");
		
		System.out.println(elem1.obtenerNombre()+
		"\n"+ elem1.obtenerPrecio()+
		"\n"+elem2.obtenerNombre()+
		"\n"+elem2.obtenerPrecio()+
		"\n"+elem3.obtenerNombre()+
		"\n"+elem3.obtenerPrecio()+
		"\n");
		
		System.out.println("Ropa");
		
		System.out.println(ropa1.obtenerNombre()+
		"\n"+ ropa1.obtenerPrecio()+
		"\n"+ropa2.obtenerNombre()+
		"\n"+ropa2.obtenerPrecio());
		
		
	}
}
