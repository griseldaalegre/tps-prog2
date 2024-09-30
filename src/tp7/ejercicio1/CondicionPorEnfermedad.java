package tp7.ejercicio1;


public class CondicionPorEnfermedad extends Condicion {
    private Enfermedad e;

    public CondicionPorEnfermedad(Enfermedad e) {
        this.e = e;
    }

    public boolean cumple(Producto p) {
        for (String patologia : e.getCopiaPatologias()) {
            if (!p.tienePatologia(patologia)) {
                return false; // Si alguna patología no es tratada, retorna false
            }
        }
        return true; // Si todas las patologías son tratadas, retorna true
    }


}
