package tp4;

import java.time.LocalDate;

public class EJ4Tecnico extends EJ4Persona {
    private String idFederacion;

    public EJ4Tecnico(String nombre, String apellido, String pasaporte, LocalDate fechaNacimiento, String estado, String idFederacion) {
        super(nombre, apellido, pasaporte, fechaNacimiento, estado);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }
}
