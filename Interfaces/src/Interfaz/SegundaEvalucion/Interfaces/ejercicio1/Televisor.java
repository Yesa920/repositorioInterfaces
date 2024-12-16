package interfaces;

public class Televisor implements Dispositivo{

	@Override
	public String encender() {
		
		return "El televisor sea encendido";
	}

	@Override
	public String apagar() {
		
		return "El televisor sea apagado";
	}
	
}
