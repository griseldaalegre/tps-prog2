package parcialito4;

public class PreferenciaTitulo extends Preferencia {
    private String pal;  
    public PreferenciaTitulo(String pal) {
	   this.pal = pal;
	}
	public boolean cumple(Pelicula p) {
		return p.getTitulo().contains(pal);
	}
}




