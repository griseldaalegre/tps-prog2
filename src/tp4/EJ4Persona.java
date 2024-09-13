package tp4;

import java.time.LocalDate;
import java.util.Objects;

public class EJ4Persona {
    private String nombre;
    private String apellido;
    private String pasaporte;
    private LocalDate fechaNacimiento;
    private String estado;

    // 1- esta en pais de origen
    // 2- viajando
    // 3- concentrando


    public EJ4Persona(String nombre, String apellido, String pasaporte, LocalDate fechaNacimiento, String estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pasaporte = pasaporte;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public boolean estaDisponibleParaEvento() {
        return this.getEstado().equals("En país de origen");
    }


}
