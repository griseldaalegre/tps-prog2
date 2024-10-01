package clases.sistemaDeArchivos.condiciones;

import clases.sistemaDeArchivos.Archivo;

public class CondicionTamanioMayor extends Condicion {
    private double tamanioMinino;

    public CondicionTamanioMayor(double tamanioMinino) {
        this.tamanioMinino = tamanioMinino;
    }

    public boolean cumple(Archivo a) {
        return a.getTamanio() > tamanioMinino;
    }
}
