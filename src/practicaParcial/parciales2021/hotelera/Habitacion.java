package practicaParcial.parciales2021.hotelera;

import practicaParcial.parciales2021.hotelera.condiciones.Condicion;

import java.time.LocalDate;
import java.util.ArrayList;

//Simple
public class Habitacion extends ElementoHotel {
    private double m2;
    private int cantidadCamas;
    private LocalDate ultimaFechaDeOcupacion;
    private boolean aceptaMascotas;
    private Turista turista;
    private ArrayList<String> comodidades;

    public Habitacion(double m2, int cantidadCamas, LocalDate ultimaFechaDeOcupacion, boolean aceptaMascotas) {
        this.m2 = m2;
        this.cantidadCamas = cantidadCamas;
        this.ultimaFechaDeOcupacion = ultimaFechaDeOcupacion;
        this.aceptaMascotas = aceptaMascotas;
        this.turista = null;
        this.comodidades = new ArrayList<>();
    }
    //implementa comparable?

    public void setM2(double m2) {
        this.m2 = m2;
    }

    public int getCantidadCamas() {
        return cantidadCamas;
    }

    public void setCantidadCamas(int cantidadCamas) {
        this.cantidadCamas = cantidadCamas;
    }

    public LocalDate getUltimaFechaDeOcupacion() {
        return ultimaFechaDeOcupacion;
    }

    public void setUltimaFechaDeOcupacion(LocalDate ultimaFechaDeOcupacion) {
        this.ultimaFechaDeOcupacion = ultimaFechaDeOcupacion;
    }

    public Turista getTurista() {
        return turista;
    }

    public void setTurista(Turista turista) {
        this.turista = turista;
    }

    public boolean isAceptaMascotas() {
        return aceptaMascotas;
    }

    public void setAceptaMascotas(boolean aceptaMascotas) {
        this.aceptaMascotas = aceptaMascotas;
    }

    //para la condicion de busqueda
    public boolean tieneComodidad(String comodidad) {
        return this.comodidades.contains(comodidad);
    }

    public void setComodidades(String comodidad) {
        this.comodidades.add(comodidad);
    }

    @Override
    public ArrayList<Habitacion> buscarHabitacionesDisponibles(Condicion c) {
        ArrayList<Habitacion> resultado = new ArrayList<Habitacion>();
        if (estaLibre()) {
            if (c.cumple(this)) {//si yo cumplo
                resultado.add(this);//me agrego
            }
            return resultado;
        }
        return resultado;

    }

    public boolean estaLibre() {
        if (this.getTurista() != null) {
            return false;
        }
        return true;
    }

    @Override
    public int getCantidadDeHabitacionesPorCondicion(Condicion c) {
        int resultado = 0;
        if (c.cumple(this)) {
            resultado = 1;
            return resultado;
        }
        return resultado;
    }

    @Override
    public int getCantidadTotalHabitacionesLibres() {
        if (this.estaLibre()) {
            return 1;
        }
        return 0;
    }

    @Override
    public double getTotalDimension() {
        return m2;
    }
}
