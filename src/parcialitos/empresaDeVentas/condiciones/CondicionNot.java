package parcialitos.empresaDeVentas.condiciones;

import clases.sistemaDeArchivos.Archivo;
import parcialitos.empresaDeVentas.Articulo;

public class CondicionNot extends Condicion {
    private Condicion condicionPositiva;

    public CondicionNot(Condicion condicionPositiva) {
        this.condicionPositiva = condicionPositiva;
    }


    public boolean cumple(Articulo a) {
        return !condicionPositiva.cumple(a);//Niego mi condicion
    }

}
