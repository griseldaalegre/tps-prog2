package practicaParcial.jugueteria;

import practicaParcial.jugueteria.condiciones.Condicion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Jugueteria {

    ArrayList<ComponenteJuego> productos;

    //APLANADA
    public ArrayList<ComponenteJuego> buscar(Condicion cc) {
        ArrayList<ComponenteJuego> salida = new ArrayList<ComponenteJuego>();

        for (ComponenteJuego elemento : productos) {

            if (cc.cumple(elemento)) {
                salida.add(elemento);
            }
        }
        Collections.sort(salida);//sale ordenada
        return salida;
    }

//si se ordena de una sola forma
/* caso comparator
    public ArrayList<ComponenteJuego> buscar(Condicion cc, Comparator<ComponenteJuego> orden){
        ArrayList<ComponenteJuego> salida = this.buscar(cc);
        Collections.sort(salida,orden);
        return salida;
    }
*/
}