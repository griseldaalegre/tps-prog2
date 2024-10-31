package practicaParcial.fotografias;

import java.time.LocalDate;

public class AlbumRestringido extends Album {
    private int limiteFotos;

    public AlbumRestringido(String titulo, LocalDate fecha, int limiteFotos) {
        super(titulo, fecha);
        this.limiteFotos = limiteFotos;
    }

    @Override
    public void addElemento(ElementoFoto f) {
        // verifico antes de agregar si pasa mi limite
        if (this.getCantidadElementos() + f.getCantidadElementos() <= limiteFotos) {//revisar
            this.elementos.add(f);
        }
    }
}
