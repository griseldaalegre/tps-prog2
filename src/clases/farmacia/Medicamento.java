package clases.farmacia;

import java.util.ArrayList;

public class Medicamento {
    private String nombre;
    private String laboratorio;
    private double precio;
    private ArrayList<String> sintomas;

    public Medicamento(String nombre, String laboratorio, double precio) {
        this.nombre = nombre;
        this.laboratorio = laboratorio;
        this.precio = precio;
        this.sintomas = new ArrayList<String>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void addSintoma(String sin) {
        if (!sintomas.contains(sin.toUpperCase())) {
            sintomas.add(sin.toUpperCase());
        }
    }

    public boolean tieneSintoma(String sin) {
        return sintomas.contains(sin.toUpperCase());
    }

    public void remove(String sin) {
        sintomas.remove(sin.toUpperCase());
    }

    //EQUALS
    //el equals por def compara que no sean el mismo objeto
    public boolean equals(Object o) {
        try {
            Medicamento m = (Medicamento) o; //lo casteo
            return m.getLaboratorio().equals(nombre) && m.getLaboratorio().equals(laboratorio);
        } catch (Exception e) {
            return false;
        }
    }

}
