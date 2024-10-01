package clases.sistemaDeArchivos;

import clases.sistemaDeArchivos.condiciones.Condicion;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class ElementoSA {
    private String nombre;
    private final LocalDate fechaCreacion; //final -una vez instanciada no se va a cambiar
    private LocalDate fechaUltimaModificacion;

    public ElementoSA(String nombre) {
        this.nombre = nombre;
        this.fechaCreacion = LocalDate.now();
        this.fechaUltimaModificacion = LocalDate.now();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        setFechaUltimaModificacion();
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDate getFechaUltimaModificacion() {
        return fechaUltimaModificacion;
    }

    protected void setFechaUltimaModificacion() {
        this.fechaUltimaModificacion = LocalDate.now();
    } //solo mis hijos acceden para cambiarlo

    public abstract double getTamanio();

    public abstract int getCantidadElementos();

    protected abstract ArrayList<Archivo> buscar(Condicion c);

    @Override
    public boolean equals(Object o) {
        try {
            ElementoSA that = (ElementoSA) o;
            return nombre.equals(that.getNombre());
        } catch (Exception e) {
            return false;
        }
    }


}
