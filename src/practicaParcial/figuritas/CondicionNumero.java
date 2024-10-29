package practicaParcial.figuritas;


import practicaParcial.figuritas.condiciones.Condicion;

public class CondicionNumero extends Condicion {

    private int numero;

    public CondicionNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean cumple(Figurita f) {
        return f.getNumero() == this.numero;
    }
}
