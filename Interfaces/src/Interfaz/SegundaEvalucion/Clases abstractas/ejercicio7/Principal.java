package abstractas.ejercicio7;

public class Principal {
	public static void main (String [] args) {
		System.out.println("Mazo de Cartas Españolas:");
        String[] valoresEspañolas = {"1","2", "3", "4", "5", "6", "7", "10", "11", "12"};
        String[] palosEspañolas = {"Oros", "Copas", "Espadas", "Bastos"};

        for (String palo : palosEspañolas) {
            for (String valor : valoresEspañolas) {
                Carta cartaEspañola = new CartaEspañola(valor, palo);
                cartaEspañola.mostrarValor();
            }
        }

        System.out.println("\nMazo de Cartas de Poker:");
        String[] valoresPoker = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "AS"};
        String[] palosPoker = {"Corazones", "Diamantes", "Tréboles", "Picas"};

        for (String palo : palosPoker) {
            for (String valor : valoresPoker) {
                Carta cartaPoker = new CartaPoker(valor, palo);
                cartaPoker.mostrarValor();
            }
        }
    }
}

