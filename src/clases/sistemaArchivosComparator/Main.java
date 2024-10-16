package clases.sistemaArchivosComparator;

import clases.sistemaArchivosComparator.comparadores.ComparadorCompuesto;
import clases.sistemaArchivosComparator.comparadores.ComparadorFechaCreacion;
import clases.sistemaArchivosComparator.comparadores.ComparadorNombre;
import clases.sistemaArchivosComparator.comparadores.ComparadorTamanio;
import clases.sistemaArchivosComparator.condiciones.CondNot;
import clases.sistemaArchivosComparator.condiciones.CondTamanioMayor;
import clases.sistemaArchivosComparator.condiciones.Condicion;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Directorio raiz = new Directorio("raiz");
        Directorio d2 = new Directorio("TUDAI");
        Directorio d3 = new Directorio("Prog2");
        Archivo parcial = new Archivo("parcial", 20.0, "txt");
        Archivo recu = new Archivo("recu", 420.5, "pdf");
        Archivo prefi = new Archivo("prefi", 5420.5, "pdf");
        Archivo prefiTema2 = new Archivo("prefi", 420.5, "pdf");

        raiz.addElemento(d2);
        raiz.addElemento(parcial);
        raiz.addElemento(d3);
        raiz.addElemento(prefiTema2);
        d2.addElemento(recu);
        d2.addElemento(prefi);

        System.out.println(raiz.getTamanio());
        System.out.println(d2.getTamanio());
        System.out.println(d3.getTamanio());

        raiz.cantElementos();

        Condicion cond = new CondTamanioMayor(10.0);
        Condicion menores = new CondNot(cond);
        ArrayList<Archivo> resultado = raiz.buscarOrdenado(cond, new ComparadorNombre());
        System.out.println(resultado);

        Comparator<ElementoSA> cNombre = new ComparadorNombre();
        Comparator<ElementoSA> cFecha = new ComparadorFechaCreacion();
        Comparator<ElementoSA> cTam = new ComparadorTamanio();
        Comparator<ElementoSA> cNomFecha = new ComparadorCompuesto(cNombre, cFecha);
        Comparator<ElementoSA> cNomFechaTam = new ComparadorCompuesto(cNomFecha, cTam);

        ArrayList<Archivo> resultado2 = raiz.buscarOrdenado(cond, cNomFechaTam);
        System.out.println(resultado2);


    }
}
