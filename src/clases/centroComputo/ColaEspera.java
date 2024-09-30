package clases.centroComputo;

import java.util.ArrayList;

public class ColaEspera {
	private ArrayList<Elemento> cola;

	
	
	public ColaEspera() {
		super();
		this.cola = new ArrayList<Elemento> ();
	}


	public Elemento getPrimero() {
		if(tieneElementos()) {
			return cola.remove(0);
		}
		return null;
	}
	
	
	public boolean tieneElementos() {
		return !cola.isEmpty();
	}




	public void addProceso(Elemento e) {
		boolean encontro = false;
		int lugar = 0;
		while(!encontro && lugar < cola.size()) {
			if(e.esMenor(cola.get(lugar))){
				lugar++;
			}else {
					encontro = true;
				}
		}
		if(encontro) {
			cola.add(lugar,e);
		}
		else {
			cola.add(e);
			
		}
		
	}
}
