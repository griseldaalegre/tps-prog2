package practicaParcial.printer3D;

import practicaParcial.printer3D.condiciones.Condicion;

import java.util.ArrayList;

public class PiezaCompuesta extends ComponentePieza {
    private int tiempoExtra;
    private int gramoExtraPLA;
    protected ArrayList<ComponentePieza> elementos;

    public PiezaCompuesta(String nombre, String descripcion, int tiempoExtra) {
        super(nombre, descripcion);
        this.tiempoExtra = tiempoExtra;
        this.elementos = new ArrayList<>();
    }

    public void addElemento(ComponentePieza c) {
        this.elementos.add(c);
    }

    @Override
    public ArrayList<String> getListaColores() {
        ArrayList<String> resultado = new ArrayList<>();
        for (ComponentePieza elemento : elementos) {
            ArrayList<String> auxiliar = new ArrayList<>();
            for (String color : auxiliar) {
                if (!resultado.contains(color)) ;//controlo repetidos
            }
        }
        return resultado;
    }


    @Override
    public int calcularTiempoImpresion() {
        int resultado = 0;
        for (ComponentePieza elemento : elementos) {
            resultado += elemento.calcularTiempoImpresion();
        }
        return resultado * this.tiempoExtra;
    }

    // cantidad de PLA necesario que
    //se calcula como la suma del PLA necesario más 1 gramo por cada pieza simple
    @Override
    public int calcularPLANecesario() {
        int resultado = 0;
        for (ComponentePieza elemento : elementos) {
            resultado += calcularPLANecesario();
        }
        return resultado + this.gramoExtraPLA * this.calcularCantidadDePiezasSmimples();
    }


    @Override
    public int calcularCantidadDePiezasSmimples() {
        int cantidadSimpres = 0;
        for (ComponentePieza elemento : elementos) {
            cantidadSimpres += elemento.calcularCantidadDePiezasSmimples();
        }
        return cantidadSimpres;
    }

    //El costo de una pieza cualquiera (simple, compuesta, rápida o pesada) se calcula como la cantidad de PLA necesario por
    //el precio del gramo PLA más la cantidad de segundos de impresión por un costo de segundo de impresión
    @Override
    public double calcularCosto() {
        int plaNecesario = 0;
        int costoGramo = 0;
        for (ComponentePieza elemento : elementos) {
            plaNecesario += elemento.calcularPLANecesario();
            costoGramo+= elemento.calcularCosto();
        }
        return plaNecesario * costoGramo;//lrevisar
    }

    @Override
    public ArrayList<PiezaSimple> buscar(Condicion c) {
        ArrayList<PiezaSimple> resultado = new ArrayList<>();
        for(ComponentePieza elemento: elementos){
            resultado.addAll(elemento.buscar(c));
        }
        return resultado;
    }


}
