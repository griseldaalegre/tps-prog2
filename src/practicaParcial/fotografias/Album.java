package practicaParcial.fotografias;

import practicaParcial.fotografias.condiciones.Condicion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Album extends ElementoFoto {
    protected ArrayList<ElementoFoto> elementos;

    public Album(String titulo, LocalDate fecha) {
        super(titulo, fecha);
        this.elementos = new ArrayList<ElementoFoto>();
    }

    public void addElemento(ElementoFoto e) {
        this.elementos.add(e);
        Collections.sort(elementos);//revisar
    }

    @Override
    public int getCantidadElementos() {
        int resultado = 0;
        for (ElementoFoto elemento : elementos) {
            resultado += elemento.getCantidadElementos();
        }
        return resultado;
    }


    @Override
    public double getPeso() {
        double resultado = 0;
        for (ElementoFoto elemento : elementos) {
            resultado += elemento.getPeso();
        }
        return resultado;
    }

    //lista de nombre sin repetidos
    @Override
    public ArrayList<String> getListaPersonas() {
        ArrayList<String> resultado = new ArrayList<>();
        for (ElementoFoto elemento : elementos) {
            ArrayList<String> auxiliar = elemento.getListaPersonas();// HAGO UNA COPIA DE MI ARREGLO Y LO RECORRO
//          ArrayList<String> auxiliar = new ArrayList<>(elemento.getListaPersonas());// HAGO UNA COPIA DE MI ARREGLO Y LO RECORRO
            for (String nombre : auxiliar) {
                if (!resultado.contains(nombre)) {
                    resultado.add(nombre);
                }
            }
        }
        return resultado;
    }

    @Override
    public ElementoFoto copia(Condicion c) {
        //hago una copia del objeto en donde estoy, no de su abstracto
        Album copia = new Album(this.getNombre(), this.getFecha());
        for (ElementoFoto elemento : elementos) {
            ElementoFoto copiaHijo = elemento.copia(c);//guardo al hijo
            if (copiaHijo != null) {
                copia.addElemento(copiaHijo); //sea simple o compuesto lo agrego
            }
        }
        if (copia.tieneElementos()) {
            return copia;
        }
        return null;
    }

    public boolean tieneElementos() {
        return !elementos.isEmpty();
    }


}