package tp7.vivero.condiciones;

import tp7.vivero.Planta;

public class CondicionPorTipoPlanta extends Condicion {
    private String tipoPlanta;

    public CondicionPorTipoPlanta(String tipoPlanta) {
        this.tipoPlanta = tipoPlanta;
    }

    public boolean cumple(Planta p) {
        return p.getTipo().equals(this.tipoPlanta);
    }
}
