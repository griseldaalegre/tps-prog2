package tp5;

import java.util.ArrayList;
import java.util.Collections;


public class EJ3PilaElementos {
    private ArrayList<String> pilaElementos;

    public EJ3PilaElementos() {
        this.pilaElementos = new ArrayList<String>();
    }

    public void push(String elemento) {
        this.pilaElementos.add(elemento);
    }

    public String pop() {
        return this.pilaElementos.removeLast();
    }

    public String top() {
        if (!this.pilaElementos.isEmpty()) {
            String ultimoElemento = this.pilaElementos.get(this.pilaElementos.size() - 1);
            return ultimoElemento;
        } else {
            return null; // O podrías lanzar una excepción si prefieres
        }
    }


    public int size() {
        return this.pilaElementos.size();
    }

    public ArrayList<String> copy() {
        this.pilaElementos = new ArrayList<String>();
        return pilaElementos;
    }

    public ArrayList<String> reverse() {
        ArrayList<String> pilaReverse = new ArrayList<>(this.pilaElementos); // Crear una copia de la pila
        Collections.reverse(pilaReverse); // Invertir los elementos en la copia
        return pilaReverse;
    }
}
