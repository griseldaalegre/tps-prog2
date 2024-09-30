package clases.farmacia;

public class CondicionSintoma extends Condicion {
    private String sintoma;

    public CondicionSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public boolean cumple(Medicamento m) {
        return m.tieneSintoma(sintoma);
    }
}
