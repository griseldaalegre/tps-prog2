package clases.sistemaDeArchivos.condiciones;

import clases.sistemaDeArchivos.Archivo;

public class CondicionNot extends Condicion {

    private Condicion condicionPositiva; //recibo condicion negativa

    public CondicionNot(Condicion condicionPositiva) {
        this.condicionPositiva = condicionPositiva;
    }

    @Override
    public boolean cumple(Archivo a) {
        return !condicionPositiva.cumple(a);//Niego mi condicion
    }
}
