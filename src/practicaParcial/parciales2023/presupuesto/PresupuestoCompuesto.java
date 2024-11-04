package practicaParcial.presupuesto;

import practicaParcial.presupuesto.condiciones.Condicion;

import java.util.ArrayList;
//intermedia

public abstract class PresupuestoCompuesto extends ComponentePresupuesto {
    protected ArrayList<ComponentePresupuesto> elementos;

    public PresupuestoCompuesto(String nombre) {
        super(nombre);
        this.elementos = new ArrayList<ComponentePresupuesto>();
    }

    public void addElemento(ComponentePresupuesto elemento) {
        this.elementos.add(elemento);
    }


    @Override
    public abstract int getCantidadEmpleados();

    @Override
    public abstract ArrayList<String> listadoMateriales();

    @Override
    public abstract int getTiempoEstimado();

    @Override
    public double getCosto() {
        int resultado = 0;
        for (ComponentePresupuesto elemento : elementos) {
            resultado += elemento.getCosto();
        }
        return resultado;
    }

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
