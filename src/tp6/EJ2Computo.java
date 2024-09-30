package tp6;

import java.util.ArrayList;

public class EJ2Computo {
    //solucion no optiima
    private EJ2ColaEspera computadoras;
    private EJ2ColaEspera procesos;

    public EJ2Computo() {
        this.computadoras = new EJ2ColaEspera();
        this.procesos = new EJ2ColaEspera();
    }


    public void addCoputadora(EJ2Computadora compu) {
        if (compu == null)
            return;
        if (computadoras.tieneElementos()) {
            EJ2Proceso proc = (EJ2Proceso) procesos.getSiguiente();
            compu.ejecutarProceso(proc);
        }
    }

    public void addProceso(EJ2Proceso proceso) {
        if (proceso == null)
            return;
        if (computadoras.tieneElementos()) {
            EJ2Computadora libre = (EJ2Computadora) computadoras.getSiguiente();
            libre.ejecutarProceso(proceso);
            computadoras.addElemento(proceso);
        }

    }

    public EJ2Computadora getSiguienteCompu() {
        return (EJ2Computadora) computadoras.getSiguiente();
    }

    public EJ2Proceso getSiguienteProceso() {
        return (EJ2Proceso) procesos.getSiguiente();
    }

}
