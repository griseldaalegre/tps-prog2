package practicaParcial.presupuesto;

import practicaParcial.presupuesto.condiciones.Condicion;

import java.util.ArrayList;

public class TareaCompleja extends PresupuestoCompuesto {

    public TareaCompleja(String nombre) {
        super(nombre);
        this.elementos = new ArrayList<>();
    }

    @Override
    public int getCantidadEmpleados() {
        int resultado = 0;
        for (ComponentePresupuesto elemento : elementos) {
            if (elemento.getCantidadEmpleados() > resultado) {
                resultado = elemento.getCantidadEmpleados();
            }
        }
        return resultado;
    }

    @Override
    public ArrayList<String> listadoMateriales() {
        ArrayList<String> materiales = new ArrayList<>();
        for (ComponentePresupuesto elemento : elementos) {
            ArrayList<String> materialesHijo = elemento.listadoMateriales();
            //recorro los materiales de mi hijo;
            for (String material : materialesHijo) {
                if (!materiales.contains(material)) {
                    materiales.add(material);
                }
            }
        }
        return materiales;
    }

    @Override
    public int getTiempoEstimado() {
        int resultado = 0;
        for (ComponentePresupuesto elemento : elementos) {
            resultado += elemento.getTiempoEstimado();
        }
        return resultado;
    }

    // NOTA: En el caso de Tarea Completa o Tarea Avanzada, si ellas cumplen con el criterio se incluyen en el
// listado y NO sus componentes. Si no cumplen no se incluyen en el listado pero si los elementos que
// contengan que cumplan con lo solicitado (sin importar el nivel de anidamiento)
    @Override
    public ArrayList<ComponentePresupuesto> buscar(Condicion c) {
        ArrayList<ComponentePresupuesto> resultado = new ArrayList<>();
        if (c.cumple(this)) {
            resultado.add(this);
        } else {
            for (ComponentePresupuesto elemento : elementos) {
                resultado.addAll(elemento.buscar(c));
            }
        }

        return resultado;
    }
}
