package clases.compositeMultinacionalBusquedas;

import clases.compositeMultinacionalBusquedas.condiciones.Condicion;

import java.util.ArrayList;

//Objeto compuesto;
//No se puede restringir el tipo de los hijos
public class Grupo extends ElementoEmpresa {

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
    public ArrayList<Empleado> empleadosCon(Condicion c) {
        ArrayList<Empleado> resultado = new ArrayList<>();
        for (ElementoEmpresa e : elementos) {
            ArrayList<Empleado> resultadoParcial = e.empleadosCon(c);//empleado con especialodad pero q desprenda de mi primer hijo
            resultado.addAll(e.empleadosCon(c));//No HACER UN IF PQ NO RECORRE LA ESTRUCRURA COMPUSTA
            //PA SI COMPUESTO TIENE COMPUESTO NUNCA ENTRA
        }
        return resultado;
    }

    @Override
    public ElementoEmpresa copia() {
        Grupo copia = new Grupo(this.getNombre());
        for (ElementoEmpresa e : elementos) {
            copia.addElemento(e.copia()); //agrego la copia a cada uno de mis elementos
        }
        return copia;
    }

    @Override//compuestos sin hijos
    public ElementoEmpresa copiaRestringida(Condicion c) {
        Grupo copia = new Grupo(this.getNombre()); //creo grupo
        for (ElementoEmpresa e : elementos) {
            ElementoEmpresa copiaHijo = e.copiaRestringida(c);//guardo al hijo
            if (copiaHijo != null) { // si no es null
                copia.addElemento(copiaHijo); //lo guardo
            }
        }
        if (copia.tieneElementos()) {//si mi enuncuado dice q no debo devolver copia de compuesto si esta vacio
            return copia; //si tiene elementos retorno copia
        }
        return null;
    }

    public boolean tieneElementos() {
        return !elementos.isEmpty();
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
