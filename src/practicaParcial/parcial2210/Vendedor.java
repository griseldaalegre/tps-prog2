package practicaParcial.parcial2210;

import java.time.LocalDate;
import java.util.ArrayList;

import practicaParcial.parcial2210.condiciones.Condicion;

public class Vendedor extends ComponenteVenta {
    private String nombre;
    private String apellido;
    private int edad;
    private ArrayList<Venta> ventas;

    public Vendedor(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ventas = new ArrayList<Venta>();
    }

    public void addVenta(Venta v) {
        this.ventas.add(v);
    }

    @Override
    public int cantidadVentasTotales() {//BIEN
        return this.ventas.size();
    }

    @Override
    public int cantidadProductosVendidos() {//BIEN
        int resultado = 0;
        for (Venta venta : ventas) {
            resultado += venta.getCantidad();
        }
        return resultado;
    }


    @Override
    public double getGanancias() {// EL CALCULO LO HACE LA VENTA, YO SOLO DEBO SUMAR
        double resultado = 0;
        for (Venta venta : ventas) {
            resultado += venta.getGanancias();
        }
        return resultado;
    }

    @Override
    public ArrayList<Vendedor> buscar(Condicion c) {//BIEN
        ArrayList<Vendedor> resultado = new ArrayList<>();
        if (c.cumple(this)) {
            resultado.add(this);
        }
        return resultado;
    }


    public ArrayList<Venta> getVentas() {
        return new ArrayList<Venta>(ventas);
    }

    public boolean vendisteAlgo(LocalDate fi, LocalDate ff) {//LO HABIA HECHO MAL
        for (int i = 0; i < ventas.size(); i++) {

            if (ventas.get(i).getFecha().compareTo(ff) <= 0 &&
                    ventas.get(i).getFecha().compareTo(fi) >= 0)
                return true;
        }

        return false;
    }


    @Override
    public double getPromedioEdad() {
        return edad;
    }


    public boolean vendioProducto(String codigo) {
        for (Venta venta : ventas) {

            if (venta.getCodigoProducto().equals(codigo)) {
                return true; // Devuelve true si alguna venta está dentro del rango
            }
        }
        return false; // Devuelve false si no se encontró ninguna venta en el rango
    }

}
