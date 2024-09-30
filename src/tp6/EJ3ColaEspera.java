package tp6;

import java.util.ArrayList;

public class EJ3ColaEspera {
    private ArrayList<EJ3ElementoCola> elementos;

    public EJ3ColaEspera() {
        this.elementos = new ArrayList<EJ3ElementoCola>();
    }

    public EJ3ElementoCola getSiguiente() {
        if (this.tieneElementos())
            return elementos.remove(0);// el remove elimina y retorna
        else
            return null;

    }

    public boolean tieneElementos() {
        return !elementos.isEmpty();
    }

    public void addElemento(EJ3ElementoCola elemento) {
        boolean inserto = false;
        int i = 0;
        while (!inserto && i < elementos.size()) {
            //if (elemento.getVelocidadCPU() > computadoras.get(i).getVelocidadCPU()) {
            if (elemento.esMayor(elementos.get(i))) {
                elementos.add(i, elemento); //
                inserto = true;
            }
            i++;
        }
        if (!inserto) {
            elementos.add(elemento); //inserto al final
        }
    }
}
