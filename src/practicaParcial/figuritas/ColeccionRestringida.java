package practicaParcial.figuritas;

import practicaParcial.figuritas.condiciones.Condicion;

import java.util.ArrayList;

public class ColeccionRestringida extends Coleccion {

    public ColeccionRestringida(String nombre, double descuento) {
        super(nombre, descuento);
    }

    @Override
    public ArrayList<Figurita> buscar(Condicion c) {
        return new ArrayList<Figurita>();
    }
}
