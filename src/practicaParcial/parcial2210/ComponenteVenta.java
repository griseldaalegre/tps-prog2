package practicaParcial.parcial2210;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import practicaParcial.parcial2210.condiciones.Condicion;


public abstract class ComponenteVenta {

    public abstract int cantidadVentasTotales();//BIEN

    public abstract int cantidadProductosVendidos();//BIEN

    public abstract double getPromedioEdad();

    public abstract double getGanancias();//BIEN


    public abstract ArrayList<Vendedor> buscar(Condicion c);//BIEN


}
