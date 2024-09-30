package clases.libreria;

import java.util.ArrayList;

public class Producto {

	
	private String nombre; //Get y set
	private String autor;  //Get y set
	private double precio; //Get y set
	private int cantPaginas; //Get y set
	private String resumen; //Get y set
	private ArrayList<String> generos;
	
	public Producto(String nombre, String autor, double precio, int cantPaginas, String resumen) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.precio = precio;
		this.cantPaginas = cantPaginas;
		this.resumen = resumen;
		this.generos = new ArrayList<String>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantPaginas() {
		return cantPaginas;
	}

	public void setCantPaginas(int cantPaginas) {
		this.cantPaginas = cantPaginas;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	
	

	public ArrayList<String> getGeneros() {
		ArrayList<String> aux = new ArrayList<String>();
	/*	for(int i =0; i<generos.size();i++) {
			aux.add(generos.get(i));
		}*/ aux.addAll(generos);
		
		ArrayList<String> aux2 = new ArrayList<String>(generos);
		return new ArrayList<String>(generos);
		//NUNCA return generos;
	}
	
	public void addGenero(String nGenero) {
		nGenero = nGenero.toUpperCase();
		
	
		if (!generos.contains(nGenero)) {
			generos.add(nGenero);
		}
	}
	
	public boolean tieneGenero(String unGenero) {
		return generos.contains(unGenero.toUpperCase());
	}
	
	public void borraGenero(String sacarGenero) {
		generos.remove(sacarGenero);
	}
//NUNCA SETEAR DIRECTO
	public void setGeneros(ArrayList<String> generos) {
		//this.generos = generos;
		this.generos.addAll(generos);
	}
	
	
	//MUY NECESARIO PARA QUE FUNCIONE EL YA COMPRO DE CLIENTE
	public boolean equals(Object o1) {
		try {
			Producto p1 = (Producto)o1;
			
			return nombre.equals(p1.getNombre()) &&
					resumen.equals(p1.getResumen())&&
					cantPaginas == p1.getCantPaginas();
		} catch(Exception e) {
			return false;
		}
	}
	
	
	
	
}
