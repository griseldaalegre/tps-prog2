package parcialito4;

import java.time.LocalDate;

public class Usuario {
	private String nombre;
	private LocalDate fechaNacimiento;
    private Preferencia pref;
    
	public Usuario(String nombre, LocalDate fechaNacimiento, Preferencia pp) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.pref = pp;
	}
	

	public Preferencia getPref() {
		return pref;
	}


	public void setPref(Preferencia pref) {
		this.pref = pref;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public boolean leGusta(Pelicula pp) {
		return pref.cumple(pp);
	}

}
