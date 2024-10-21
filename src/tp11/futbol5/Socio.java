package tp11.futbol5;

import tp11.futbol5.condiciones.Condicion;
import tp9.aseguradora.ComponenteSeguro;
import java.util.ArrayList;

//Compuesto
public class Socio implements Comparable<Socio> {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean pagoUltimaCuota;
    private ArrayList<Alquiler> alquileres;

    public Socio(String nombre, String apellido, int edad, boolean pagoUltimaCuota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pagoUltimaCuota = pagoUltimaCuota;
        this.alquileres = new ArrayList<Alquiler>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void addAlquiler(Alquiler a) {
        this.alquileres.add(a);
    }

    public void deleteAlquiler(Alquiler a) {
        this.alquileres.remove(a);
    }

    public boolean pagoUltimaCuota() { // 1)tiene cuota paga
        return pagoUltimaCuota;
    }

    public boolean alquiloCancha(int idCancha) { // 2) alquilo cancha
        for (Alquiler alquier : alquileres) {
            if (alquier.getIdCancha() == idCancha) {
                return true;
            }
        }
        return false;
    }


    public int contadorDeAlquileresX(int idCancha) {
        int contador = 0;
        for (Alquiler alquier : alquileres) {
            if (alquier.getIdCancha() == idCancha) {
                contador++;
            }
        }
        return contador;
    }

    public ArrayList<Socio> buscar(Condicion c) {
        ArrayList<Socio> resultado = new ArrayList();
        if (c.cumple(this)) {//si cumplo
            resultado.add(this);//me agrego
        }
        return resultado; //sino retorno vacio
    }

    //Orden natural, sino puede ordenar por los criterios que yo sobreescribi lo hace por acá
    @Override
    public int compareTo(Socio o) {
        return this.getNombre().compareTo(o.getNombre());
    }

    public boolean pagoMasDe(double valor){
        for(Alquiler alquiler: alquileres){
            if(alquiler.getValor()>valor){
                return true;
            }
        }return false;
    }
}
