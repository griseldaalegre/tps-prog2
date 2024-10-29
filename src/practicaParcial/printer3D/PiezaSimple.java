package practicaParcial.printer3D;

import practicaParcial.printer3D.condiciones.Condicion;

import java.util.ArrayList;

public class PiezaSimple extends ComponentePieza {
    private int cantidadPla;
    private String color;
    private static int tiempoImpresion = 1;
    private int precioGramoPla;

    public PiezaSimple(String nombre, String descripcion, int cantidadPla, String color, int precioGramoPla) {
        super(nombre, descripcion);
        this.cantidadPla = cantidadPla;
        this.color = color;
        this.precioGramoPla = precioGramoPla;
    }

    public void setCantidadPla(int cantidadPla) {
        this.cantidadPla = cantidadPla;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getTiempoImpresion() {
        return tiempoImpresion;
    }

    public static void setTiempoImpresion(int tiempoImpresion) {
        PiezaSimple.tiempoImpresion = tiempoImpresion;
    }

    public int getPrecioGramoPla() {
        return precioGramoPla;
    }

    public void setPrecioGramoPla(int precioGramoPla) {
        this.precioGramoPla = precioGramoPla;
    }

    @Override
    public ArrayList<String> getListaColores() {
        ArrayList<String> resultado = new ArrayList<>();
        resultado.add(this.color);
        return resultado;
    }

    @Override
    public int calcularTiempoImpresion() {
        return tiempoImpresion;
    }

    @Override
    public int calcularPLANecesario() {
        return cantidadPla;
    }

    @Override
    public int calcularCantidadDePiezasSmimples() {
        return 1;
    }

    @Override
    public double calcularCosto() {
        return precioGramoPla;
    }

    @Override
    public ArrayList<PiezaSimple> buscar(Condicion c) {
        ArrayList<PiezaSimple> resultado = new ArrayList<>();
        if (c.cumple(this)) {
            resultado.add(this);
        }
        return resultado;
    }
}

