package abstractas.ejercicio7;

public abstract class Carta {
	
	protected String valor;
	protected String palo;
	
	public Carta(String val, String pal) {
		this.valor = val;
		this.palo = pal;
	}
	
	public String getValor() {
		return valor;
	}

	public void setValor(String val) {
		this.valor = val;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String pal) {
		this.palo = pal;
	}

	public Carta() {
		
	}
	
	public abstract void mostrarValor();
	
}
