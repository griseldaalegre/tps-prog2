package tp2;

public class E3Ciudad {
    private int cantHabitantes;
    private E3Impuesto impuesto;
    private double montoRecaudado;

    public E3Ciudad(int cantHabitantes, E3Impuesto impuesto, double montoRecaudado) {
        this.cantHabitantes = cantHabitantes;
        this.impuesto = impuesto;
        this.montoRecaudado = montoRecaudado;
    }

    public void setCantHabitantes(int cantHabitantes, E3Impuesto impuesto, double montoRecaudado ) {
        this.cantHabitantes = cantHabitantes;
    }

    public int getCantHabitantes() {
        return cantHabitantes;
    }

    public void setTipoImpuesto(E3Impuesto impuesto) {
        this.impuesto = impuesto;
    }

    public String getTipoImpuesto() {
        return impuesto.getTipo();
    }


}
