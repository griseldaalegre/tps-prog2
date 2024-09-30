package tp6;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       /* EJ1Pelicula peli = new EJ1Pelicula("shrek", 2, "Adamson");
        EJ1Pelicula peli1 = new EJ1Pelicula("shrek2", 0, "Adamson");

        EJ1Vehiculo vehiculo = new EJ1Vehiculo("Civic", "2ued", 20.000);

        EJ1Cliente c1 = new EJ1Cliente("Luis");
        EJ1Cliente c2 = new EJ1Cliente("Carlos");
        EJ1Cliente c3 = new EJ1Cliente("Maria");
        EJ1Cliente c4 = new EJ1Cliente("Luz");

        LocalDate limite1 = LocalDate.of(2022, 3, 12);
        LocalDate limite2 = LocalDate.of(2023, 9, 11);
        LocalDate limite3 = LocalDate.of(2024, 6, 12);
        LocalDate limite4 = LocalDate.of(2024, 9, 1);

        EJ1Alquiler alq1 = new EJ1Alquiler(c1, peli, limite1);
        EJ1Alquiler alq2 = new EJ1Alquiler(c2, peli1, limite2);
        EJ1Alquiler alq3 = new EJ1Alquiler(c3, vehiculo, limite3);
        EJ1Alquiler alq4 = new EJ1Alquiler(c4, peli1, limite4);


        // EJ1Alquiler alq3 = new EJ1Alquiler(c1, vehiculo, limite3);
        //EJ1Alquiler alq4 = new EJ1Alquiler(c2, vehiculo, limite3);

        EJ1SistemaAlquiler alq = new EJ1SistemaAlquiler();
        System.out.println(alq.addAlquiler(alq1));
        System.out.println(alq.addAlquiler(alq2));
        System.out.println(alq.addAlquiler(alq3));
        System.out.println(alq.addAlquiler(alq4));

        System.out.println(alq.alquileresVencidos());

        EJ2Computo cetro = new EJ2Computo();

        EJ2Computadora c1 = new EJ2Computadora("lab1", 2560.0);
        EJ2Computadora c2 = new EJ2Computadora("lab2", 5560.0);
        EJ2Computadora c3 = new EJ2Computadora("lab3", 3560.0);
        cetro.addCoputadora(c1);
        cetro.addCoputadora(c2);
        cetro.addCoputadora(c3);
        */

        EJ3Puerto puerto1 = new EJ3Puerto("Migue");

        LocalDate f1 = LocalDate.of(2024, 4, 5);
        LocalDate f2 = LocalDate.of(2024, 3, 5);
        LocalDate f3 = LocalDate.of(2024, 1, 5);

        EJ3Camion c1 = new EJ3Camion("Maiz", 3.000, f1);
        EJ3Camion c2 = new EJ3Camion("Trigo", 8.000, f2);
        EJ3Camion c3 = new EJ3Camion("Otro", 500, f3);

        EJ3Barco b1 = new EJ3Barco(3.000);
        EJ3Barco b2 = new EJ3Barco(1.000);
        EJ3Barco b3 = new EJ3Barco(300);

        puerto1.addBarco(b1);
        puerto1.addBarco(b2);
        puerto1.addBarco(b3);

        puerto1.addCamion(c1);
        puerto1.addCamion(c2);
        puerto1.addCamion(c3);


    }

}