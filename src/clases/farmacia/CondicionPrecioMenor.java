package clases.farmacia;

public class CondicionPrecioMenor extends Condicion{
    private double valor;

    public CondicionPrecioMenor(double valor) {
        this.valor = valor;
    }

    public boolean cumple(Medicamento m){
        return m.getPrecio() < valor;
    }
}
