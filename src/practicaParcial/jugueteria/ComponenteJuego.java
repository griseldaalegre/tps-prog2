package practicaParcial.jugueteria;
import java.util.ArrayList;
import java.util.Comparator;
import practicaParcial.jugueteria.condiciones.Condicion;

public abstract class ComponenteJuego implements Comparable<ComponenteJuego> {
    private String marca;

    public ComponenteJuego(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public abstract double getPeso();

    public abstract double getCosto();

    public abstract String getColor();

    public abstract int getCantidadEncastres();

    public abstract ArrayList<ComponenteJuego> buscar(Condicion condicion);

    public int compareTo(ComponenteJuego o) {
        int result = marca.compareTo(o.getMarca()); //cmparo mi marca contra el q me vino
        if (result == 0) { //son iguales
            double otroCosto = o.getCosto();//costo otro
            double miCosto = this.getCosto();//mi costo
            if (miCosto > otroCosto) {//si es mayor
                return 1;
            } else if (miCosto < otroCosto) {
                return -1;
            } else {
                result = this.getCantidadEncastres() - o.getCantidadEncastres();
                if (result == 0) { //si son iguales
                    return this.getColor().compareTo(o.getColor());
                } else {
                    return result;
                }
            }

        } else {
            return result;
        }
    }

}
