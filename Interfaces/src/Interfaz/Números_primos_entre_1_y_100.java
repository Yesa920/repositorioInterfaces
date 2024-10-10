package Interfaz;

public class Números_primos_entre_1_y_100 {
	public static void main (String [] args) {

        for (int i = 2; i <= 100; i++) {
            if (primo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean primo(int numero) {
        for (int j = 2; j <= Math.sqrt(numero); j++) {
            if (numero % j == 0) {
                return false;
            }
        }
        return true;
    }
	
}
