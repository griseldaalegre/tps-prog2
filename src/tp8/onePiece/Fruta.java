package tp8.onePiece;

public abstract class Fruta {

    private double fuerzaFija;

    public Fruta(double fuerzaFija) {
        this.fuerzaFija = fuerzaFija;
    }

    public double getFuerzaFija() {
        return fuerzaFija;
    }

    public abstract double calcularFuerza(double peso);//recibe personaje? como calculo el peso
}
