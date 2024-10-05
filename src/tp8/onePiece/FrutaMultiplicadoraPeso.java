package tp8.onePiece;

public class FrutaMultiplicadoraPeso extends Fruta {
    private int multiplicador;

    public FrutaMultiplicadoraPeso( double fuerzaFija, int multiplicador) {
        super(fuerzaFija);
        this.multiplicador = multiplicador;
    }

    public double calcularFuerza(double peso) {
        // La fruta usa el peso del personaje, pero no lo guarda
        return peso * multiplicador;
    }


}
