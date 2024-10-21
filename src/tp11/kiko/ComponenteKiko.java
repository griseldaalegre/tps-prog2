package tp11.kiko;

import tp11.kiko.condiciones.Condicion;

import java.util.ArrayList;

public abstract class ComponenteKiko {
    public static int mAh = 5;

    public abstract ArrayList<String> getInstrucciones();

    public abstract int getCantidadTarjetas();

    public abstract int getGastoBateria();

    public abstract int getTiempoEjecucion();

    public abstract ComponenteKiko copiaRestringida(Condicion c);
    //si mi copia esta vacia no devuelvo nada
}
