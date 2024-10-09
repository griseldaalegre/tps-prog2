package clases.centroDeComputosConInterfaces;

public class Proceso implements Elemento {
    private String PID;
    private double memoriaReq;
    private double tiempoEstimado;

    public Proceso(String PID, double memoriaReq, double tiempoEstimado) {
        this.PID = PID;
        this.memoriaReq = memoriaReq;
        this.tiempoEstimado = tiempoEstimado;
    }

    public String getPID() {
        return PID;
    }

    public void setPID(String PID) {
        this.PID = PID;
    }

    public double getMemoriaReq() {
        return memoriaReq;
    }

    public double getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(double tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    @Override
    public boolean mayor(Elemento otro) {
        return this.getMemoriaReq()>((Proceso) otro).getMemoriaReq();
    }
    @Override
    public String toString(){
        return this.getPID()+" ("+this.getMemoriaReq()+")";
    }
}
