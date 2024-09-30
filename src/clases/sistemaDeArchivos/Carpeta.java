package clases.sistemaDeArchivos;

import java.util.ArrayList;

public class Carpeta extends ElementoSA {
    private ArrayList<ElementoSA> contenido;

    public Carpeta(String nombre) {
        super(nombre);
        this.contenido = new ArrayList<ElementoSA>();
    }

    public void addContenido(ElementoSA c) {
        contenido.add(c);
    }

    public double getTamanio() {
        double total = 0;
        for (int i = 0; i < this.contenido.size(); i++) {
            total += this.contenido.get(i).getTamanio();
        }
        return total;
    }

    public int getCantidadElementos() {
        int total = 1;//Arranco en 1 para q la carpeta tambienn se sume
        for (int i = 0; i < this.contenido.size(); i++) {
            total += this.contenido.get(i).getCantidadElementos();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Carpeta{" + getNombre() + "  " +
                "contenido=" + contenido +
                '}';
    }
}
