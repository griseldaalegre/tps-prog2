package tp7.vivero.condiciones;

import tp7.vivero.Planta;

public class CondicionPorClasificacion extends Condicion {
    private String clasificacion;

    public CondicionPorClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public boolean cumple(Planta p) {
        return p.getClasificacionSuperior().equals(this.clasificacion);//revisar
    }
}
