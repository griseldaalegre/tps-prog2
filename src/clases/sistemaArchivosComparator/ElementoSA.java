package clases.sistemaArchivosComparator;

import clases.sistemaArchivosComparator.condiciones.Condicion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class ElementoSA implements Comparable<ElementoSA>{
    private String nombre;    //get y set
    private LocalDate fCreacion;  //get

    public ElementoSA(String nombre) {
        this.nombre = nombre;
        this.fCreacion = LocalDate.now();
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getfCreacion() {
        return fCreacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        try {
            ElementoSA that = (ElementoSA) o;
            return nombre.equals(that.getNombre());
        } catch (Exception e){
            return false;
        }
    }

    public abstract double getTamanio();

    public abstract int cantElementos();

    public abstract ArrayList<Archivo> buscar(Condicion condicion);

    public abstract ElementoSA getCopia();

    public ArrayList<Archivo> buscarOrdenado(Condicion condicion, Comparator<ElementoSA> orden){
        ArrayList<Archivo> resultado = this.buscar(condicion);
        Collections.sort(resultado, orden);
        return resultado;
    }


    public String toString(){
        return nombre + "("+this.getTamanio()+"Kb.)";
    }

    @Override
    public int compareTo(ElementoSA o) {
        return this.getNombre().compareTo(o.getNombre());
    }
}
