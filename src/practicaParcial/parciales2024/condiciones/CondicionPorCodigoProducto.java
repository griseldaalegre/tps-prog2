package practicaParcial.parciales2024.condiciones;

import practicaParcial.parciales2024.Vendedor;

public class CondicionPorCodigoProducto extends Condicion {
    private String codigo;

    public CondicionPorCodigoProducto(String codigo) {
        this.codigo = codigo;
    }


    @Override
    public boolean cumple(Vendedor v) {
        return v.vendioProducto(codigo);
    }
}
