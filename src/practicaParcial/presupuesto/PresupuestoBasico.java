package practicaParcial.presupuesto;

import practicaParcial.presupuesto.condiciones.Condicion;

import java.util.ArrayList;

//simple
public class PresupuestoBasico extends ComponentePresupuesto {
    //nombre va en el padre abstracto
    private int cantidadEmpleados;
    private int tiempoEstimado;//dias
    private ArrayList<String> materiales;
    private CalculadorCosto calculador;

    public PresupuestoBasico(String nombre, int cantidadEmpleados, int tiempoEstimado, CalculadorCosto calculador) {
        super(nombre);
        this.cantidadEmpleados = cantidadEmpleados;
        this.tiempoEstimado = tiempoEstimado;
        this.materiales = new ArrayList<String>();
        this.calculador = calculador;
    }

    public void setCantidadEmpleados(int cantidadEmpleados) {
        this.cantidadEmpleados = cantidadEmpleados;
    }

    public CalculadorCosto getCalculador() {
        return calculador;
    }

    public void setCalculador(CalculadorCosto calculador) {
        this.calculador = calculador;
    }

    @Override
    public int getTiempoEstimado() {
        return tiempoEstimado;
    }


    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public void addMaterial(String material) {
        if (!this.materiales.contains(material)) {
            this.materiales.add(material);
        }
    }

    @Override
    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    public ArrayList<String> listadoMateriales() {
        return new ArrayList<>(this.materiales);
    }

    @Override
    public ArrayList<ComponentePresupuesto> buscar(Condicion c) {
        ArrayList<ComponentePresupuesto> resultado = new ArrayList<>();
        if (c.cumple(this)) {//si yo cumplo
            resultado.add(this);//me agrego
        }
        return resultado;
    }

    @Override
    public double getCosto() {
        return calculador.calculadorCosto(this);
    }

}
