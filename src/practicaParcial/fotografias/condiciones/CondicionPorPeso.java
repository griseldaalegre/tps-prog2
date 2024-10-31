package practicaParcial.fotografias.condiciones;

import practicaParcial.fotografias.Fotogafia;

public class CondicionPorPeso extends Condicion {
    private double peso;

    public CondicionPorPeso(double peso) {
        this.peso = peso;
    }


    @Override
    public boolean cumple(Fotogafia f) {
        return f.getPeso() > this.peso;
    }
}
