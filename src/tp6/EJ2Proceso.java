package tp6;

public class EJ2Proceso extends EJ2ElementoCola {
    private String nombre;
    private double memoriaRequerida;

    public EJ2Proceso(String nombre, double memoriaRequerida) {
        this.nombre = nombre;
        this.memoriaRequerida = memoriaRequerida;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMemoriaRequerida() {
        return memoriaRequerida;
    }

    @Override
    public String toString() {
        return "Proceso{" +
                "nombre='" + nombre + '\'' +
                ", memoria requerida=" + memoriaRequerida +
                '}';
    }


    @Override
    public boolean esMayor(EJ2ElementoCola otro) {
        return this.getMemoriaRequerida() > ((EJ2Proceso) otro).getMemoriaRequerida();
    }

    @Override
    public boolean equals(Object otro) {
        try {
            EJ2Proceso otroProceso = (EJ2Proceso) otro;
            return this.getNombre().equals(otroProceso.getNombre()) && this.getMemoriaRequerida() == (((EJ2Proceso) otro).memoriaRequerida);
        } catch (Exception e) {
            return false;
        }
    }
}
