package parcialito4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pelicula {

	private String titulo;
	private String director;
	private LocalDate fechaLanzamiento;
	private ArrayList<String> generos;
	
	public Pelicula(String titulo, String director, LocalDate fechaLanzamiento) {
		this.titulo = titulo;
		this.director = director;
		this.fechaLanzamiento = fechaLanzamiento;
		this.generos = new ArrayList<String>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public LocalDate getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}
	
	public void addGenero(String ss) {
		if (!generos.contains(ss)) {
			generos.add(ss);
		}
	}
	
	public void removeGenero(String ss) {
		generos.remove(ss);
		
	}

	public boolean tieneGenero(String ss) {
	  return generos.contains(ss);
	}


}
