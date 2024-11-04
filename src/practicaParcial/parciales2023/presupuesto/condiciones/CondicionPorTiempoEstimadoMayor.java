package practicaParcial.presupuesto.condiciones;

import practicaParcial.presupuesto.ComponentePresupuesto;

public class CondicionPorTiempoEstimadoMayor extends Condicion {
    private int tiempo;

    public CondicionPorTiempoEstimadoMayor(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public boolean cumple(ComponentePresupuesto c) {
        return c.getTiempoEstimado() > tiempo;
    }
}