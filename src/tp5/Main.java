package tp5;


public class Main {
    public static void main(String[] args) {
        //EJERCICIO 1
        /*
        LocalDate fechaCompra = LocalDate.of(2024, Month.AUGUST, 3);
        EJ1Planta flor = new EJ1Planta("Marga", "Margarita", "Argentina", fechaCompra);
        System.out.println(flor);

        LocalDate fechaCompra1 = LocalDate.of(2024, Month.AUGUST, 3);
        EJ1Planta flor1 = new EJ1Planta("Rosa", "Rosa", "Argentina", fechaCompra1);
        System.out.println(flor1);

        LocalDate fechaCompra2 = LocalDate.of(2024, Month.AUGUST, 3);
        EJ1Planta flor2 = new EJ1Planta("Malbon", "Mal", "Argentina", fechaCompra2);
        System.out.println(flor2);

        //EJERCICIO 2
        double cm = 100;
        double pulgadas = EJ2Conversor.cmAPulgadas(cm);
        System.out.println(cm + " cm son " + pulgadas + " pulgadas.");

        double litros = 10;
        double galones = EJ2Conversor.litrosAGalones(litros);
        System.out.println(litros + " litros son " + galones + " galones.");
        //EJERCICIO 3 REVISAR

        EJ3PilaElementos pila = new EJ3PilaElementos();
        pila.push("ELEMENTO1");
        pila.push("ELEMENTO2");
        System.out.println(pila.pop());
        System.out.println(pila.pop());

        pila.push("ELEMENTO90");
        pila.push("ELEMENTO65");

        System.out.println(pila.copy());
        System.out.println(pila.reverse());

        System.out.println(pila.top());
        */
        //EJERCICIO 4

        EJ4CasaLinaje casalinaje = new EJ4CasaLinaje(3);

        //CASA COMUN
        EJ4Casa casaComun = new EJ4Casa(2);
        casaComun.setCualidad("Inteligente");
        casaComun.setCualidad("joven");

        //Casa LINAJE
        EJ4Casa casaLinaje = new EJ4CasaLinaje(2);
        casaLinaje.setCualidad("magoPRO");

        /*Casa ENEMISTADA

        CasaEnemistada casaEnemistada = new CasaEnemistada(2);
        casaEnemistada.agregarRequisito("inteligente");
        casaEnemistada.agregarCasaEnemiga(casaComun);
*/


        //<------------------------------PERSONAS--------------------------->

        //Juan casa comun
        /*EJ4Alumno juanCumple = new EJ4Alumno("juan");
        juanCumple.setCualidades("Inteligente");
        juanCumple.setCualidades("joven");*/
        //Luis casa comun

        EJ4Alumno luisNoCumple = new EJ4Alumno("luis");
        luisNoCumple.setCualidades("Otra");
        luisNoCumple.setCualidades("viejo");

        luisNoCumple.setCualidades("magoPRO");
        //juanCumple.setFamilia(luisNoCumple);
        //  luisNoCumple.setFamilia(juanCumple);
    /*
        System.out.println(casaComun.agregarResidente(juanCumple));
        System.out.println(casaComun.agregarResidente(luisNoCumple));
        */
        //Juan casa linaje
       /* EJ4Alumno juanLinaje = new EJ4Alumno("Juan Linaje");
        juanLinaje.setCualidades("magoPro");
        System.out.println(casalinaje.agregarResidente(juanLinaje));


        EJ5Cooperativa cop1 = new EJ5Cooperativa();
        cop1.addMineralPrimario("hierro");
        cop1.addMineralPrimario("Magnesio");

        EJ5Lote lote1 = new EJ5Lote(3);
        EJ5Lote lote2 = new EJ5Lote(3);
        EJ5Lote lote3 = new EJ5Lote(53);

        lote1.addMineral("hierro");
        lote1.addMineral("Magnesio");
        lote2.addMineral("hierro");
        lote3.addMineral("hierro");
        lote3.addMineral("Magnesio");

        cop1.addLote(lote1);
        cop1.addLote(lote2);
        cop1.addLote(lote3);

        EJ5Pastura pastura = new EJ5Pastura("P1",200);

        System.out.println(cop1.getLotesPara(pastura));
        */
        //EJERCICIO 7

        EJ7Empleado pepe = new EJ7Empleado("pepe", "diaz", "12", 200.00);
        System.out.println("Empelado " + pepe.getSueldo());

        EJ7Vendedor luis = new EJ7Vendedor("lios", "lopez", "13", 200.00, 300.00, 2);

        System.out.println("Vendedor " + luis.getSueldo());

        EJ7Empresa empresa1 = new EJ7Empresa();

        empresa1.addEmpleado(pepe);
        empresa1.addEmpleado(luis);

        System.out.println(empresa1.gastosEnSueldo());

    }
}
