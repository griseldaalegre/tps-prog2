package tp11.collectors;

import tp11.collectors.condiciones.Condicion;

public class Basica extends Coleccion {
    private Condicion condicion;

    public Basica(String nombre) {
        super(nombre);
    }

    @Override
    public void addElemento(ComponenteColeccion elemento) {
        if (condicion.cumple(elemento)) {
            coleccion.add(elemento);
        }
    }
}
