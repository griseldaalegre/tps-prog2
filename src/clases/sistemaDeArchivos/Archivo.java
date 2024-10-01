package clases.sistemaDeArchivos;

import clases.sistemaDeArchivos.condiciones.Condicion;

import java.time.LocalDate;
import java.util.ArrayList;

public class Archivo extends ElementoSA {
    private String extension;
    private double tamanio;

    public Archivo(String nombre, String extension, double tamanio) {
        super(nombre);
        this.extension = extension;
        this.tamanio = tamanio;
    }

    public String getExtension() {
        return extension;
    }

    public double getTamanio() {
        return tamanio;
    }

    @Override
    public int getCantidadElementos() {
        return 1;
    }


    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
        this.setFechaUltimaModificacion();
    }


    @Override
    public String toString() {
        return "Archivo{" +"Nombre= "+ getNombre() +
                " extension='" + extension + '\'' +
                ", tamanio=" + tamanio +
                '}';
    }

    @Override
    public ArrayList<Archivo> buscar(Condicion condicion) {
        ArrayList<Archivo> resultado = new ArrayList<>();
        if (condicion.cumple(this))//me paso yo
            resultado.add(this);
        return resultado;
    }

}
