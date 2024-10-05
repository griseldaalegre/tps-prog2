package tp8.onePiece;


import tp8.onePiece.condiciones.Condicion;

import java.util.ArrayList;

public class Barco extends Elemento {
    protected ArrayList<Elemento> tripulacion;

    public Barco(String nombre) {
        super(nombre, 0, 0, 0); // Inicializa con valores por defecto
        this.tripulacion = new ArrayList<>();
    }

    public void addTripulante(Elemento tripulante) {
        if (!this.tripulacion.contains(tripulante)) {
            this.tripulacion.add(tripulante);
        }
    }

    public void deleteTripulante(Elemento tripulante) {
        this.tripulacion.remove(tripulante);
    }

    @Override
    public double calcularFuerza() {
        double totalFuerza = 0;
        for (Elemento tripulante : tripulacion) {
            totalFuerza += tripulante.getFuerza();
        }
        return totalFuerza;
    }

    @Override
    public int calcularEdad() {
        int edadMaxima = 0; // Cambié la variable a edadMaxima para que sea más clara
        for (Elemento tripulante : tripulacion) {
            if (edadMaxima < tripulante.getEdad()) {
                edadMaxima = tripulante.getEdad();
            }
        }
        return edadMaxima;
    }

    @Override
    public double calcularPeso() {
        return !tripulacion.isEmpty() ? tripulacion.get(0).getPeso() : 0; // Peso del primer tripulante
    }

    @Override
    public String toString() {
        return "Barco{" +
                "nombre='" + getNombre() + '\'' +
                ", edad=" + calcularEdad() +
                ", peso=" + calcularPeso() +
                ", fuerza=" + calcularFuerza() +
                '}';
    }

    public ArrayList<Elemento> buscar(Condicion c) {
        ArrayList<Elemento> resultado = new ArrayList<Elemento>();
        for (Elemento elem : tripulacion) {
            if (c.cumple(elem)) {
                resultado.add(elem);
            }
            //el add agrega de a un elemento
            //addAll agrega cada uno de los eleementos dde la lista que recibe como a la lista resultado
        }
        return resultado;
    }

    public int cantTripulantes() {
        return this.tripulacion.size();
    }
}
