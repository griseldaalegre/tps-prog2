package libreria;

public class ClienteSuperExigente extends Cliente {

	public ClienteSuperExigente(String nombre, String apellido, int dni, String direccion, double descuento) {
		super(nombre, apellido, dni, direccion, descuento);
		// TODO Auto-generated constructor stub
	}
	//CLASE ESPECIAL QUE ESTABLECE QUE LE TIENEN QUE TENER EL PRODUCTO TODOS LOS GENEROS
	//QUE LE GUSTAN AL CLIENTE
	public boolean leGusta(Producto pp) {
		if (super.leGusta(pp)) {
			for(int i =0;i<generos.size();i++) {
				if (!pp.tieneGenero(generos.get(i))) {
					return false;
				}
			}
			return true;
		} 
		return false;
	}

}
