package practicaParcial.presupuesto;

import java.util.ArrayList;

public class TareaAvanzada extends PresupuestoCompuesto {


    public TareaAvanzada(String nombre) {
        super(nombre);
    }

    @Override
    public ArrayList<String> listadoMateriales() {
        ArrayList<String> materiales = new ArrayList<>();
        for (ComponentePresupuesto elemento : elementos) {
            materiales.addAll(elemento.listadoMateriales());
        }
        return materiales;
    }

    @Override
    public int getTiempoEstimado() {
        int estimadoMayor = 0;
        for (ComponentePresupuesto elemento : elementos) {
            if (elemento.getTiempoEstimado() > estimadoMayor) {
                estimadoMayor = elemento.getTiempoEstimado();
            }
        }
        return estimadoMayor;
    }

    @Override
    public int getCantidadEmpleados() {
        int resultado = 0;
        for (ComponentePresupuesto elemento : elementos) {
            resultado += elemento.getCantidadEmpleados();//sumo el resultado de los  hijos
        }
        return resultado;
    }
}
