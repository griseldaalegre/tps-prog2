package tp9.sistemaElectoral;

import java.time.LocalTime;

public class Votante {
    private int dni;
    private Candidato referenciaCandidato = null;
    private LocalTime fechaVoto;

    public Votante(int dni, LocalTime fechaVoto) {
        this.dni = dni;
        this.fechaVoto = fechaVoto;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Candidato getReferenciaCandidato() {
        return referenciaCandidato;
    }

    public void setReferenciaCandidato(Candidato referenciaCandidato) {
        this.referenciaCandidato = referenciaCandidato;
    }

    public LocalTime getFechaVoto() {
        return fechaVoto;
    }

    public void setFechaVoto(LocalTime fechaVoto) {
        this.fechaVoto = fechaVoto;
    }

    @Override
    public String toString() {
        return "Votante{" +
                "dni=" + dni +
                ", candidato=" + candidato +
                ", fechaVoto=" + fechaVoto +
                '}';
    }
}


