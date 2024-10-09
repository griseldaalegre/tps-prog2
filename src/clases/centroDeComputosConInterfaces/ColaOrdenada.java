package clases.centroDeComputosConInterfaces;

import java.util.ArrayList;

public class ColaOrdenada {
    private ArrayList<Elemento> elementos;

    public ColaOrdenada() {
        elementos = new ArrayList<>();
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    public void agregar(Elemento nuevo) {
        int i = 0;
        while (i< elementos.size() && elementos.get(i).mayor(nuevo))
            i++;
        elementos.add(i,nuevo);
    }

    /**
     * No solo consulta el primero, sino que tambien lo elimina;
     * @return
     */
    public Elemento primero() {
        if (!estaVacia())
            return elementos.remove(0);
        else return null;
    }

    public  String toString(){
        return elementos.toString();
    }
}
