package practicaParcial.figuritas;

import practicaParcial.figuritas.condiciones.Condicion;

import java.util.ArrayList;

public class Figurita extends ComponenteFigurita implements Comparable<Figurita> {
    private String album;
    private int numero;
    private double precio;

    public Figurita(String nombre, String album, int numero, double precio) {
        super(nombre);
        this.album = album;
        this.numero = numero;
        this.precio = precio;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Figurita> buscar(Condicion c) {
        ArrayList<Figurita> resultado = new ArrayList<>();
        if (c.cumple(this)) {
            resultado.add(this);
        }
        return resultado;
    }

    @Override
    public int compareTo(Figurita otra) {
        int resultado = 0;
        if (this.getPrecio() == otra.getPrecio()) {
            resultado = this.getNombre().compareTo(otra.getNombre()); // si estas son
        } else {
            resultado = 1;
        }
        return resultado;
    }
    //Los listados se ordenan siempre
    //por el precio de la figurita y en caso de dos figuritas con el mismo precio,
    // se ordenan alfabéticamente por su
    //nombre

}
