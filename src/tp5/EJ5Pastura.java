package tp5;

public class EJ5Pastura extends EJ5Cereal {
    private int superficieMinima;

    public EJ5Pastura(String nombre, int superficieMinima) {
        super(nombre);
        this.superficieMinima = superficieMinima;
    }

    public int getSuperficieMinima() {
        return superficieMinima;
    }

    public void setSuperficieMinima(int superficieMinima) {
        this.superficieMinima = superficieMinima;
    }

    //cambia la implementacion del padre
    public boolean acept(EJ5Lote lote) {
        return super.acepta(lote) && lote.getSuperficie() > superficieMinima;
    }

}
