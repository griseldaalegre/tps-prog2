package parcialitos.empresaDeVentas.condiciones;

import parcialitos.empresaDeVentas.Articulo;

public class CondicionPorPesoMenor extends Condicion {
    public double peso;

    public CondicionPorPesoMenor(double peso) {
        this.peso = peso;
    }

    public boolean cumple(Articulo a) {
        return a.getPeso() < peso;
    }
}
