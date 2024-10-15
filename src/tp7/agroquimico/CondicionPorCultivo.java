package tp7.agroquimico;

public class CondicionPorCultivo extends Condicion {
    private Cultivo cultivo;

    public CondicionPorCultivo(Cultivo cultivo) {
        this.cultivo = cultivo;
    }

    @Override
    public boolean cumple(Producto p) {
        // Verifico si el producto está desaconsejado para este cultivo
        return !p.desaconsejadoParaCultivo(cultivo);
    }
}
