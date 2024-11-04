package practicaParcial.parciales2024.fotografias;

import practicaParcial.parciales2024.fotografias.condiciones.Condicion;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class ElementoFoto implements Comparable<ElementoFoto> {
    private String nombre;
    private LocalDate fecha;

    public ElementoFoto(String nombre, LocalDate fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public abstract int getCantidadElementos();

    public abstract double getPeso();

    public abstract ArrayList<String> getListaPersonas();

    public abstract ElementoFoto copia(Condicion c);//segun la condicion es la copia q retorno

    //SI NO VA A CAMBIAR IMPLEMENTO COMPARABLE
    @Override
    public int compareTo(ElementoFoto otro) {
        // Primero, comparar por fecha
        int resultado = this.fecha.compareTo(otro.fecha);

        // Si las fechas son iguales, comparar por peso
        if (resultado == 0) {
            resultado = Double.compare(this.getPeso(), otro.getPeso());
        }
        return resultado;
    }
}
