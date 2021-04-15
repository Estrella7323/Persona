package cLSESES;

public class Nacionalidad {
	static int numNac = 100;
	private int idNac;
	private String nacionalidad;
	
	public Nacionalidad (String nacionalidad) {
		this.idNac = ++numNac;
		this.setNacionalidad(nacionalidad);
	}
	public int getIdNac() {
		return idNac;
	}
	public void  getidNac(int idNac) {
		this.idNac = idNac;
	}
	public String getNacionalidad() {
		return nacionalidad ;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String toString() {
		return this.nacionalidad;
	}
}
