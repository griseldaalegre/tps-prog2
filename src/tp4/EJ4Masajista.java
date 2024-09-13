package tp4;

import java.time.LocalDate;

public class EJ4Masajista extends EJ4Persona {
    private String titulo;
    private String aniosXP;


    public EJ4Masajista(String nombre, String apellido, String pasaporte, LocalDate fechaNacimiento, String estado, String titulo, String aniosXP) {
        super(nombre, apellido, pasaporte, fechaNacimiento, estado);
        this.titulo = titulo;
        this.aniosXP = aniosXP;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAniosXP() {
        return aniosXP;
    }

}
