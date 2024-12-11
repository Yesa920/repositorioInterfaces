package Segunda_evaluacion.ejercicio1;

import java.util.Scanner;

public class Pagina_principal {
	public static void main(String[] args) {
		Circulo circulo = new Circulo();
		Figura figura = new Figura();
		Rectangulo rectangulo = new Rectangulo();
		Triangulo triangulo = new Triangulo();

		Scanner leer = new Scanner(System.in);
		System.out.println("Buenas la calculadora de figuras");
		System.out.println("Pulsa 1 para calcular un triangulo");
		System.out.println("Pulsa 2 para calcular un rectangulo");
		System.out.println("Pulsa 3 para calcular un circulo");
		int numero = leer.nextInt();

		switch (numero) {
		case 1:
			int[] listaDeLadosTriangulo = new int[4];
			System.out.println("Introduce los siguientes datos para averiguar el perimetro en cm");
			System.out.println("Introduce los 3 lados ");
			for (int i = 0; i < 3; i++) {

				int lados = leer.nextInt();
				listaDeLadosTriangulo[i] = lados;

			}
			System.out.println("Introduce la base");
			int baseTriangulo = leer.nextInt();
			System.out.println("Introduce la altura");
			int alturaTriangulo = leer.nextInt();

			int resultadoPerimetroTriangulo = triangulo.operacionPerimetroTriangulo(listaDeLadosTriangulo);
			double resultadoAreaTriangulo = triangulo.operacionAreaTriangulo(baseTriangulo, alturaTriangulo);

			System.out.println("Perimetro :" + resultadoPerimetroTriangulo);
			System.out.println("Area :" + resultadoAreaTriangulo);

			break;
		case 2:
			int[] listaDeLadosRectangulo = new int[5];
			System.out.println("Introduce los siguientes datos para averiguar el perimetro en cm");
			System.out.println("Introduce los 4 lados ");
			for (int i = 0; i < 4; i++) {

				int lados = leer.nextInt();
				listaDeLadosRectangulo[i] = lados;

			}
			System.out.println("Introduce la base");
			int baseRectangulo = leer.nextInt();
			System.out.println("Introduce la altura");
			int alturaReactangulo = leer.nextInt();

			int resultadoPerimetroRectangulo = rectangulo.operacionPerimetroRectangulo(listaDeLadosRectangulo);
			int resultadoAreaRectangulo = rectangulo.operacionAreaRectangulo(baseRectangulo, alturaReactangulo);

			System.out.println("Perimetro :" + resultadoPerimetroRectangulo);
			System.out.println("Area :" + resultadoAreaRectangulo);

			break;
		case 3:// perimetro 2.π x r area π r²
			int[] listaDeLadosCirculo = new int[5];
			System.out.println("Introduce los siguientes datos para averiguar el perimetro en cm");
			System.out.println("Introduce la radio");
			int radioCircuculo = leer.nextInt();

			double resultadoPerimetroCirculo = circulo.operacionPerimetroCirculo(radioCircuculo);
			double resultadoAreaCirculo = circulo.operacionAreaCirculo(radioCircuculo);

			System.out.println("Perimetro :" + resultadoPerimetroCirculo);
			System.out.println("Area :" + resultadoAreaCirculo);

			break;
		default:
			System.out.println("No has seleccionado ninguna de las opciones");
			break;

		}

	}
}
