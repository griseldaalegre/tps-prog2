package practicaParcial.parciales2024.fotografias;

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

    private Album crearAlbum() { // <--AGREGAMOS ESTE METODO QUE CREA LA COPIA "VACIA" DEL ALBUM RESTRINGIDO
        //  LUEGO EL METODO HEREDADO DEL PADRE COMPLETA EL RESTO DE LA INFORMACION DE LA COPIA
        return new AlbumRestringido(this.getNombre(), this.getFecha(), this.limiteFotos);
    }


}
