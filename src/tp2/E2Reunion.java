package tp2;

import java.util.ArrayList;

public class E2Reunion {
    private String lugar;
    private ArrayList<E2Participante> participantes;
    private String tema;
    private String duracion;
    //telefonos e imail participantes?

    public E2Reunion(String lugar, String tema, String duracion) {
        this.lugar = lugar;
        this.tema = tema;
        this.duracion = duracion;
        this.participantes = new ArrayList<E2Participante>();
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getLugar() {
        return lugar;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setDuracion(String duracion) {
        this.tema = tema;
    }

    public String getDuracion() {
        return duracion;
    }

    public void addParticipante(E2Participante participante) {
        this.participantes.add(participante);
    }


}
