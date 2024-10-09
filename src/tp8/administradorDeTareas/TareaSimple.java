package tp8.administradorDeTareas;

import java.time.LocalTime;

public class TareaSimple extends Tarea {

    public TareaSimple(String accionEspecialidad) {
        super(accionEspecialidad);
    }

    @Override
    public double calcularCosto() {
        return getCosto();
    }

    @Override
    public LocalTime calcularTiempoEstimado() {
        return getTiempoEstimado();
    }

    public int getCantidadSimples() {
        return 1;
    }


}
