package parcialito4;

public class PreferenciaNot extends Preferencia {

    Preferencia c1;
    
	public PreferenciaNot(Preferencia c1 ) {
		super();
		this.c1 = c1;
	}

	public boolean cumple(Pelicula P) {
       return !c1.cumple(P);
	}

}