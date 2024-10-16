package parcialito4;

public class PreferenciaOr extends Preferencia {

    Preferencia c1, c2;
    
	public PreferenciaOr(Preferencia c1, Preferencia c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}

	public boolean cumple(Pelicula P) {
       return c1.cumple(P)|| c2.cumple(P);
	}

}
