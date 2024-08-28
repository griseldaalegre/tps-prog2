package tp2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //EJERCICIO 1
       /* E1Serie dexter = new E1Serie("dexter", "descripcion", "Jeff Lindsay", "Crimen");

        E1Temporada temporada1 = new E1Temporada();
        E1Temporada temporada2 = new E1Temporada();

        E1Episodio episodio1 = new E1Episodio("Inicio", "descripcion", true);
        E1Episodio episodio2 = new E1Episodio("Inicio parte2", "descripcion2", true);
        E1Episodio episodio3 = new E1Episodio("Inicio parte3", "descripcion3", true);

        E1Episodio episodio1T2 = new E1Episodio("Inicio", "descripcion", true);
        E1Episodio episodio2T2 = new E1Episodio("Inicio", "descripcion", true);

        temporada1.addEpisodio(episodio1);
        temporada1.addEpisodio(episodio2);
        temporada1.addEpisodio(episodio3);

        temporada2.addEpisodio(episodio1T2);
        temporada2.addEpisodio(episodio2T2);

        dexter.addTemporada(temporada1);
        dexter.addTemporada(temporada2);
        //Ingresar la calificación de un episodio
        episodio1.calificarEpisodio(1);
        episodio2.calificarEpisodio(3);
        episodio3.calificarEpisodio(3);

        //Total episodios vistos de una temporada particular
        System.out.println("Temporada 1: " + temporada1.totalEpisodiosVistos());

        //Total de episodios vistos de una serie.
        System.out.println("Total de episodios vistos por serie dexter: " + dexter.totalEpisodiosVistosXSerie());

        //Obtener el promedio de las calificaciones dadas para una temporada particular.
        System.out.println("Promedio por temporada " + temporada1.promedioCalificaciones());

        //Determinar si se vio todos los episodios de la serie.
        System.out.println("Se vieron todas las temporadas de la serie: " + dexter.seVioLaTodaSerie());


        //EJERCICIO 2
        E2Agenda agendaJuan = new E2Agenda();

        E2Reunion reunion1 = new E2Reunion("Oficina", "Sueldos", "2 horas");

        E2Participante Pablo = new E2Participante("Garcia", "garcia@gmai.com", "2339432");
        E2Participante Maria = new E2Participante("López", "lopez@gmai.com", "2345322");

        reunion1.addParticipante(Pablo);
        reunion1.addParticipante(Maria);
        agendaJuan.addReunion(reunion1);*/

        //EJERCICIO 3

        //EJERCICIO 4
/*
        E4Establecimiento club1 = new E4Establecimiento();
        E4Cancha f1 = new E4Cancha("Futbol", 400);
        E4Cancha f2 = new E4Cancha("Futbol", 400);
        E4Cancha f3 = new E4Cancha("Futbol", 400);
        E4Cancha f4 = new E4Cancha("Futbol", 400);
        E4Cancha f5 = new E4Cancha("Futbol", 400);
        E4Cancha f6 = new E4Cancha("Futbol", 400);

        E4Cancha p1 = new E4Cancha("Paddle", 100);
        E4Cancha p2 = new E4Cancha("Paddle", 100);
        E4Cancha p3 = new E4Cancha("Paddle", 100);
        E4Cancha p4 = new E4Cancha("Paddle", 100);

        club1.addCancha(f1);
        club1.addCancha(f2);
        club1.addCancha(f3);
        club1.addCancha(f4);
        club1.addCancha(f5);
        club1.addCancha(f6);

        club1.addCancha(p1);
        club1.addCancha(p2);
        club1.addCancha(p3);
        club1.addCancha(p4);

        E4Cliente juanCarlos = new E4Cliente("Juan Carlos");
        LocalDate fturno1 = LocalDate.of(2024, 6, 23);
        E4Turno turno1 = new E4Turno(juanCarlos, f1, fturno1);

        System.out.println(club1.addNuevoSocio(juanCarlos));
        System.out.println(club1.puedeSerSocioGratuito(juanCarlos));
        System.out.println(club1.aplicarDescuentoSocio(turno1));

        LocalDate fturno2 = LocalDate.of(2024, 6, 24);
        E4Turno turno2 = new E4Turno(juanCarlos, f3, fturno2);

        LocalDate fturno3 = LocalDate.of(2024, 7, 23);
        E4Turno turno3 = new E4Turno(juanCarlos, f5, fturno3);

        LocalDate fturno4 = LocalDate.of(2024, 8, 23);
        E4Turno turno4 = new E4Turno(juanCarlos, f6, fturno4);

        LocalDate fturno5 = LocalDate.of(2024, 8, 25);
        E4Turno turno5 = new E4Turno(juanCarlos, f6, fturno5);

        System.out.println(club1.addNuevoSocio(juanCarlos) +" Carlos todavia no puede ser socio");
        System.out.println(club1.puedeSerSocioGratuito(juanCarlos));
        System.out.println(club1.addTurno(turno1));
        System.out.println(club1.addTurno(turno2));
        System.out.println(club1.addTurno(turno3));
        System.out.println(club1.addTurno(turno4));
        System.out.println(club1.addNuevoSocio(juanCarlos) +" Carlos ahora puede ser socio");
        System.out.println(club1.addTurno(turno5));

*/

        //EJERCICIO 5

        /*5 Peluquería
Una peluquería desea implementar un sistema que le permita organizar a sus clientes.
La peluquería posee 4 peluqueros. Los clientes al solicitar un turno indican con cuál peluquero se desean cortar.
 l sistema además de registrar los turnos, debe poder buscar el primer turno disponible, también el primero disponible con un determinado peluquero.
 A los clientes frecuentes se les descuenta un 10%. Se considera cliente frecuente al que saca turno al menos una vez por mes.
Consejo: Identificar similitudes y diferencias con el establecimiento deportivo. Identificar los horarios de atención.
Extra: ¿Qué sucede si un peluquero puede atender a dos clientes a la vez?*/

    }
}
