package clases.sistemaDeArchivos;

import clases.sistemaDeArchivos.condiciones.Condicion;

import java.util.ArrayList;

public class AccesoDirecto extends ElementoSA {
    private ElementoSA loQueApunta;

    private static final String PREFIJO = "Acceso directo a ";
    private static final double tamanioFijo = 1;

    public AccesoDirecto(ElementoSA destino) {
        super(PREFIJO + destino.getNombre());
        this.loQueApunta = destino;
    }

    public ElementoSA getLoQueApunta() {
        return loQueApunta;
    }

    @Override
    public double getTamanio() {
        return tamanioFijo;
    }

    @Override
    public int getCantidadElementos() {
        return 1;
    }

    @Override
    public ArrayList<Archivo> buscar(Condicion c) {
        return loQueApunta.buscar(c);
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        try {
            AccesoDirecto otro = (AccesoDirecto) o;//lo casteo
            return this.getNombre().equals(otro.getNombre())
                    && this.getLoQueApunta().equals(otro.getLoQueApunta());
        } catch (Exception e) {
            return false;
        }
    }
}
