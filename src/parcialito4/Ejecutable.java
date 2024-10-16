package parcialito4;

import java.time.LocalDate;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  PreferenciaTitulo pTitulo = new PreferenciaTitulo("el eterno resplandor");
      
	  Usuario u1 = new Usuario("Ariel", LocalDate.of(2000, 01, 01),pTitulo);
      
      Pelicula p1 = new Pelicula("el eterno resplandor de una mente sin recuerdos","Michel Gondry", LocalDate.of(2004,03,9));
      p1.addGenero("Drama");
      p1.addGenero("Romance");
      p1.addGenero("Ciencia Ficcion");
      
      Pelicula p2 = new Pelicula("Corazon Valiente","Mel Gibson", LocalDate.of(1995,05,18));
      p2.addGenero("Drama");
      p2.addGenero("Biografia");
      p2.addGenero("Belico");
      
      System.out.println("Le gusta a " + u1.getNombre() + " la pelicula " + p1.getTitulo());
      System.out.println(u1.leGusta(p1));
      
      System.out.println("Le gusta a " + u1.getNombre() + " la pelicula " + p2.getTitulo());
      System.out.println(u1.leGusta(p2));
      
      PreferenciaGenero pdrama = new PreferenciaGenero("Drama");
      u1.setPref(pdrama);
      System.out.println("...... Se cambian preferencias del usuario .......");
      
      System.out.println("Le gusta a " + u1.getNombre() + " la pelicula " + p1.getTitulo());
      System.out.println(u1.leGusta(p1));
      
      System.out.println("Le gusta a " + u1.getNombre() + " la pelicula " + p2.getTitulo());
      System.out.println(u1.leGusta(p2));
      
      PreferenciaAnd pAnd = new PreferenciaAnd(pTitulo, pdrama);
      u1.setPref(pAnd);
      System.out.println("...... Se cambian preferencias del usuario un and .......");
      
      System.out.println("Le gusta a " + u1.getNombre() + " la pelicula " + p1.getTitulo());
      System.out.println(u1.leGusta(p1));
      
      System.out.println("Le gusta a " + u1.getNombre() + " la pelicula " + p2.getTitulo());
      System.out.println(u1.leGusta(p2));
      
      
      
      
      
	}

}
