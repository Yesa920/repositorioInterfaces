package SegundaEvaluacion.relacionesClases;

import java.util.List;

public class Coche {

	private int id;
	private String marca;
	private String modelo;
	private List<Propietario> propietario;

	public Coche(int identidicacion, String mar, String mod, List<Propietario> prop) {
		this.id = identidicacion;
		this.marca = mar;
		this.modelo = mod;
		this.propietario = prop;

	}

	public Coche() {

	}

	public int getId() {
		return id;
	}

	public void setId(int identificacion) {
		this.id = identificacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String mar) {
		this.marca = mar;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String mod) {
		this.modelo = mod;
	}

	public List<Propietario> getPropietario() {
		return propietario;
	}

	public void setPropietario(List<Propietario> propi) {
		this.propietario = propi;
	}

	@Override
	public String toString() {
		return "Coche [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", propietario=" + propietario + "]";
	}

}
