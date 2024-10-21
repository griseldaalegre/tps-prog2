package tp11.futbol5.condiciones;

import tp11.futbol5.Socio;

import java.util.Comparator;

public class CondicionPorPrecioMayor extends Condicion {
    private double valor;

    public CondicionPorPrecioMayor(double valor) {
        this.valor = valor;
    }

    public boolean cumple(Socio s) {
        return s.pagoMasDe(this.valor);
    }
}
