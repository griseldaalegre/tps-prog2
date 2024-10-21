package tp11.futbol5.comparadores;

import tp11.futbol5.Socio;

import java.util.Comparator;

public class ComparadorPorApellido implements Comparator<Socio> {

    @Override //Sobreescribo el metodo compareTo
    public int compare(Socio o1, Socio o2) { //le paso 2 socios, y los comparo por apellido
        return o1.getApellido().compareTo(o2.getApellido());
    }
}

//OTRA POSIBLE SOLUCION

// Primero, comparar los apellidos
//int comparacionApellido = this.apellido.compareTo(otroSocio.getApellido());

// Si los apellidos son iguales, comparar los nombres
// if (comparacionApellido == 0) {
//    return this.nombre.compareTo(otroSocio.getNombre());
//  }

// Si los apellidos son diferentes, devolver la comparación de apellidos
// return comparacionApellido;