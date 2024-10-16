package tp8.academiaVirtual;

public class Main {
    public static void main(String[] args) {
        Pregunta p1 = new Pregunta("Que es Poo?", 2, 3);
        Pregunta p2 = new Pregunta("Que es Java?", 1, 2);
        Pregunta p3 = new Pregunta("Que es JS?", 4, 1);
        Pregunta p4 = new Pregunta("Que es CSS?", 5, 1);

        UnidadEvaluacionSecuencial unidadS = new UnidadEvaluacionSecuencial();
        UnidadEvaluacionOptativa unidadO = new UnidadEvaluacionOptativa();

        p1.addConcepto("Objetos");
        p2.addConcepto("Programación");
        p3.addConcepto("Javascript");
        p4.addConcepto("Diseño");

        unidadO.addPregunta(p1);
        unidadO.addPregunta(p1);
        unidadO.addPregunta(p2);

        unidadS.addPregunta(unidadO);

        System.out.println(unidadS.calcularPuntaje());
        System.out.println(unidadS.calcularTiempo());
        System.out.println(unidadS.listadoDeConceptos());
    }
}
