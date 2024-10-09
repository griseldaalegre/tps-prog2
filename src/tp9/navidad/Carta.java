package tp9.navidad;

import java.util.ArrayList;

public class Carta {
    private String remitente;
    protected String listaDeRegalos;

    public Carta(String remitente, String listaDeRegalos) {
        this.remitente = remitente;
        this.listaDeRegalos = listaDeRegalos;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRegalo(String nuevoRegalo) {
        this.listaDeRegalos = nuevoRegalo;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "remitente='" + remitente + '\'' +
                ", listaDeRehalos='" + listaDeRegalos + '\'' +
                '}';
    }
}
