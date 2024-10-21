package tp11.wbs;

import clases.sistemaArchivosComparator.ElementoSA;
import tp11.wbs.condiciones.Condicion;

import java.time.LocalDate;
import java.util.ArrayList;

public class TareaCompuesta extends ComponenteWbs {
    private ArrayList<ComponenteWbs> tareas;

    public TareaCompuesta() {
        this.tareas = new ArrayList<ComponenteWbs>();
    }

    public void addTarea(ComponenteWbs tarea) {
        this.tareas.add(tarea);
    }

    public void removeTarea(ComponenteWbs tarea) {
        this.tareas.remove(tarea);
    }


    @Override
    public ArrayList<ComponenteWbs> buscar(Condicion c) {
        ArrayList<ComponenteWbs> resultado = new ArrayList<>();
        for (ComponenteWbs tarea : tareas) {
            resultado.addAll(tarea.buscar(c));//la tarea busca la condicion
        }
        return resultado;
    }

    @Override
    public LocalDate getFechaInicio() {
        // Busca la fecha más temprana entre todas las subtareas
        LocalDate fechaInicioTemprana = tareas.get(0).getFechaInicio();
        for (ComponenteWbs subtarea : tareas) {
            if (subtarea.getFechaInicio().isBefore(fechaInicioTemprana)) {
                fechaInicioTemprana = subtarea.getFechaInicio();
            }
        }
        return fechaInicioTemprana;
    }

    @Override
    public LocalDate getFechaFin() {
        // Busca la fecha más temprana entre todas las subtareas
        LocalDate fechaFinTardia = tareas.get(0).getFechaInicio();
        for (ComponenteWbs subtarea : tareas) {
            if (subtarea.getFechaInicio().isBefore(fechaFinTardia)) {
                fechaFinTardia = subtarea.getFechaInicio();
            }
        }
        return fechaFinTardia;
    }

    @Override
    public boolean tieneEstado(String estado) {
        for (ComponenteWbs subtarea : tareas) {
            if (subtarea.tieneEstado(estado)) {
                return true; // Si alguna subtarea tiene el estado, retornamos true
            }
        }
        return false; // Si ninguna subtarea tiene el estado, retornamos false
    }



}
