package SegundaEvaluacion;

public class Serie {
	private String nombre;
	private String genero;
	private int temporada;
	private String idiomaSerie;

	public Serie(String nom, String gen, int tem, String idomSer) {
		this.nombre = nom;
		this.genero = gen;
		this.temporada = tem;
		this.idiomaSerie = idomSer;
	}

	public Serie() {

	}

	public String getNombreSerie() {
		return nombre;
	}

	public void setNombreSerie(String nom) {
		this.nombre = nom;
	}

	public String getGeneroSerie() {
		return genero;
	}

	public void setGeneroSerie(String gen) {
		this.genero = gen;
	}

	public int getTemporada() {
		return temporada;
	}

	public void setTemporada(int tem) {
		this.temporada = tem;
	}

	public String getIdiomaSerie() {
		return idiomaSerie;
	}

	public void setIdiomaSerie(String idomSer) {
		this.idiomaSerie = idomSer;
	}
}
