package tp11.futbol5.comparadores;

import tp11.futbol5.Socio;

import java.util.Comparator;

public class ComparadorCuotasPagas implements Comparator<Socio> {

    public int compare(Socio o1, Socio o2) {
        if (o1.pagoUltimaCuota() == o2.pagoUltimaCuota()) {
            return 0; // si ambos tienen el mismo estado de pago
        } else if (!o1.pagoUltimaCuota()) {
            return 1; // si o1 no ha pagado pero o2 sí, entonces o1 va después
        } else {
            return -1; // si o1 ha pagado pero o2 no, entonces o1 va antes
        }
    }

}
