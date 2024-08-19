package tp2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class E4Establecimiento {
    private String nombre;
    private ArrayList<E4Cancha> listaCanchas;
    private ArrayList<E4Cliente> listaSocios;
    private ArrayList<E4Turno> listaTurnos;

    public E4Establecimiento() {
        this.listaCanchas = new ArrayList<E4Cancha>();
        this.listaSocios = new ArrayList<E4Cliente>();
        this.listaTurnos = new ArrayList<E4Turno>();
    }

    public void addCancha(E4Cancha cancha) {
        this.listaCanchas.add(cancha);
    }

    public String addTurno(E4Turno turno) {
        if (esSocio(turno.getCliente())) {
            aplicarDescuentoSocio(turno);
            this.listaTurnos.add(turno);
            return "Se guardo turno y aplico descuento";
        }
        this.listaTurnos.add(turno);
        return "Se guardo turno";
    }

    public boolean esSocio(E4Cliente cliente) {
        int i = 0;

        while (i < listaSocios.size()) {
            if (cliente.getNombre().equals(listaSocios.get(i).getNombre())) {
                return true;
            }
            i++;
        }
        return false;
    }

    public boolean puedeSerSocioGratuito(E4Cliente cliente) {
        LocalDate ahora = LocalDate.now();
        int contadorReservas = 0;

        for (int i = 0; i < listaTurnos.size(); i++) {
            E4Turno turno = listaTurnos.get(i);
            if (turno.getCliente().getNombre().equals(cliente.getNombre())) {
                Period period = Period.between(turno.getFecha(), ahora);
                if (period.getMonths() <= 2 && period.getYears() == 0) {
                    contadorReservas++;
                }
            }
        }
        return contadorReservas >= 4;
    }


    public boolean addNuevoSocio(E4Cliente cliente) {
        if (puedeSerSocioGratuito(cliente)) {
            this.listaSocios.add(cliente);
            return true;
        } else {
            return false;
        }
    }

    public boolean aplicarDescuentoSocio(E4Turno turno) {
        int i = 0;
        double valorCancha = turno.getCancha().getValor();

        while (i < listaSocios.size()) {
            if (listaSocios.get(i).getNombre().equals(turno.getCliente().getNombre())) {

                double montoConDescuento = valorCancha * (1 - 20.0 / 100);
                turno.getCancha().setValor(montoConDescuento);
                return true;
            }
            i++;
        }
        return false;
    }


}
