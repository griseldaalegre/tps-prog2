package tp8.onePiece;

import clases.sistemaDeArchivos.Archivo;
import tp8.onePiece.condiciones.CondicionPorNombre;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Personaje p1 = new Personaje("Sanji", 33, 80, 85);
        System.out.println(p1);

        FrutaMultiplicadoraPeso frutaPeso = new FrutaMultiplicadoraPeso(10, 100);
        p1.comerFruta(frutaPeso);
        System.out.println(p1.comioFruta());
        System.out.println(p1);
        System.out.println(p1.calcularFuerza());

        Personaje p2 = new Personaje("Nami", 43, 60, 60);
        System.out.println(p2);

        FrutaMultiplicadoraPesoMasValorFijo frutaPeso2 = new FrutaMultiplicadoraPesoMasValorFijo(100, 100);
        p2.comerFruta(frutaPeso2);
        System.out.println(p2.comioFruta());
        System.out.println(p2);
        System.out.println(p2.calcularFuerza());

        Barco barco = new Barco("Barquito");
        barco.addTripulante(p1);
        barco.addTripulante(p2);

        System.out.println("Fuerza total del barco: " + barco.calcularFuerza());
        System.out.println("Peso del barco: " + barco.calcularPeso());
        System.out.println("Edad del barco: " + barco.calcularEdad());

        System.out.println(barco);

        CondicionPorNombre conPorNombre = new CondicionPorNombre("Sanji");
        ArrayList<Elemento> resultado = barco.buscar(conPorNombre);
        System.out.println("Se econtro a : " + resultado);
    }
}
