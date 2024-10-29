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
    public double getGanancias() {
        double monto = 0;
        int cantidadVendida = 0;
        for (Venta venta : ventas) {
            monto += venta.getMonto();
            cantidadVendida += venta.getCantidadProductosVendidos();
        }
        return monto * cantidadVendida;
    }

    @Override
    public ArrayList<Vendedor> buscar(Condicion c) {
        ArrayList<Vendedor> resultado = new ArrayList<>();
        if (c.cumple(this)) {
            resultado.add(this);
        }
        return resultado;
    }

    @Override
    public int cantidadProductosVendidos() {
        int resultado = 0;
        for (Venta venta : ventas) {
            resultado += venta.getCantidadProductosVendidos();
        }
        return resultado;
    }

    @Override
    public int cantidadVentasTotales() {
        return this.ventas.size();
    }

    @Override
    public int getPromedioEdad() {
        return edad;
    }

    @Override
    public int getCantidadPersonas() {
        return 1;
    }

    public boolean buscarFechaVentaBefore(LocalDate fechaInicio) {
        for (Venta venta : ventas) {
            LocalDate fechaVenta = venta.getFecha();
            if ((fechaVenta.isBefore(fechaInicio) || fechaVenta.isEqual(fechaInicio))) {
                return true; // Devuelve true si alguna venta está dentro del rango
            }
        }
        return false; // Devuelve false si no se encontró ninguna venta en el rango
    }

    public boolean buscarFechaVentaAfter(LocalDate fechaFin) {
        for (Venta venta : ventas) {
            LocalDate fechaVenta = venta.getFecha();
            if ((fechaVenta.isAfter(fechaFin) || fechaVenta.isEqual(fechaFin))) {
                return true; // Devuelve true si alguna venta está dentro del rango
            }
        }
        return false; // Devuelve false si no se encontró ninguna venta en el rango
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
