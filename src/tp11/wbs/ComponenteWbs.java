package tp11.wbs;

import tp11.wbs.condiciones.Condicion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public abstract class ComponenteWbs {

    public abstract LocalDate getFechaInicio();

    public abstract LocalDate getFechaFin();

    public abstract ArrayList<ComponenteWbs> buscar(Condicion c);
    public abstract boolean tieneEstado(String estado);



}
