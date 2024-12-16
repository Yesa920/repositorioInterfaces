package interfaces;

public class principal {
	public static void main(String [] args) {
		Dispositivo dis = new Televisor();
		Dispositivo radio = new Radio();
		
		System.out.println( dis.encender()); 
		System.out.println(dis.apagar()); 
		
		System.out.println(radio.encender()); 
		System.out.println(radio.apagar());
		
		
		
		
		
		
	}
}
