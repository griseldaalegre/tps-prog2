package libreria;

import java.util.ArrayList;

public  class Cliente {

	
	private String nombre;
	private String apellido;
	private int dni;
	private String direccion;
	protected ArrayList<String> autores;
	protected ArrayList<String> generos;
	private double descuento;
	private ArrayList<Producto> compras;
	
	public Cliente(String nombre, String apellido, int dni, String direccion, double descuento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
		this.descuento = descuento;
		generos = new ArrayList<String>();
		autores = new ArrayList<String>();
		compras = new ArrayList<Producto>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	
	public void addAutorFavorito(String autor) {
		if (!autores.contains(autor)) {
			autores.add(autor);
		}
	}
	public boolean leGustaAutor(String autor) {
		return autores.contains(autor);
	}
	public void noMeGustaMasAutor(String autor) {
		autores.remove(autor);
	}
	
	public void addGeneroFavorito(String gene) {
		if (!generos.contains(gene)) {
			generos.add(gene);
		}
	}
	public boolean leGustaGenero(String gene) {
		return generos.contains(gene);
	}
	public void noMeGustaMasGenero(String gene) {
		generos.remove(gene);
	}
	
	public void addCompra(Producto p) {
		compras.add(p);
	}
	
	public boolean yaCompro(Producto p) {
		return compras.contains(p);
	}
	
	
	public boolean leGusta(Producto pp) {
		return autores.contains(pp.getAutor());
	};
		
	public String toString() {
		return nombre +":" +dni;
	}
	
	public boolean equals(Object c) {
		try{
			Cliente c1 = (Cliente)c;
			return c1.getDni()== dni;
		} catch(Exception e) {
			return false;
		}
	}
	
}
