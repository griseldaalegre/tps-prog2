package tp11.futbol5.comparadores;

import tp11.futbol5.Socio;

import java.util.Comparator;

public class comparadorPorCantidadAlquileres implements Comparator<Socio> {
    private int idAlquiler;

    public comparadorPorCantidadAlquileres(int idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    //recordad - comparator implementa compare <-
    public int compare(Socio o1, Socio o2) {
        return o1.contadorDeAlquileresX(idAlquiler) - o2.contadorDeAlquileresX(idAlquiler);
    }

    //Positivo: El primer número es mayor.
    //Negativo: El primer número es menor.
    //Cero: Los números son iguales.
}
