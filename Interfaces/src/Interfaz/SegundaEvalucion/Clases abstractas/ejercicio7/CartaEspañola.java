package abstractas.ejercicio7;

public class CartaEspañola extends Carta{

	public CartaEspañola(String val, String pal){
		super(val,pal);
	}
	
	
	public CartaEspañola(){
		
	}
	
	@Override
	public void mostrarValor() {
		
		System.out.println("Carta Española: "+ valor +" de " + palo);
	}

}
