package tp11.wbs;

import tp11.wbs.condiciones.Condicion;

import java.time.LocalDate;
import java.util.ArrayList;

public class TareaTerminal extends ComponenteWbs {
    private LocalDate fechaInicioReal;
    private LocalDate fechaFinReal;
    private LocalDate fechaInicioEstimada;
    private LocalDate fechaFinEstimada;
    private String estado;
    private ArrayList<String> recursos;

    public TareaTerminal(LocalDate fechaInicioReal, LocalDate fechaFinReal, LocalDate fechaInicioEstimada, LocalDate fechaFinEstimada, String estado) {
        this.fechaInicioEstimada = fechaInicioEstimada;
        this.fechaFinEstimada = fechaFinEstimada;
        this.estado = estado;
        this.recursos = new ArrayList<>();
    }

    public LocalDate getFechaInicioEstimada() {
        return fechaInicioEstimada;
    }

    public void setFechaInicioEstimada(LocalDate fechaInicioEstimada) {
        this.fechaInicioEstimada = fechaInicioEstimada;
    }

    public LocalDate getFechaFinEstimada() {
        return fechaFinEstimada;
    }

    public void setFechaFinEstimada(LocalDate fechaFinEstimada) {
        this.fechaFinEstimada = fechaFinEstimada;
    }

    public String getEstado() {
        return estado;
    }

    public ArrayList<String> getRecursos() {
        return new ArrayList<>(recursos);
    }

    public void setRecurso(String recurso) {
        this.recursos.add(recurso);
    }

    @Override
    public LocalDate getFechaInicio() {
        return fechaInicioEstimada;
    }

    @Override
    public LocalDate getFechaFin() {
        return fechaFinEstimada;
    }

    public ArrayList<ComponenteWbs> buscar(Condicion c) {
        ArrayList resultado = new ArrayList();
        if (c.cumple(this)) { //
            resultado.add(this);
        }
        return resultado;
    }

    @Override
    public boolean tieneEstado(String estado) {
        return this.estado.equalsIgnoreCase(estado);
    }

}
