package practicaParcial.kiko;

import practicaParcial.kiko.condiciones.Condicion;

import java.util.ArrayList;

public abstract class ElementoTarjeta {
    public abstract int getCantidadTarjetas();

    public abstract ArrayList<String> getInstrucciones();

    public abstract int getTiempoEjecucion();


    public abstract double getGastoBateria();

    public abstract ElementoTarjeta getCopiaRestringida(Condicion c);


}
