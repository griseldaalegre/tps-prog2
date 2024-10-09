package clases.sistemaArchivosComparadores;

import clases.sistemaArchivosComparadores.condiciones.Condicion;

import java.util.ArrayList;

public class Archivo extends ElementoSA {
    private double tamanio;   //get y set

    private String extension;

    public Archivo(String nombre, double tamanio, String extension) {
        super(nombre);
        this.tamanio = tamanio;
        this.extension = extension;
    }

    public double getTamanio() {
        return tamanio;
    }

    @Override
    public int cantElementos() {
        return 1;
    }

    @Override
    public ArrayList<Archivo> buscar(Condicion condicion) {
        ArrayList<Archivo> retorno = new ArrayList<>();
        if (condicion.cumple(this))
            retorno.add(this);
        return retorno;
    }

    @Override
    public ElementoSA getCopia() {
        return new Archivo(this.getNombre(), this.getTamanio(), extension);
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
}
