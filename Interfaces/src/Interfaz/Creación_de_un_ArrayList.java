package Interfaz;
import java.util.ArrayList;
public class Creación_de_un_ArrayList {
	public static void main (String [] args) {
		ArrayList<Integer> numeros = new ArrayList <Integer>();
		numeros.add(56);
		numeros.add(23);
		numeros.add(78);
		numeros.add(1);
		numeros.add(35436);
		for(Integer numero : numeros) {
			System.out.println(numero);
		}
	}
}
