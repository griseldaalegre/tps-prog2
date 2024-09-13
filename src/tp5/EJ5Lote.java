package tp5;

import java.util.ArrayList;

public class EJ5Lote {
    private ArrayList<String> minerales;
    private int superficie;

    public EJ5Lote(int superficie) {
        this.minerales = new ArrayList<String>();
        this.superficie = superficie;
    }

    public int getSuperficie() {
        return this.superficie;
    }

    public void addMineral(String mineral) {
        if (!minerales.contains(mineral)) {
            this.minerales.add(mineral);
        }
    }

    public void removeMineral(String mineral) {
        minerales.remove(mineral);//Se usa el equals de String
    }

    public boolean tieneMineral(String mineral) {
        return minerales.contains(mineral);//si mi arrelo de mineraless coontiene mineral
    }

    public boolean esApto(EJ5Cereal cereal) {
        return cereal.acepta(this);//si me acepta soy apto
    }

    public boolean equals(Object obj) {
        try {
            EJ5Lote lote = (EJ5Lote) obj;
            return lote.getSuperficie() == superficie;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Lote{" +
                "minerales=" + minerales +
                ", superficie=" + superficie +
                '}';
    }

}
