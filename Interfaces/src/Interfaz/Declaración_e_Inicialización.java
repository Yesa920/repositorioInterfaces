package Interfaz;

public class Declaración_e_Inicialización {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            System.out.println("Vas por el numero "+ numeros[i]);
        }
    }

}
