package tp8.academiaVirtual;

import java.util.ArrayList;
//Clase padre
public abstract class ComponenteAcademia {

    public abstract double calcularPuntaje();

    public abstract int calcularTiempo();

    public abstract ArrayList<String> listadoDeConceptos();
}
