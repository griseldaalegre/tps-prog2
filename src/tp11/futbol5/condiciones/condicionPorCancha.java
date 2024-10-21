package tp11.futbol5.condiciones;

import tp11.futbol5.Socio;

public class condicionPorCancha extends Condicion {
    private int nCancha;

    public condicionPorCancha(int nCancha) {
        this.nCancha = nCancha;
    }

    public boolean cumple(Socio s) {
        return s.alquiloCancha(nCancha);//se lo delego al socio
    }
}
