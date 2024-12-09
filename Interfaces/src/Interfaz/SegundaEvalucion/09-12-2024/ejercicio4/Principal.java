package ejercicio4;

public class Principal {
	public static void main(String [] args) {
		Empleado empleado = new Empleado();
		Programador programador= new Programador();
		Disenhador disenhador = new Disenhador();
		Gerente gerente = new Gerente();
		
		System.out.println("Nombre y dinero del programador");
		System.out.println(programador.getNombre());
		System.out.println(programador.getSalario());
		
		System.out.println("Nombre y dinero del diseñador");
		System.out.println(disenhador.getNombre());
		System.out.println(disenhador.getSalario());
		
		System.out.println("Nombre y dinero del gerente");
		System.out.println(gerente.getNombre());
		System.out.println(gerente.getSalario());
		
		
	}
}
