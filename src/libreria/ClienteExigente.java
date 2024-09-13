package libreria;

public class ClienteExigente extends Cliente {

	public ClienteExigente(String nombre, String apellido, int dni, String direccion, double descuento) {
		super(nombre, apellido, dni, direccion, descuento);
		
	}


	public boolean leGusta(Producto pp) {
		boolean seguir = super.leGusta(pp);
		if(seguir) {
			
			for(int i =0;i<generos.size();i++) {
				if (pp.tieneGenero(generos.get(i))) {
					return true;
				}
			}
		}
		return false;
		
	}

}
