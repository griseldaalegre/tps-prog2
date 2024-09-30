package tp6;

import java.util.ArrayList;

public class EJ2ColaEspera {
    private ArrayList<EJ2ElementoCola> elementos;

    public EJ2ColaEspera() {
        this.elementos = new ArrayList<EJ2ElementoCola>();
    }

    public EJ2ElementoCola getSiguiente() {
        if (this.tieneElementos())
            return elementos.remove(0);// el remove elimina y retorna
        else
            return null;

    }

    public boolean tieneElementos() {
        return !elementos.isEmpty();
    }

    public void addElemento(EJ2ElementoCola elemento) {
        boolean inserto = false;
        int i = 0;
        while (i < elementos.size() && !inserto) {
            //if (elemento.getVelocidadCPU() > computadoras.get(i).getVelocidadCPU()) {
            if (elemento.esMayor(elementos.get(i))) {
                elementos.add(i, elemento); //en el indice incerto la compu
                inserto = true;
            }
            i++;
        }
        if (!inserto) {
            elementos.add(elemento); //inserto al final
        }
    }


}
