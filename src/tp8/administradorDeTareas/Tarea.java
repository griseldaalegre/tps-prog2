package tp8.administradorDeTareas;
import java.time.LocalTime;

public abstract class Tarea {
    private String accionEspecialidad;
    private double costo;
    private LocalTime tiempoEstimado;

    public Tarea(String accionEspecialidad) {
        this.accionEspecialidad = accionEspecialidad;
        this.costo = 0; // O el valor por defecto que desees
        this.tiempoEstimado = LocalTime.of(0, 0); // Iniciar el tiempo estimado a 00:00 si no se pasa un valor
    }

    public String getAccionEspecialidad() {
        return accionEspecialidad;
    }

    public double getCosto() {
        return costo;
    }

    public LocalTime getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setTiempoEstimado(LocalTime tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public abstract double calcularCosto();

    public abstract LocalTime calcularTiempoEstimado();

    @Override
    public String toString() {
        return "Tarea{" +
                "accion='" + accionEspecialidad + '\'' +
                ", costo=" + costo +
                ", tiempoEstimado=" + tiempoEstimado +
                '}';
    }
}
