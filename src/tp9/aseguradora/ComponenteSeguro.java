package tp9.aseguradora;

import tp9.aseguradora.condiciones.Condicion;

import java.util.ArrayList;

public abstract class ComponenteSeguro {
    private int nroPoliza;
    private String descripcion;
    private double montoAsegurado;
    private String dniAsegurado;

    public ComponenteSeguro(int nroPoliza, String descripcion, double montoAsegurado, String dniAsegurado) {
        this.nroPoliza = nroPoliza;
        this.descripcion = descripcion;
        this.montoAsegurado = montoAsegurado;
        this.dniAsegurado = dniAsegurado;
    }

    public int getNroPoliza() {
        return nroPoliza;
    }

    public void setNroPoliza(int nroPoliza) {
        this.nroPoliza = nroPoliza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(double montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public String getDniAsegurado() {
        return dniAsegurado;
    }

    public void setDniAsegurado(String dniAsegurado) {
        this.dniAsegurado = dniAsegurado;
    }

    public abstract double calcularPoliza();

    public abstract ArrayList<ComponenteSeguro> listarPor(Condicion c);

}
//releer enunciado
//falta lo del dni del seguro integrador, y ver si seguro teporal