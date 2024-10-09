package tp8.administradorDeTareas;

import java.time.LocalTime;
import java.util.ArrayList;

public class TareaCompuestaRepetitiva extends TareaCompuesta {
    private int cantRepeticiones;

    public TareaCompuestaRepetitiva(String accionEspecialidad, int cantRepeticiones) {
        super(accionEspecialidad);
        this.cantRepeticiones = cantRepeticiones;
    }

    public int getCantRepeticiones() {
        return cantRepeticiones;
    }

    public void setCantRepeticiones(int cantRepeticiones) {
        this.cantRepeticiones = cantRepeticiones;
    }

    @Override
    public double calcularCosto() {
        double costoTotal = 0;
        for (Tarea t : tareas) {
            costoTotal += t.calcularCosto();
        }
        return costoTotal * cantRepeticiones;
    }

    // Cálculo el tiempo estimado, sumando los tiempos de las tareas contenidas y multiplico por la cantidad de repeticiones
    @Override
    public LocalTime calcularTiempoEstimado() {
        LocalTime tiempoTotal = LocalTime.of(0, 0);
        for (Tarea t : tareas) {
            tiempoTotal = tiempoTotal.plusHours(t.calcularTiempoEstimado().getHour())
                    .plusMinutes(t.calcularTiempoEstimado().getMinute());
        }
        return tiempoTotal;
    }

    // Obtener las acciones a realizar, repitiendo las acciones de las tareas contenidas las veces necesarias
    @Override
    public ArrayList<String> accionesPorRealizar() {
        ArrayList<String> acciones = new ArrayList<>();
        for (int i = 0; i < cantRepeticiones; i++) {
            for (Tarea t : tareas) {
                acciones.add(t.getAccionEspecialidad());
            }
        }
        return acciones;
    }
}
