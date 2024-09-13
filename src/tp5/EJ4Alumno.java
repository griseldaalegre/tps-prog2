package tp5;

import java.util.ArrayList;

public class EJ4Alumno {
    private String nombre;
    private boolean tieneCasa;
    private ArrayList cualidades;
    private ArrayList<EJ4Alumno> familiares;

    public EJ4Alumno(String nombre) {
        this.nombre = nombre;
        this.cualidades = new ArrayList<String>();
        this.familiares = new ArrayList<>();
        this.tieneCasa = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTieneCasa() {
        return tieneCasa;
    }

    public void setTieneCasa(boolean tieneCasa) {
        this.tieneCasa = tieneCasa;
    }

    public void setCualidades(String cualidad) {
        this.cualidades.add(cualidad);
    }

    public void setFamilia(EJ4Alumno familiar) {
        this.familiares.add(familiar);
    }

    public boolean buscarFamiliar(EJ4Alumno familiar) {
        int i = 0;
        boolean encontreFamiliar = false;

        while (i < this.familiares.size() && !encontreFamiliar) {
            if (this.familiares.get(i).equals(familiar)) {
                encontreFamiliar = true;
                return encontreFamiliar;
            } else {
                i++;
            }
        }
        return encontreFamiliar;
    }


    public boolean tieneFamiliares() {
        return (this.familiares.size() > 0);
    }

    public boolean tieneCualidades() {
        return (this.cualidades.size() > 0);
    }

    public boolean tieneCualidad(String requisito) {
        if (this.tieneCualidades()) {
            int i = 0;
            while (i < this.cualidades.size()) {
                if (this.cualidades.get(i).equals(requisito)) {
                    return true;
                }
                i++;
            }
        } else {
            return false;
        }
        return false;
    }

    //sobrescribo el equals de mi clase alumno para poder comparar string

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false; // Si el objeto es nulo, no son iguales
        }
        EJ4Alumno otroAlumno;
        try {
            otroAlumno = (EJ4Alumno) obj; // Intentamos hacer el cast
        } catch (ClassCastException e) {
            return false; // Si no es de la clase EJ4Alumno, retorna false
        }

        // Comparamos las listas de cualidades
        return this.cualidades.equals(otroAlumno.cualidades);
    }


}
