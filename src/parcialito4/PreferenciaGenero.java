package parcialito4;

public class PreferenciaGenero extends Preferencia {
    private String genero;
    public PreferenciaGenero(String genero) {
		super();
		this.genero = genero;
	}
	public boolean cumple(Pelicula p) {
		return p.tieneGenero(genero);
	}
}


