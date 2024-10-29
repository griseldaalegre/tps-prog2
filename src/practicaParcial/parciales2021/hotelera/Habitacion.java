package practicaParcial.parciales2021.hotelera;

import practicaParcial.parciales2021.hotelera.condiciones.Condicion;

import java.util.ArrayList;
import java.util.Comparator;

public class Habitacion extends ComponenteHotel {
    private double metros;
    private int cantidadCamas;
    private boolean aceptaMascotas;
    private boolean libre;
    private ArrayList<String> comodidades;

    public Habitacion(double metros, int cantidadCamas, boolean aceptaMascotas, boolean libre) {
        this.metros = metros;
        this.cantidadCamas = cantidadCamas;
        this.aceptaMascotas = aceptaMascotas;
        this.libre = libre;
        this.comodidades = new ArrayList<String>();
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public int getCantidadCamas() {
        return cantidadCamas;
    }

    public void setCantidadCamas(int cantidadCamas) {
        this.cantidadCamas = cantidadCamas;
    }

    public boolean isAceptaMascotas() {
        return aceptaMascotas;
    }

    public void setAceptaMascotas(boolean aceptaMascotas) {
        this.aceptaMascotas = aceptaMascotas;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public void addComodidad(String comodidad) {
        if (!this.comodidades.contains(comodidad)) {
            this.comodidades.add(comodidad);
        }
    }

    public boolean tieneComodidad(String comodidad) {
        return this.comodidades.contains(comodidad);
    }

    @Override
    public int getCantidadHabitacionesQueTienen(Condicion c) {
        if (c.cumple(this)) {
            return 1;
        }
        return 0;
    }

    @Override
    public ArrayList<Habitacion> buscar(Condicion c) {
        ArrayList<Habitacion> resultado = new ArrayList<>();
        if (c.cumple(this)) {
            resultado.add(this);
        }
        return resultado;
    }

}
