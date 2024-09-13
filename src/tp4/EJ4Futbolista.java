package tp4;

import java.time.LocalDate;
import java.util.Objects;

public class EJ4Futbolista extends EJ4Persona {
    private String posicion;
    private String piernaHabil; // Zurdo o Derecho
    private int golesConvertidos;
    private boolean concentrando;



    public EJ4Futbolista(String nombre, String apellido, String pasaporte, LocalDate fechaNacimiento,
                         String estado, String posicion, String piernaHabil, int golesConvertidos, boolean concentrando) {
        super(nombre, apellido, pasaporte, fechaNacimiento,estado);
        this.posicion = posicion;
        this.piernaHabil = piernaHabil;
        this.golesConvertidos = golesConvertidos;
        this.concentrando = concentrando;
    }

    @Override
    public boolean estaDisponibleParaEvento() {
        return super.estaDisponibleParaEvento() && !this.concentrando;
    }

}
