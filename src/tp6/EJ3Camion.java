package tp6;

import java.time.LocalDate;

public class EJ3Camion implements EJ3ElementoCola {
    private String cereal;
    private double capacidad;
    private LocalDate fechaDeCarga;

    public EJ3Camion(String cereal, double capacidad, LocalDate fechaDeCarga) {
        this.cereal = cereal;
        this.capacidad = capacidad;
        this.fechaDeCarga = fechaDeCarga;
    }

    public String getCereal() {
        return cereal;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public LocalDate getFechaDeCarga() {
        return fechaDeCarga;
    }

    //los camiones que fueron cargados primero serán atendidos en primer lugar
    @Override
    public boolean esMayor(EJ3ElementoCola otro) {
        return this.getFechaDeCarga().isBefore(((EJ3Camion) otro).getFechaDeCarga());
    }

    @Override
    public String toString() {
        return "EJ3Camion{" +
                "Cereal=" + cereal + ", "+
                "capacidad=" + capacidad +
                ", fechaDeCarga=" + fechaDeCarga +
                '}';
    }
}
