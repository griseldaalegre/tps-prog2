package tp11.futbol5.condiciones;
import tp11.futbol5.Socio;
//busco a los socios menores de edad
public class CondicionPorEdadMenor extends Condicion {
    private int edad;

    public CondicionPorEdadMenor(int edad) {
        this.edad = edad;
    }

    public boolean cumple(Socio s) {
        return s.getEdad() < this.edad;
    }
}
