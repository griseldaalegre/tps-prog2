package tp9.navidad;

import java.util.ArrayList;

public class Carta {
    private String remitente;
    protected ArrayList<String> listaDeRehalos;

    public Carta(String remitente) {
        this.remitente = remitente;
        this.listaDeRehalos = new ArrayList<String>();
    }

    public String getRemitente() {
        return remitente;
    }

    public void setListaDeRehalos(String regalo) {
        this.listaDeRehalos.add(regalo);
    }
}
