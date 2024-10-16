package parcialito4;

import java.time.LocalDate;

public class PreferenciaFechaLanzamiento extends Preferencia {
    LocalDate otrafecha;
	public PreferenciaFechaLanzamiento(LocalDate otrafecha) {
		this.otrafecha = otrafecha;
	}
	public boolean cumple(Pelicula p) {
		return p.getFechaLanzamiento().isAfter(otrafecha);
	}

}



