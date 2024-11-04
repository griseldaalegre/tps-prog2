package practicaParcial.presupuesto.condiciones;

import practicaParcial.presupuesto.ComponentePresupuesto;


public class CondicionPorTiempoEstimadoMenor extends Condicion {
    private int tiempo;

    public CondicionPorTiempoEstimadoMenor(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public boolean cumple(ComponentePresupuesto c) {
        return c.getTiempoEstimado() < tiempo;
    }
}
