package tp11.collectors;

import tp11.collectors.condiciones.Condicion;

import java.util.ArrayList;

public class ProductoPromocional extends Producto {
    private double descuento;

    public ProductoPromocional(String nombre, double peso, int volumen, double descuento) {
        super(nombre, peso, volumen);
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public ArrayList<Producto> buscar(Condicion c) {
        ArrayList<Producto> resultado = new ArrayList<>();
        resultado.add(this);
        return resultado;
    }

    @Override
    public double getCosto() {
        double valor = super.getCosto();
        return valor - valor * descuento;
    }
}
