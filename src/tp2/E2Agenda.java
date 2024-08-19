package tp2;

import java.util.ArrayList;

public class E2Agenda {
    private ArrayList<E2Participante> participantes;
    private  ArrayList<E2Reunion> reuniones;

    public E2Agenda() {
        this.participantes = new ArrayList<E2Participante>();
        this.reuniones = new ArrayList<E2Reunion>();
    }

    public  void addReunion (E2Reunion reunion) {
        this.reuniones.add(reunion);
    }

}
