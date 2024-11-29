package SegundaEvaluacion;

import java.util.Scanner;

public class Principal_Peliculas {

	public static void main(String[] args) {
		Pelicula pelicula = new Pelicula();
		Serie serie = new Serie();
		Temporada temporada = new Temporada();
		Capitulo capitulo = new Capitulo();

		Scanner leer = new Scanner(System.in);
		System.out
				.println("Dime una serie o una pelicula para serie. " + "Pulse 1 para pelicula ,Pulse 2 para serie  ");
		int PeliOSerie = leer.nextInt();

		if (PeliOSerie == 1) {
			System.out.println("Introduzca el nombre");
			String nombrePelicula = leer.next();
			System.out.println("Introduzca el genero");
			String generoPelicula = leer.next();
			System.out.println("Introduzca el año");
			int agnoPelicula = leer.nextInt();
			System.out.println("Introduzca el tiempo de duración en horas");
			double duracionPelicula = leer.nextInt();

			pelicula.setNombrePelicula(nombrePelicula);
			pelicula.setGeneroPelicula(generoPelicula);
			pelicula.setAgno(agnoPelicula);
			pelicula.setDuracionPelicula(duracionPelicula);

			System.out.println("Todo junto es " + pelicula.getNombrePelicula() + " " + pelicula.getGeneroPelicula()
					+ " " + pelicula.getAgno() + " " + pelicula.getDuracionPelicula());
		} else if (PeliOSerie == 2) {
			System.out.println("Introduzca el nombre");
			String nombreSerie = leer.next();
			System.out.println("Introduzca el genero");
			String generoSerie = leer.next();
			System.out.println("Introduzca la temporada");
			int temporadaSerie = leer.nextInt();
			System.out.println("Introduzca la temporada");
			String idiomaSerie = leer.next();

			serie.setNombreSerie(nombreSerie);
			serie.setGeneroSerie(generoSerie);
			serie.setTemporada(temporadaSerie);
			serie.setIdiomaSerie(idiomaSerie);

			System.out.println("Dentro de la serie hay varias temporadas");
			System.out.println("Introduzca el nombre de la temporada");
			String nombreTemporada = leer.next();
			System.out.println("Introduzca el capitulo");
			int numeroTemporada = leer.nextInt();

			temporada.setNombreTemporada(nombreTemporada);
			temporada.setCapitulos(numeroTemporada);

			System.out.println("Dentro de la temporada hay varios capitulos");
			System.out.println("Introduzca el nombre de la temporada");
			String nombreCapitulo = leer.next();
			System.out.println("Introduzca el capitulo");
			int duracionCapitulo = leer.nextInt();

			capitulo.setNombreCapitulo(nombreCapitulo);
			capitulo.setDuracionCapitulo(duracionCapitulo);

			// separado

			System.out.println("Todo la serie junta es " + serie.getNombreSerie() + " " + serie.getGeneroSerie() + " "
					+ serie.getNombreSerie() + " " + serie.getTemporada());
			System.out.println("La temporada es " + temporada.getNombreTemporada() + " " + temporada.getCapitulos());
			System.out.println("Y el capitulo es " + capitulo.getNombreCapitulo() + capitulo.getDuracionCapitulo());
			// todo junto

			System.out.println("Todo la serie junta es " + serie.getNombreSerie() + " " + serie.getGeneroSerie() + " "
					+ serie.getNombreSerie() + " " + serie.getTemporada() + " La temporada es "
					+ temporada.getNombreTemporada() + " " + temporada.getCapitulos() + " Y el capitulo es "
					+ capitulo.getNombreCapitulo() + capitulo.getDuracionCapitulo());

		}

		else {
			System.err.println("No has elegido ninguna de las opciones intentalo" + "de nuevo");
		}
		leer.close();
	}

}
