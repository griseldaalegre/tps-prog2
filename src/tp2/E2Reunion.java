package tp2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class E2Reunion {
    private String tema;
    private double duracion;
    private String lugar;
    private LocalDate fecha;//no tiene hora
    private LocalTime hora;
    private ArrayList<E2Usuario> participantes; //NUNCA GETERS Y SETTERS
    //telefonos e imail participantes?


    public E2Reunion(String tema, double duracion, String lugar, LocalDate fecha, LocalTime hora) {
        this.tema = tema;
        this.duracion = duracion;
        this.lugar = lugar;
        this.fecha = fecha;
        this.hora = hora;
        this.participantes = new ArrayList<E2Usuario>();
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void addParticipante(E2Usuario u) {
        if (!participantes.contains(u)) { //para q esto funcione usuario debe implementar equals
            this.participantes.add(u);
        }
    }

    public boolean estaUsuario(E2Usuario u) {
        return participantes.contains(u);
    }

    public void removeUsuario(E2Usuario u) {
        //EL EQUALS EN USUARIOS
        participantes.remove(u);
    }

    public boolean choca(E2Reunion otraR) {
        if (fecha.equals(otraR.getFecha())) {
            //si son el mismo dia, controlo la hora
            LocalTime horaFin = LocalTime.of(hora.getHour() + (int) duracion, hora.getMinute());
            //INICIO-->HORA
            //FIN --> HORA FIN

            LocalTime otroHora = otraR.getHora();
            LocalTime otroHoraFin = LocalTime.of(otroHora.getHour() + (int) otraR.getDuracion(), otroHora.getMinute());

            if (hora.isBefore(otroHora) && horaFin.isAfter(otroHoraFin)) {
                return false;
            } else {
                if (hora.isBefore(otroHoraFin) && horaFin.isAfter(otroHoraFin)) {
                    return false;
                } else {
                    if (otroHora.isBefore(hora) && otroHoraFin.isAfter(hora)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }


}
