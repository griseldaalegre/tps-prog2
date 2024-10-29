package practicaParcial.parciales2021.hotelera;

import practicaParcial.parciales2021.hotelera.condiciones.Condicion;

import java.util.ArrayList;

public class Agrupacion extends ComponenteHotel {
    private ArrayList<ComponenteHotel> elementos;

    public Agrupacion() {
        this.elementos = new ArrayList<>();
    }

    public void addElemento(ComponenteHotel e) {
        this.elementos.add(e);
    }

    @Override
    public int getCantidadHabitacionesQueTienen(Condicion c) {
        int resultado = 0;
        for (ComponenteHotel elemento : elementos) {
            resultado += elemento.getCantidadHabitacionesQueTienen(c);
        }
        return resultado;
    }

    public ArrayList<Habitacion> buscar(Condicion c) {
        ArrayList<Habitacion> resultado = new ArrayList<>();
        for (ComponenteHotel elemento : elementos) {
            resultado.addAll(elemento.buscar(c));
        }
        return resultado;
    }
}
