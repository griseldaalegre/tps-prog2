package tp4;

public class EJ2Sensor {
    private String zona;
    private boolean zonaActivada;

    public EJ2Sensor(String zona, boolean zonaActivada) {
        this.zona = zona;
        this.zonaActivada = zonaActivada;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public boolean isZonaActivada() {
        return zonaActivada;
    }

    public void setZonaActivada(boolean zonaActivada) {
        this.zonaActivada = zonaActivada;
    }

    @Override
    public String toString() {
        if (zonaActivada) {
            return "Zona en conflicto: " + zona;
        } else {
            return "Zona: " + zona + " (sin conflicto)";
        }
    }
}
