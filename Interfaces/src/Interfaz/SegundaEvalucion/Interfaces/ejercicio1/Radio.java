package interfaces;

public class Radio implements Dispositivo{

	@Override
	public String encender() {
		
		return "El radio sea encendido";
	}

	@Override
	public String apagar() {
		
		return "El radio sea apagado";
	}
	
}
