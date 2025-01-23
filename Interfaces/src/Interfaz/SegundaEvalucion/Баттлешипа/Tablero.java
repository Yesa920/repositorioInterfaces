package Hundir_la_flota;

public class Tablero {
	 private char[][] tablero;
	 private static final char VACIO = '~'; 
	 private static final char BARCO = 'B'; 
	 private static final char AGUA = '-';  
	 private static final char ACIERTO = 'X'; 
	 

	public Tablero() {
		tablero = new char[10][10];
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					tablero[i][j] = VACIO;
	       }	
     	}
	}  
	
	  public boolean colocarBarco(int fila, int columna, int tamano, char direccion) {
	        if (direccion == 'H') {
	            if (columna + tamano > 10) {
	            	return false;
	            }
	            	for (int i = 0; i < tamano; i++) {
	            		if (tablero[fila][columna + i] != VACIO) {
	            			return false; 
	            		}
	            	}
	            	for (int i = 0; i < tamano; i++) {
	            		tablero[fila][columna + i] = BARCO;
	            	}
	        } else if (direccion == 'V') { 
	            if (fila + tamano > 10) {
	            	return false;
	            }
	            	for (int i = 0; i < tamano; i++) {
	            		if (tablero[fila + i][columna] != VACIO) {
	            			return false; 
	            		}
	            	}
	            	for (int i = 0; i < tamano; i++) {
	            		tablero[fila + i][columna] = BARCO;
	            	}
	        } else {
	            return false; 
	        }
	        return true;
	    }

	    public String disparar(int fila, int columna) {
	        if (tablero[fila][columna] == BARCO) {
	            tablero[fila][columna] = ACIERTO;
	            return "¡Acierto!";
	        } else if (tablero[fila][columna] == VACIO) {
	            tablero[fila][columna] = AGUA;
	            return "Agua.";
	        } else {
	            return "Ya disparaste aquí.";
	        }
	    }
	    public void mostrarTablero() {
	        System.out.println("  0 1 2 3 4 5 6 7 8 9");
	        for (int i = 0; i < 10; i++) {
	            System.out.print(i + " ");
	            for (int j = 0; j < 10; j++) {
	                System.out.print(tablero[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}
