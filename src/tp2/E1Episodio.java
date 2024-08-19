package tp2;

public class E1Episodio {

    private String titulo;
    private String descripcion;
    private boolean flag; //visto o no
    private int calificacion; //del 1 al 5 - por def -1;

    public E1Episodio(String titulo, String descripcion, boolean flag) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.flag = flag;
        this.calificacion = -1;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isFlag() {
        return flag;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void calificarEpisodio(int calificacion) {
        if(calificacion > 1 && calificacion < 5) {
            this.calificacion = calificacion;
        } else {
            System.out.println("valor incorrecto, ingrese valores del 1 al 5");
        }
    }
}

