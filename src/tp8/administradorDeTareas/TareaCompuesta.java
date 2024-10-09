package tp8.administradorDeTareas;

import java.time.LocalTime;
import java.util.ArrayList;

public class TareaCompuesta extends Tarea {
    protected ArrayList<Tarea> tareas;

    public TareaCompuesta(String accionEspecialidad) {
        super(accionEspecialidad);
        this.tareas = new ArrayList<Tarea>();
    }

    public void addTarea(Tarea t) {
        this.tareas.add(t);
    }

    public void deleteTarea(Tarea t) {
        this.tareas.remove(t);
    }

    @Override
    public double calcularCosto() {
        int costo = 0;
        for (Tarea t : tareas) {
            costo += t.getCosto();
        }
        return costo;
    }

    @Override
    public LocalTime calcularTiempoEstimado() {
        LocalTime tiempoEstimado = LocalTime.of(0, 0);
        for (Tarea t : tareas) {
            tiempoEstimado = tiempoEstimado.plusHours(t.getTiempoEstimado().getHour())
                    .plusMinutes(t.getTiempoEstimado().getMinute()); //VER COMO AGREGA 10M EXTRAS POR CADA TAREA SIMPLE
        }
        return tiempoEstimado;
    }

    public ArrayList<String> accionesPorRealizar() {
        ArrayList<String> listado = new ArrayList<>();

        for (Tarea t : tareas) {
            listado.add(t.getAccionEspecialidad());
        }
        return listado;
    }
}
