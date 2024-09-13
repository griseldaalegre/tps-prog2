package tp5;

import java.util.ArrayList;

public class EJ5Cereal {
    private String nombre;
    private ArrayList<String> minerales;

    public EJ5Cereal(String nombre) {
        this.nombre = nombre;
        this.minerales = new ArrayList<String>();
    }

    public String getNombre() {
        return nombre;
    }

    public void addMineral(String mineral) {
        if (!mineral.contains(mineral))//Se usa el equals de String
            this.minerales.add(mineral);
    }

    public void removeMineral(String mineral) {
        minerales.remove((mineral));//Se usa el equals de String
    }

    public boolean necesitaMineral(String mineral) {
        return minerales.contains(mineral); //Se usa el equals de String
    }

    public boolean acepta(EJ5Lote lote) {
        int i = 0;
        while (i < this.minerales.size()) {
            String m = minerales.get(i); // mineral del cerreal
            if (!lote.tieneMineral(m)) {//le pregunto al lote en lugar de pedir datos
                return false;
            }
            i++;
        }
        return true;
    }
}
