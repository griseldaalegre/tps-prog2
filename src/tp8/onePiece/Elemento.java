package tp8.onePiece;

import clases.farmacia.Medicamento;
import clases.sistemaDeArchivos.ElementoSA;

public abstract class Elemento {
    private String nombre;
    private int edad;
    private double peso;
    private double fuerza;

    // Constructor
    public Elemento(String nombre, int edad, double peso, double fuerza) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.fuerza = fuerza;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getFuerza() {
        return fuerza;
    }

    public abstract double calcularFuerza();

    public abstract int calcularEdad();

    public abstract double calcularPeso();

    @Override
    public String toString() {
        return "Elemento{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", fuerza=" + fuerza +
                '}';
    }



}
