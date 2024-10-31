package practicaParcial.parcial2210;

import practicaParcial.parcial2210.condiciones.Condicion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Empresa {
    private ArrayList<ComponenteVenta> vendedores;
    private Comparator<ComponenteVenta> orden;//no hace falta que lo implemente la clase

    //como puede cambiar lo pongo como atributo
    public Empresa() {
        this.vendedores = new ArrayList<>();
    }

    public Comparator<ComponenteVenta> getOrden() {
        return orden;
    }

    public void setOrden(Comparator<ComponenteVenta> orden) {
        this.orden = orden;
    }

    public ArrayList<ComponenteVenta> getRanking(Condicion c) {
        ArrayList<ComponenteVenta> resultado = new ArrayList<ComponenteVenta>(vendedores);
        Collections.sort(resultado, orden);
        return resultado;
    }

    //aca si tengo que buscar por vendedor individual

    public ArrayList<Vendedor> buscar(Condicion c) {
        ArrayList<Vendedor> resultado = new ArrayList<>();
        for (ComponenteVenta vendedor : vendedores) {
            resultado.addAll(vendedor.buscar(c));
        }
        return resultado;
    }
}
