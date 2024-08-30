package tp4;

import java.util.ArrayList;

public class E1JAlarmaLuminosa extends EJ1Alarma {
    private EJ1Luz luz;

    public E1JAlarmaLuminosa() {
        //recordar: los constructores no se heredan.
        super();//llamo al contructor de mi padre
        this.luz = new EJ1Luz();
    }

    @Override
    public String comprobar() {
        return super.comprobar(); // Comprueba y obtiene las zonas activas
    }
}
