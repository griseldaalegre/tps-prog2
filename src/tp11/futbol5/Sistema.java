package tp11.futbol5;

import tp9.aseguradora.condiciones.Condicion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class Sistema {
    private ArrayList<Socio> aquileres;

    public Sistema() {

        this.aquileres = new ArrayList<Socio>();
    }

    public void addAlquiler(Socio alquiler) {
        this.aquileres.add(alquiler);
    }

    public abstract ArrayList<Socio> socioCon(Condicion c);


    //COMO VOY A COMPARAR POR DIFERENTES CRITERIOS NECESITO IMPLEMENTAR COMPARATOR EN MI OBJETO SOCIO

    public ArrayList<Socio> sociosConOrdenados(Condicion condicion, Comparator<Socio> criterio) {
        //PASO  CUNA CONDICION Y UN CRITERIO POR EL CUAL DEBO ORDENAR
        ArrayList temp = this.socioCon(condicion);//llamo a mi metodo empleadoscon
        Collections.sort(temp, criterio);//ordena segun cualquier criterio
        return temp;
    }
}
