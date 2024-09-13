package libreria;

import java.util.ArrayList;



public class Principal {

	public static void main(String[] args) {
		Producto p1 = new Producto("ejemplo1", 
				  "Juan", 10, 100, "aca esta el resumen");
		Producto p2 = new Producto("ejemplo2", 
				  "Juan2", 10, 100, "aca esta el resumen");
		
		p1.addGenero("accion");
		p2.addGenero("comedia");
		
		
		Cliente cc = new Cliente("Carla","Gomez", 0,"movediza 123" ,10);
        cc.addAutorFavorito("Juan");
        cc.addGeneroFavorito("comedia");
        
        if (cc.leGusta(p1)) {
        	System.out.println("LE GUSTA");
        } else {
        	System.out.println("NO LE GUSTA");
        }
	
	   Libreria libs = new Libreria();
	   
	   ClienteExigente cc2 = new ClienteExigente("Miguel","Gomez", 1,"movediza 123" ,10);
       cc2.addAutorFavorito("Juan");
       cc2.addGeneroFavorito("Comedia");
	   
	   libs.addCliente(cc);
	   libs.addCliente(cc2);
	   
	   ArrayList<Cliente> aux = libs.getClientes(p1);
	   
	   System.out.println(aux);
	   
	   p1.addGenero("comedia");
	   
       aux = libs.getClientes(p1);
	   
	   System.out.println(aux);
	   
	   Cliente cc3 = new Cliente("Carla","Gomez", 0,"movediza 123" ,10);
       cc3.addAutorFavorito("Juan");
       cc3.addGeneroFavorito("comedia");
       
       libs.addCliente(cc3);
       aux = libs.getClientes(p1);
	   
	   System.out.println(aux);
	}

}
