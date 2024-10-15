package clases.compositeMultinacional;

import java.util.ArrayList;

//Objeto compuesto;
//No se puede restringir el tipo de los hijos
public class Grupo implements ElementoEmpresa {

    private String nombre;
    private ArrayList<ElementoEmpresa> elementos;

    public Grupo(String nombre) {
        this.nombre = nombre;
        this.elementos = new ArrayList<ElementoEmpresa>();
    }

    public String getNombre() {
        return nombre;
    }

    public void addElemento(ElementoEmpresa e) { //recordar sobreescribir el equals
        if (!this.elementos.contains(e)) { //controlo repetido -> metodo de listo
            this.elementos.add(e);  //Si no lo redefino copara q sea el mismo lugar de memoria
        }
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Grupo grupo = (Grupo) obj; // al parametro lo trato como un grupo
            return this.getNombre().equals(grupo.getNombre());
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public int cantidadEmpleados() {
        int contador = 0;
        // return this.elementos.size();No hacer en composite, a menos q pida la cantidad de hijos directos
        for (ElementoEmpresa elemento : elementos) { // por cada elementoEmpresa q tiene elementos
            contador += elemento.cantidadEmpleados();
        }
        return contador;
    }

    @Override
    public double gastoSueldo() {
        double total = 0;
        for (ElementoEmpresa elemento : elementos) {
            total += elemento.gastoSueldo();
        }
        return total;
    }

    @Override
    public ArrayList<Empleado> empleadosCon(String especialidad) {
        ArrayList<Empleado> resultado = new ArrayList<>();
        for (ElementoEmpresa e : elementos) {
            ArrayList<Empleado> resultadoParcial = e.empleadosCon(especialidad);//empleado con especialodad pero q desprenda de mi primer hijo
            resultado.addAll(resultadoParcial);
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
