package tp6;

import java.util.ArrayList;

public class EJ3Puerto {
    private String nombre;
    private EJ3ColaEspera barcos;
    private EJ3ColaEspera camiones;

    public EJ3Puerto(String nombre) {
        this.nombre = nombre;
        this.barcos = new EJ3ColaEspera();
        this.camiones = new EJ3ColaEspera();
    }


    public void addBarco(EJ3Barco barco) {
        if (barco == null) return;

        // Si hay camiones disponibles, cargamos el barco con el primer camión
        if (camiones.tieneElementos()) {
            EJ3Camion libre = (EJ3Camion) camiones.getSiguiente();
            barco.cargarCereal(libre);
            System.out.println("Barco cargado: " + barco);
        } else {
            // Si no hay camiones, agregamos el barco a la cola de espera
            barcos.addElemento(barco);
            System.out.println("Barco agregado a la cola: " + barco);
        }
    }

    public void addCamion(EJ3Camion camion) {
        if (camion == null) return;

        // Si hay barcos disponibles, cargamos el primer barco con el camión
        if (barcos.tieneElementos()) {
            EJ3Barco libre = (EJ3Barco) barcos.getSiguiente();
            libre.cargarCereal(camion);
            System.out.println("Camión cargado: " + camion);
        } else {
            // Si no hay barcos, agregamos el camión a la cola de espera
            camiones.addElemento(camion);
            System.out.println("Camión agregado a la cola: " + camion);
        }
    }



    public EJ3Barco getSiguienteBarco() {
        return (EJ3Barco) barcos.getSiguiente();
    }

    public EJ3Camion getSiguienteCamion() {
        return (EJ3Camion) camiones.getSiguiente();
    }

    @Override
    public String toString() {
        return "EJ3Puerto{" +
                "nombre='" + nombre + '\'' +
                ", barcos=" + barcos.toString() +
                ", camiones=" + camiones.toString() +
                '}';
    }
}
