package FantasyFutbol;

public class Plantilla {
	private String defensa;
	private String defensa2;
	private String defensa3;
	private String defensa4;
	private String centrocampista;
	private String centrocampista2;
	private String centrocampista3;
	private String centrocampista4;
	private String centrocampista5;
	private String delantero;
	private String delantero2;
	private String delantero3;

	public Plantilla() {

	}

	public Plantilla(String defensa, String defensa2, String defensa3, String defensa4, String centrocampista,
			String centrocampista2, String centrocampista3, String centrocampista4, String delantero,
			String delantero2) {
		this.defensa = defensa;
		this.defensa2 = defensa2;
		this.defensa3 = defensa3;
		this.defensa4 = defensa4;
		this.centrocampista = centrocampista;
		this.centrocampista2 = centrocampista2;
		this.centrocampista3 = centrocampista3;
		this.centrocampista4 = centrocampista4;
		this.delantero = delantero;
		this.delantero2 = delantero2;
	}

	public Plantilla(String defensa, String defensa2, String defensa3, String defensa4, String centrocampista,
			String centrocampista2, String centrocampista3, String centrocampista4, String centrocampista5,
			String delantero) {
		this.defensa = defensa;
		this.defensa2 = defensa2;
		this.defensa3 = defensa3;
		this.defensa4 = defensa4;
		this.centrocampista = centrocampista;
		this.centrocampista2 = centrocampista2;
		this.centrocampista3 = centrocampista3;
		this.centrocampista4 = centrocampista4;
		this.centrocampista5 = centrocampista5;
		this.delantero = delantero;
	}

	public Plantilla(String defensa, String defensa2, String defensa3, String defensa4, String centrocampista,
			String centrocampista2, String centrocampista3, String centrocampista4, String centrocampista5,
			String delantero, String delantero2, String delantero3) {
		super();
		this.defensa = defensa;
		this.defensa2 = defensa2;
		this.defensa3 = defensa3;
		this.defensa4 = defensa4;
		this.centrocampista = centrocampista;
		this.centrocampista2 = centrocampista2;
		this.centrocampista3 = centrocampista3;
		this.centrocampista4 = centrocampista4;
		this.centrocampista5 = centrocampista5;
		this.delantero = delantero;
		this.delantero2 = delantero2;
		this.delantero3 = delantero3;
	}

	public String getDefensa() {
		return defensa;
	}

	public void setDefensa(String defensa) {
		this.defensa = defensa;
	}

	public String getDefensa2() {
		return defensa2;
	}

	public void setDefensa2(String defensa2) {
		this.defensa2 = defensa2;
	}

	public String getDefensa3() {
		return defensa3;
	}

	public void setDefensa3(String defensa3) {
		this.defensa3 = defensa3;
	}

	public String getDefensa4() {
		return defensa4;
	}

	public void setDefensa4(String defensa4) {
		this.defensa4 = defensa4;
	}

	public String getCentrocampista() {
		return centrocampista;
	}

	public void setCentrocampista(String centrocampista) {
		this.centrocampista = centrocampista;
	}

	public String getCentrocampista2() {
		return centrocampista2;
	}

	public void setCentrocampista2(String centrocampista2) {
		this.centrocampista2 = centrocampista2;
	}

	public String getCentrocampista3() {
		return centrocampista3;
	}

	public void setCentrocampista3(String centrocampista3) {
		this.centrocampista3 = centrocampista3;
	}

	public String getCentrocampista4() {
		return centrocampista4;
	}

	public void setCentrocampista4(String centrocampista4) {
		this.centrocampista4 = centrocampista4;
	}

	public String getCentrocampista5() {
		return centrocampista5;
	}

	public void setCentrocampista5(String centrocampista5) {
		this.centrocampista5 = centrocampista5;
	}

	public String getDelantero() {
		return delantero;
	}

	public void setDelantero(String delantero) {
		this.delantero = delantero;
	}

	public String getDelantero2() {
		return delantero2;
	}

	public void setDelantero2(String delantero2) {
		this.delantero2 = delantero2;
	}

	public String getDelantero3() {
		return delantero3;
	}

	public void setDelantero3(String delantero3) {
		this.delantero3 = delantero3;
	}

	@Override
	public String toString() {
		return "Plantilla [defensa=" + defensa + ", defensa2=" + defensa2 + ", defensa3=" + defensa3 + ", defensa4="
				+ defensa4 + ", centrocampista=" + centrocampista + ", centrocampista2=" + centrocampista2
				+ ", centrocampista3=" + centrocampista3 + ", centrocampista4=" + centrocampista4 + ", centrocampista5="
				+ centrocampista5 + ", delantero=" + delantero + ", delantero2=" + delantero2 + ", delantero3="
				+ delantero3 + "]";
	}

}