package tp8.onePiece;

public class FrutaMultiplicadoraPesoMasValorFijo extends FrutaMultiplicadoraPeso {

    public FrutaMultiplicadoraPesoMasValorFijo(double fuerzaFija, int multiplicador) {
        super(fuerzaFija, multiplicador);
    }

    @Override
    public double calcularFuerza(double peso) {
        return super.calcularFuerza(peso) + getFuerzaFija();
    }
}
