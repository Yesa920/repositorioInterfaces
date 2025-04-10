package com.example.bbddConnector;

public class Comida {
	protected String nombre;
	protected String pais;
	protected int energia;
	protected int azucar;
	protected int grasas_saturadas;
	protected int sal;
	protected int proteinas;

	public Comida() {

	}

	public Comida(String nom, String pa, int ener, int azu, int gra_satur, int s, int pro) {
		super();
		this.nombre = nom;
		this.pais = pa;
		this.energia = ener;
		this.azucar = azu;
		this.grasas_saturadas = gra_satur;
		this.sal = s;
		this.proteinas = pro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nom) {
		this.nombre = nom;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pa) {
		this.pais = pa;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int ener) {
		this.energia = ener;
	}

	public int getAzucar() {
		return azucar;
	}

	public void setAzucar(int azu) {
		this.azucar = azu;
	}

	public int getGrasas_saturadas() {
		return grasas_saturadas;
	}

	public void setGrasas_saturadas(int gra_satur) {
		this.grasas_saturadas = gra_satur;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int s) {
		this.sal = s;
	}

	public int getProteinas() {
		return proteinas;
	}

	public void setProteinas(int pro) {
		this.proteinas = pro;
	}

	@Override
	public String toString() {
		return "Comida [nombre=" + nombre + ", pais=" + pais + ", energia=" + energia + ", azucar=" + azucar
				+ ", grasas_saturadas=" + grasas_saturadas + ", sal=" + sal + ", proteinas=" + proteinas + "]";
	}

}
