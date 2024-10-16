package Interfaz;

public class Contar_Vocales_en_un_Array_de_Caracteres {
	public static void main(String[] args) {
		String cadena = "buenAs";

		char[] arrayCaracteres = new char[cadena.length()];
		arrayCaracteres = cadena.toCharArray();
		
		arrayCaracteres[0] = (char) Character.toLowerCase(0);
		int vocales = 0;
		for (int i = 0; i <= cadena.length() - 1; i++) {
			if (arrayCaracteres[i] == 'a' || arrayCaracteres[i] == 'A'|| arrayCaracteres[i] == 'e' || arrayCaracteres[i] == 'E'
					|| arrayCaracteres[i] == 'i' || arrayCaracteres[i] == 'I'|| arrayCaracteres[i] == 'o'||arrayCaracteres[i] == 'O'||
					arrayCaracteres[i] == 'u'|| arrayCaracteres[i] == 'U') {
				vocales++;
			}
		}
		System.out.println("Tiene" + vocales);
	}
}
