package cLSESES;

public class Categoria  {
	static int numcat = 0 ;
	private int idCat;
	private String categoria;
	public Categoria (String categoria ) {
		this.idCat = ++numcat ;
		this.categoria = categoria;
	}
	public int getidCat() {
		return idCat;
	}
	public void setidCat (int idCat) {
		this.idCat = idCat;
		
	}

	public String getcategoria() {
		return categoria;
	}
	public void setcategoria (String  categoria) {
		this.categoria = categoria;		
	}
	public String toString() {
		return this.categoria;
	}

}
