package abstractas.ejercicio7;

public class CartaPoker extends Carta{
	
	public CartaPoker(String valor, String pal){
		super(valor,pal);
	}
	
	
	public CartaPoker(){
		
	}

	@Override
	public void mostrarValor() {
	
		System.out.println("Carta de Poker: " + valor + " de " + palo);
	}
}
