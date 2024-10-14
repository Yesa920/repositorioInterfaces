package Interfaz;

public class Encontrar_el_Mayor_y_el_Menor {
	public static void main (String [] args) {
		int [] numeros = new int[10];
		numeros[1]=10;
		numeros[2]=14;
		numeros[3]=3;
		numeros[4]=90;
		numeros[5]=54;
		numeros[6]=1;
		numeros[7]=65;
		numeros[8]=789;
		numeros[9]=67;
		numeros[0]=90;
		
		int grande= numeros[0]; 
		int pequeno = numeros[0];
		
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]>grande) {
				grande = numeros[i];
			}
			else if (pequeno>numeros[i]) {
				pequeno = numeros[i];
			}
			
		}
		System.out.println("El numero más grande es "+grande);
		System.out.println("El numero más pequeño es "+pequeno);
	}
}
