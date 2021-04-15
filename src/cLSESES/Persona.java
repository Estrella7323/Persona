package cLSESES;

public class Persona {
	private String nombre;
	private int dni;
	private Domicilio direccion;
	private Categoria cat;
	private Nacionalidad pais;
	
	public Persona(int dni , String nombre , Categoria cat , Nacionalidad pais) {
		this.dni = dni;
		this.nombre = nombre;
		this.cat = cat;
		this.pais = pais;
		this.direccion = new Domicilio(/*"Av.Lima","100","Miraflores"*/);
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}

	public Domicilio getDireccion() {
		return direccion;
	}
	public void setDireccion(Domicilio direccion) {
		this.direccion = direccion;
	}


	public Categoria getCat() {
		return cat;
	}
	public void setCat(Categoria cat) {
		this.cat = cat;
	}


	public Nacionalidad getPais() {
		return pais;
	}
	public void setPais(Nacionalidad pais) {
		this.pais = pais;
	}
	
	public String toString() {
		return "Dni\t; "+ this.dni+"\n"+
	    "Nombre\t; " + this.nombre+"\n"+
	    "Direccion\t; " + this.direccion+"\n"+
	    "Categoria\t; " + this.cat+"\n"+
	    "Nacionalidad\t; " + this.pais;
	}
}

