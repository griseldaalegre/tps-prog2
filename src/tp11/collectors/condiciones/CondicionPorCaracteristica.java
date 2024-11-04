package tp11.collectors.condiciones;

import tp11.collectors.ComponenteColeccion;

public class CondicionPorCaracteristica extends Condicion {
    private String caracteristica;

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public boolean cumple(ComponenteColeccion c) {
        return c.getCaracteristicas().contains(caracteristica);
    }
}
