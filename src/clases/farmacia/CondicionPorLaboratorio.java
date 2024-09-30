package clases.farmacia;

public class CondicionPorLaboratorio extends Condicion {
    private String laboratorio;

    public CondicionPorLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public boolean cumple(Medicamento m) {
        return m.getLaboratorio().equals(this.laboratorio);
    }
}
