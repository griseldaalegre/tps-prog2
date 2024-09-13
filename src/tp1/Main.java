package tp1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //E1
        E1Persona persona1 = new E1Persona(11111);
        System.out.println(persona1);
        System.out.println(persona1.esFechaNacimientoCoherenteConEdad());
        System.out.println(persona1.calcularEdad());
        System.out.println(persona1.estoyEnForma());
        System.out.println(persona1.cumpleAnosHoy());

        //E2
       /* E2Electrodomestico electro = new E2Electrodomestico("Heladera");
        System.out.println(electro);
        System.out.println(electro.calcularBalance());
        System.out.println(electro.esBajoConsumo());
        System.out.println(electro.esAltaGama());

    */
    }

}