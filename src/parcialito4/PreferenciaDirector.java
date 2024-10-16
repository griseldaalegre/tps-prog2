package parcialito4;

public class PreferenciaDirector extends Preferencia {
     private String dir;
     
    public PreferenciaDirector(String dir) {
	   this.dir = dir;
	}

	public boolean cumple(Pelicula p) {
			return p.getDirector().equals(dir);
	}

}


