package clases.sistemaDeArchivos;

public class Main {

    public static void main(String[] args) {
        Archivo calendario = new Archivo("caledario", "pdf", 120.0);
        Carpeta tudai = new Carpeta("Tudai");


        Carpeta primero = new Carpeta("1er anio");
        Carpeta segundo = new Carpeta("2do anio");
        Carpeta prog2 = new Carpeta("Prog2");

        Archivo parcial = new Archivo("parcial", "doc", 250.8);
        Archivo recuperatorio = new Archivo("recuperatorio", "pdf", 350.5);
        Archivo prefinal = new Archivo("prefinal", "pdf", 450.8);

        prog2.addContenido(parcial);
        prog2.addContenido(recuperatorio);
        prog2.addContenido(prefinal);

        primero.addContenido(prog2);

        tudai.addContenido(primero);
        tudai.addContenido(calendario);
        tudai.addContenido(segundo);

        System.out.println(tudai.getCantidadElementos());
    }
}
