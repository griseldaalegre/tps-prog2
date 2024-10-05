package tp8.onePiece;

public class Personaje extends Elemento {

    private Fruta fruta;
    private final int FUERZAPORDEFECTO = 125;

    public Personaje(String nombre, int edad, int fuerza, double peso) {
        super(nombre, edad, fuerza, peso);
        this.fruta = null;
    }

    @Override
    public double calcularFuerza() {
        if (comioFruta()) {
            // Se calcula la fuerza usando el peso del personaje y la fruta que ha comido
            return (int) fruta.calcularFuerza(getPeso());
        } else {
            // Si no ha comido fruta, devuelve la fuerza por defecto
            return FUERZAPORDEFECTO;
        }
    }

    @Override
    public int calcularEdad() {
        return getEdad();
    }

    @Override
    public double calcularPeso() {
        return getEdad();
    }

    public boolean comioFruta() {
        return this.fruta != null;
    }

    public void comerFruta(Fruta f) {
        this.fruta = f;
    }

}
