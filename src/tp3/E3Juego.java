package tp3;

import java.util.ArrayList;

public class E3Juego {
    private ArrayList<E3Personaje> listaPersonajes;
    private E3Jugador jugador1;
    private E3Jugador jugador2;

    public E3Juego(E3Jugador jugador1, E3Jugador jugador2) {
        this.listaPersonajes = new ArrayList<E3Personaje>();
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public void addPersonaje(E3Personaje personaje) {
        this.listaPersonajes.add(personaje);
    }

    public E3Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(E3Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public E3Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(E3Jugador jugador2) {
        this.jugador2 = jugador2;
    }


}
