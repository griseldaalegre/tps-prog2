package practicaParcial.parciales2021.hotelera;

import practicaParcial.parciales2021.hotelera.condiciones.Condicion;

import java.util.ArrayList;

//Compuesta
public class Pabellon extends ElementoHotel {
    private ArrayList<ElementoHotel> elementos;

    public Pabellon() {
        this.elementos = new ArrayList<>();
    }

    public void addElemento(ElementoHotel e) {
        this.elementos.add(e);
    }

    @Override
    public ArrayList<Habitacion> buscarHabitacionesDisponibles(Condicion c) {
        ArrayList<Habitacion> resultado = new ArrayList<>();
        for (ElementoHotel elemento : elementos) {
            resultado.addAll(elemento.buscarHabitacionesDisponibles(c));
        }
        return resultado;
    }

    @Override
    public int getCantidadDeHabitacionesPorCondicion(Condicion c) {
        int resultado = 0;
        for (ElementoHotel elemento : elementos) {
            resultado += elemento.getCantidadDeHabitacionesPorCondicion(c);
        }
        return resultado;
    }

    @Override
    public int getCantidadTotalHabitacionesLibres() {
        int resultado = 0;
        for (ElementoHotel elemento : elementos) {
            resultado += elemento.getCantidadTotalHabitacionesLibres();
        }
        return resultado;
    }

    @Override
    public double getTotalDimension() {
        double resultado = 0;
        for (ElementoHotel elemento : elementos) {
            resultado += elemento.getTotalDimension();
        }
        return resultado;
    }

}
