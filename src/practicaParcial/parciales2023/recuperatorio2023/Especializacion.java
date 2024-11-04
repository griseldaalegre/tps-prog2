package practicaParcial.parciales2023.recuperatorio2023;

import practicaParcial.parciales2023.recuperatorio2023.condiciones.Condicion;

import java.util.ArrayList;

public class Especializacion extends ComponenteAcademia {
    private static double topeDescuento = 0.5;//50 - lo comparte todas las instancias
    private int descuento; //2
    private Condicion condicion;
    private ArrayList<ComponenteAcademia> elementos;


    public Especializacion(String nombre, int descuento, Condicion condicion) {
        super(nombre);
        this.descuento = descuento;
        this.condicion = condicion;
        this.elementos = new ArrayList<ComponenteAcademia>();
    }

    public void addElemento(ComponenteAcademia elemento) {
        if (condicion.cumple(elemento)) {
            this.elementos.add(elemento);
        }
    }

    public static double getTopeDescuento() {
        return topeDescuento;
    }

    public static void setTopeDescuento(int topeDescuento) {
        Especializacion.topeDescuento = topeDescuento;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public void setCondicion(Condicion condicion) {
        this.condicion = condicion;
    }

    protected double getSumaPrecio() {
        double suma = 0;
        for (ComponenteAcademia elemento : elementos) {
            suma += elemento.getPrecio();
        }
        return suma;
    }

    @Override
    public double getPrecio() {
        double suma = this.getSumaPrecio();
        double descuento = this.descuento * cantidadCursos();
        if (descuento > Especializacion.topeDescuento) {//no hace falta pero es un metodo de clase
            descuento = Especializacion.getTopeDescuento();
        }
        return suma - suma * descuento;
    }

    @Override
    public int cantidadCursos() {
        int contador = 0;
        for (ComponenteAcademia elemento : elementos) {
            contador += elemento.cantidadCursos();
        }
        return contador;
    }

    @Override
    public int cantidadHoras() {
        int contador = 0;
        for (ComponenteAcademia elemento : elementos) {
            contador += elemento.cantidadHoras();
        }
        return contador;
    }

    //controlar repetidos
    @Override
    public ArrayList<String> getDocentes() {
        ArrayList<String> resultado = new ArrayList<>();
        for (ComponenteAcademia elemento : elementos) {//recorro mis cursos especializaciones
            ArrayList<String> docentesHijo = elemento.getDocentes();//creo una nueva lista dehijos
            for (String docente : docentesHijo) {//la recorro y pregunto si no la agregue(CONTROLO REPETIDOS)
                if (!resultado.contains(docente)) {
                    resultado.add(docente);
                }
            }
        }
        return resultado;
    }

    //controlar repetidos
    @Override
    public ArrayList<String> getPalabras() {
        ArrayList<String> resultado = new ArrayList<>();
        for (ComponenteAcademia elemento : elementos) {//recorro mis cursos especializaciones
            ArrayList<String> palabrasHijo = elemento.getDocentes();//creo una nueva lista dehijos
            for (String palabra : palabrasHijo) {//la recorro y pregunto si no la agregue(CONTROLO REPETIDOS)
                if (!resultado.contains(palabra)) {
                    resultado.add(palabra);
                }
            }
        }
        return resultado;
    }

    @Override
    public ArrayList<Curso> buscar(Condicion c) {
        ArrayList<Curso> resultado = new ArrayList<>();
        for (ComponenteAcademia elemento : elementos) {
            resultado.addAll(elemento.buscar(c));
        }
        return resultado;
    }

    @Override
    public Curso cursoMasCaro() {
        Curso cursoMasCaro = null;
        double valorMasCaro = 0;
        for (ComponenteAcademia hijo : elementos) {
            Curso masCaroDelHijo = hijo.cursoMasCaro();
            double valorMasCaroHijo = masCaroDelHijo.getPrecio();
            if (masCaroDelHijo.getPrecio() > valorMasCaro) {
                valorMasCaro = valorMasCaroHijo;
                cursoMasCaro = masCaroDelHijo;
            }
        }
        return cursoMasCaro;
    }


}
