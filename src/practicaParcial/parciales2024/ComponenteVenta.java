package practicaParcial.parciales2024;

import java.util.ArrayList;

import practicaParcial.parciales2024.condiciones.Condicion;


public abstract class ComponenteVenta {

    public abstract int cantidadVentasTotales();//BIEN

    public abstract int cantidadProductosVendidos();//BIEN

    public abstract double getPromedioEdad();

    public abstract double getGanancias();//BIEN


    public abstract ArrayList<Vendedor> buscar(Condicion c);//BIEN


}
