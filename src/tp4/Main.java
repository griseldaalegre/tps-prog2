package tp4;
public class Main {
    public static void main(String[] args) {
        //EJERCICIO 1
        /*1 - Alarma
        Implementar en Java todo el código necesario para el funcionamiento de una alarma. La
        alarma tiene tres variables que indican si: se rompió un vidrio, se abrió una puerta o ventana,
        se detectó un movimiento dentro del domicilio. Cuando se invoca al método comprobar() de
        la alarma, la misma chequea si alguna de sus variables indica que debe hacer sonar la señal
        sonora.
        Crea una clase denominada AlarmaLuminosa que, además de activar la señal sonora,
        encienda una luz cuando alguno de los indicadores está activado.
        Nota: Asumir que hay una clase Timbre, con un método hacerSonar() y una clase Luz con el
        método encender().*/

        /*E1JAlarmaLuminosa alarma = new E1JAlarmaLuminosa();
        alarma.setVidrioRoto(true);
        System.out.println(alarma.comprobar());  // Debería hacer sonar el timbre y encender la luz*/

        //EJERCICIO 2
        /*2- Alarma Sensorial
        Modificar el ejercicio anterior de manera tal que las variables que utiliza la alarma se
        cambien por sensores que poseen un comportamiento y pueden sondear diferentes partes de
        la casa. Cada sensor posee el nombre de la zona que controla. Permitir que se incorporen
        nuevos sensores. Modificar la alarma para que además de hacer sonar el timbre, imprima por
        pantalla el nombre de la zona en conflicto (pueden ser más de una).*/

        EJ2Sensor sensorPlantaAlta = new EJ2Sensor("Planta Alta", true);
        EJ2Sensor sensorPlantaBaja = new EJ2Sensor("Planta baja", true);

        EJ1Alarma alarma = new EJ1Alarma();
        alarma.addSensor(sensorPlantaAlta);
        alarma.addSensor(sensorPlantaBaja);

        System.out.println(alarma.comprobar());


    }
}
