package parcialitos.empresaDeVentas;

import clases.farmacia.Condicion;
import clases.farmacia.Medicamento;
import clases.sistemaDeArchivos.Archivo;
import clases.sistemaDeArchivos.ElementoSA;

import java.time.LocalDate;
import java.util.ArrayList;

public class Articulo {
    private String nombre;
    private String fabricante;
    private LocalDate anioFabricion;
    protected ArrayList materiales;
    private double peso;

    public Articulo(String nombre, String fabricante, LocalDate anioFabricion, double peso) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.anioFabricion = anioFabricion;
        this.peso = peso;
        this.materiales = new ArrayList<String>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public LocalDate getAnioFabricion() {
        return anioFabricion;
    }

    public double getPeso() {
        return peso;
    }

    public void addMaterial(String m) {
        if (!this.materiales.contains(m.toUpperCase())) {
            this.materiales.add(m.toUpperCase());
        }
    }

    public void deleteMaterial(String m) {
        this.materiales.remove(m.toUpperCase());
    }

    public boolean tieneMaterial(String material) {
        return materiales.contains(material.toUpperCase());
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "nombre='" + nombre + '\'' +
                ", anioFabricion=" + anioFabricion +
                ", peso=" + peso +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        try {
            // Intenta convertir el objeto recibido (o) en un objeto de la clase ElementoSA
            Articulo that = (Articulo) o;
            // Compara el atributo "nombre" de este objeto con el atributo "nombre" del objeto "that"
            return nombre.equals(that.getNombre());
        } catch (Exception e) {
            return false;
        }
    }

}
