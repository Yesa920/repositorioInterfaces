package Interfaz;

public class Suma_multiplos_de_3_y_5 {
	public static void main(String[] args) {
        int resultado = 0;

        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                resultado += i;
            }
        }

        System.out.println("La suma de todos los múltiplos de 3 y 5 entre 1 y 1000 es: " + resultado);
    }
}
