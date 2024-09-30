package clases.centroComputo;

public class Principal {
    public static void main(String[] args) {
    	Computo centro1 = new Computo();

        Computadora computadora1 = new Computadora(true, 200);
        Computadora computadora2 = new Computadora(true, 11100);
        Computadora computadora3 = new Computadora(true, 500);

        centro1.addComputadora(computadora1);
        centro1.addComputadora(computadora2);
        centro1.addComputadora(computadora3);

        Tarea proc1 = new Tarea(1, 200);
        Tarea proc2 = new Tarea(2, 1200);
        Tarea proc3 = new Tarea(3, 100);

        centro1.addTarea(proc1);
        centro1.addTarea(proc2);
        centro1.addTarea(proc3);
     
    }
}
