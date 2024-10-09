package clases.centroDeComputosConInterfaces;

public class CentroComputos {
    private ColaOrdenada computadoras;
    private ColaOrdenada procesos;

    public CentroComputos() {
        computadoras = new ColaOrdenada();
        procesos =  new ColaOrdenada();
    }

    private void addComputadora (Computadora comp){
        if (procesos.estaVacia()){
            computadoras.agregar(comp);
        }
        else {
            Proceso p = (Proceso) procesos.primero();
            comp.asignarProceso(p);
        }
    }

    private void addProceso (Proceso proc){
        if (computadoras.estaVacia()){
            procesos.agregar(proc);
        }
        else {
            Computadora comp = (Computadora) computadoras.primero();
            comp.asignarProceso(proc);
        }
    }

    private void imprimirComputadorasEnEspera(){
        System.out.println("Computadoras en espera: "+computadoras);
    }

    private void imprimirProcesosEnEspera(){
        System.out.println("Procesos en espera: "+procesos);
    }

    public static void main(String[] args) {
        Computadora c1 = new Computadora(123, "A", 100);
        Computadora c2 = new Computadora(124, "A", 10);
        Computadora c3 = new Computadora(125, "B", 200);
        Computadora c4 = new Computadora(126, "B", 150);

        Proceso p1 = new Proceso("PRO1", 1250, 56);
        Proceso p2 = new Proceso("PRO2", 120, 56);
        Proceso p3 = new Proceso("PRO3", 12, 56);
        Proceso p4 = new Proceso("PRO4", 125689, 56);

        CentroComputos centro = new CentroComputos();
        centro.addComputadora(c1);
        centro.addComputadora(c2);
        //centro.addComputadora(c3);
        //centro.addComputadora(c4);
        centro.imprimirComputadorasEnEspera();
        centro.imprimirProcesosEnEspera();

        centro.addProceso(p1);
        centro.addProceso(p2);
        centro.addProceso(p3);
        centro.addProceso(p4);
        centro.imprimirComputadorasEnEspera();
        centro.imprimirProcesosEnEspera();
    }
}
