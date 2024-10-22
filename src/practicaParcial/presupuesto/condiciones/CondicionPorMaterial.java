package practicaParcial.presupuesto.condiciones;

import practicaParcial.presupuesto.ComponentePresupuesto;

public class CondicionPorMaterial extends Condicion {
    private String material;

    @Override
    public boolean cumple(ComponentePresupuesto c) {
        return c.listadoMateriales().contains(material);
    }
}
