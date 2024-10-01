package clases.sistemaDeArchivos;

import clases.sistemaDeArchivos.condiciones.Condicion;
import clases.sistemaDeArchivos.condiciones.CondicionNombreContiene;
import clases.sistemaDeArchivos.condiciones.CondicionNot;
import clases.sistemaDeArchivos.condiciones.CondicionPorExtencion;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Carpeta raiz = new Carpeta("/");
        Archivo calendario = new Archivo("caledario", "pdf", 120.0);
        Carpeta tudai = new Carpeta("Tudai");


        Carpeta primero = new Carpeta("1er anio");
        Carpeta segundo = new Carpeta("2do anio");
        Carpeta prog2 = new Carpeta("Prog2");

        Archivo parcial = new Archivo("parcial", "doc", 250.8);
        Archivo recuperatorio = new Archivo("recuperatorio", "pdf", 350.5);
        Archivo prefinal = new Archivo("prefinal", "doc", 450.8);

        prog2.addContenido(parcial);
        prog2.addContenido(recuperatorio);
        prog2.addContenido(prefinal);

        primero.addContenido(prog2);

        tudai.addContenido(primero);
        tudai.addContenido(calendario);
        tudai.addContenido(segundo);

        //System.out.println(tudai.getCantidadElementos());

        Comprimido comprimido = new Comprimido("comp", 0.5);
        comprimido.addContenido(new Archivo("Cc", "txt", 200.0));
        comprimido.addContenido(new Archivo("C2", "txt", 400.0));


        System.out.println("Tamaño de: " + comprimido.getTamanio());

        Comprimido comprimidoTudai = new Comprimido("compt", 0.5);

        comprimidoTudai.addContenido(tudai);

        System.out.println("Tamaño de tudai: " + comprimidoTudai.getTamanio());

        AccesoDirecto accesoDirectoTudai = new AccesoDirecto(tudai);
        AccesoDirecto accesoDirectoPacial = new AccesoDirecto(parcial);


        raiz.addContenido(tudai);
        raiz.addContenido(accesoDirectoPacial);

        System.out.println("Tamaño de: " + comprimido.getTamanio());
        Condicion cPorNombre = new CondicionNombreContiene("caled");
        ArrayList<Archivo> resultado = raiz.buscar(cPorNombre);
        System.out.println(resultado);

        CondicionPorExtencion cPorExtensionDoc = new CondicionPorExtencion("doc");
        CondicionNot cNot = new CondicionNot(cPorExtensionDoc);
        resultado = raiz.buscar(cNot);
        System.out.println(resultado);

        
    }
}
