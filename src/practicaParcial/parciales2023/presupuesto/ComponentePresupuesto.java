package practicaParcial.presupuesto;

import practicaParcial.presupuesto.condiciones.Condicion;

import java.util.ArrayList;

public abstract class ComponentePresupuesto {
    private String nombre;

    public ComponentePresupuesto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract int getCantidadEmpleados();

    public abstract ArrayList<String> listadoMateriales();

    public abstract int getTiempoEstimado();

    public abstract ArrayList<ComponentePresupuesto> buscar(Condicion c);

    //si uso el remove implemento el equals
    public abstract double getCosto();

    @Override
    public boolean equals(Object o1) {
        try {
            ComponentePresupuesto presupuesto = (ComponentePresupuesto) o1;
            return nombre.equals(presupuesto.getNombre());
        } catch (Exception e) {
            return false;
        }
    }
}
