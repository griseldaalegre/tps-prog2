package tp9.navidad;

import java.util.ArrayList;

public class Buzon {
    private ArrayList<Integer> listaNiniosBuenos;
    private ArrayList<Carta> cartas;
    private final static String regaloListaNegra = "TROZO DE CARBÓN";

    public Buzon() {
        this.listaNiniosBuenos = new ArrayList<Integer>();
        this.cartas = new ArrayList<Carta>();
    }

    public void addNinioBueno(int ninio) {
        if (!this.listaNiniosBuenos.contains(ninio)) {
            this.listaNiniosBuenos.add(ninio);
        }
    }

    public void addCarta(Carta carta) {
        if (this.listaNiniosBuenos.contains(carta.getRemitente()) && !this.cartas.contains(carta)) {
            this.cartas.add(carta);
        } else {
            carta.setRegalo(regaloListaNegra);
        }
    }

}
