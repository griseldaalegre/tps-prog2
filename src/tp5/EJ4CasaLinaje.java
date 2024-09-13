package tp5;

public class EJ4CasaLinaje extends EJ4Casa {

    public EJ4CasaLinaje(int maxAlumnos) {
        super(maxAlumnos);
    }

    @Override
    public boolean cumpleRequisitos(EJ4Alumno alumno) {

        if (this.residentes.isEmpty()) {
            if (super.cumpleRequisitos(alumno) && !casaLlena()) {
                this.residentes.add(alumno);
                alumno.setTieneCasa(true);
                return true;
            }
        }
        // Si la casa no está vacía, verifica requisitos generales y linaje
        else if (super.cumpleRequisitos(alumno) && tieneLinaje(alumno) && !casaLlena()) {
            this.residentes.add(alumno);
            alumno.setTieneCasa(true);
            return true;
        }

        return false;
    }


    public boolean tieneLinaje(EJ4Alumno alumno) {
        int i = 0;
        while (i < this.residentes.size()) {
            if (alumno.buscarFamiliar(this.residentes.get(i))) {
                return true;
            }
            i++;
        }
        return false;
    }


}
