package cLSESES;

public class Principal {
	public static void main(String[] arg) {
		Nacionalidad [] paises = new Nacionalidad[3];
		
		for (int i = 0 ; i<3 ; i++)
			
			paises[i] = new Nacionalidad("Peru"+(i+1));
		
		Categoria cate = new Categoria("Asociado");
		
		Persona juan = new Persona(2000,"Juan Perez", cate ,paises[0]);
		
		System.out.println(juan);
		
	}
}
