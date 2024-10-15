package tp7.vivero;

import java.util.ArrayList;

public class Planta {
    private ArrayList<String> nombresVulgares;
    private String nombreCientifico;
    private String clasificacionSuperior;
    private String familia;
    private String clase;
    private String tipo;
    private int riego;
    private int sol;

    public Planta(String nombreCientifico, String clasificacionSuperior, String familia, String clase, String tipo, int riego, int sol) {
        this.nombresVulgares = new ArrayList<String>();
        this.nombreCientifico = nombreCientifico;
        this.clasificacionSuperior = clasificacionSuperior;
        this.familia = familia;
        this.clase = clase;
        this.tipo = tipo;
        this.riego = riego;
        this.sol = sol;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getClasificacionSuperior() {
        return clasificacionSuperior;
    }

    public void setClasificacionSuperior(String clasificacionSuperior) {
        this.clasificacionSuperior = clasificacionSuperior;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getRiego() {
        return riego;
    }

    public void setRiego(int riego) {
        this.riego = riego;
    }

    public int getSol() {
        return sol;
    }

    public void setSol(int sol) {
        this.sol = sol;
    }

    public void addNombreVulgar(String nombre) {
        // Convertimos todo a mayúsculas antes de agregar
        if (!this.nombresVulgares.contains(nombre.toUpperCase())) {
            this.nombresVulgares.add(nombre.toUpperCase());
        }
    }

    public void deleteNombreVulgar(String nombre) {
        // Convertimos a mayúsculas antes de eliminar
        this.nombresVulgares.remove(nombre.toUpperCase());
    }

    public boolean tieneNombreVulgar(String nombre) {
        // Convertimos a mayúsculas antes de comparar
        return this.nombresVulgares.contains(nombre.toUpperCase());
    }


    @Override
    public boolean equals(Object o) {
        try {
            // Intenta convertir el objeto recibido (o) en un objeto de la clase ElementoSA
            Planta planta = (Planta) o;
            // Compara el atributo "nombre" de este objeto con el atributo "nombre" del objeto "that"
            //return m.getLaboratorio().equals(nombre) && m.getLaboratorio().equals(laboratorio);
            return nombreCientifico.equals(planta.getNombreCientifico()) && clasificacionSuperior.equals(planta.getClasificacionSuperior());
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Planta{" +
                "nombreCientifico='" + nombreCientifico + '\'' +
                ", familia='" + familia + '\'' +
                ", superior='" + clasificacionSuperior + '\'' +
                ", clase='" + clase + '\'' +
                ", tipo='" + tipo + '\'' +
                ", riego=" + riego +
                ", sol=" + sol +
                '}';
    }
}
