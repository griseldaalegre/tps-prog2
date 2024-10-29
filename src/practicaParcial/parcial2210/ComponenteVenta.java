package practicaParcial.parcial2210;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import practicaParcial.parcial2210.condiciones.Condicion;


public abstract class ComponenteVenta {

    public abstract double getGanancias();

    public abstract ArrayList<Vendedor> buscar(Condicion c);

    public abstract int cantidadProductosVendidos();

    public abstract int cantidadVentasTotales();

    public abstract int getPromedioEdad();

    public abstract int getCantidadPersonas();

    //metodo concreto
    public ArrayList<Vendedor> bucar(Condicion c, Comparator<Vendedor> orden) {
        ArrayList<Vendedor> resultado = new ArrayList<>();
        Collections.sort(resultado, orden);
        return resultado;
    }

}
