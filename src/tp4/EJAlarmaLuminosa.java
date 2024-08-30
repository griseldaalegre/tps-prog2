package tp4;

public class EJAlarmaLuminosa extends EJ1Alarma {
    private EJ1Luz luz;

    public EJAlarmaLuminosa() {
        //recordar: los constructores no se heredan.
        super();//llamo al contructor de mi padre
        this.luz = new EJ1Luz();
    }

    @Override
    public void comprobar() {
        super.comprobar(); // Comprueba y hace sonar la alarma si es necesario
        luz.encender();

    }
}
