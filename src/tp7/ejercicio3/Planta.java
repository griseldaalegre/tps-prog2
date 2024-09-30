package tp7.ejercicio3;

import java.util.ArrayList;

public class Planta {
    private ArrayList<String> nombresVulgares;
    private String nombreCientifico;
    private String superior;
    private String familia;
    private String clase;
    private String tipo;
    private int riego;
    private int sol;

    public Planta(String nombreCientifico, String superior, String familia, String clase, String tipo, int riego, int sol) {
        this.nombresVulgares = new ArrayList<String>();
        this.nombreCientifico = nombreCientifico;
        this.superior = superior;
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

    public String getSuperior() {
        return superior;
    }

    public void setSuperior(String superior) {
        this.superior = superior;
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
        if (!this.nombresVulgares.contains(nombre.toLowerCase())) {
            this.nombresVulgares.add(nombre.toLowerCase());
        }
    }

    public void deleteNombreVulgar(String nombre) {
        this.nombresVulgares.remove(nombre.toUpperCase());
    }

    @Override
    public String toString() {
        return "Planta{" +
                "nombreCientifico='" + nombreCientifico + '\'' +
                ", familia='" + familia + '\'' +
                ", superior='" + superior + '\'' +
                ", clase='" + clase + '\'' +
                ", tipo='" + tipo + '\'' +
                ", riego=" + riego +
                ", sol=" + sol +
                '}';
    }
}
