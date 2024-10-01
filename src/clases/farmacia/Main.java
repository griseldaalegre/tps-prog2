package clases.farmacia;

public class Main {
    public static void main(String[] Args) {
        Farmacia f = new Farmacia();

        Medicamento m1 = new Medicamento("baya", "bay", 200);

        m1.addSintoma("estomago");
        m1.addSintoma("cabeza");
        m1.addSintoma("muscular");

        f.addMedicamento(m1);

        // CondicionPrecioMenor c = new CondicionPrecioMenor(100);
        // System.out.println(c.cumple(m1));

        //CondicionSintoma cs = new CondicionSintoma("estomago");
        //System.out.println(cs.cumple(m1));

        CondicionPorLaboratorio cl = new CondicionPorLaboratorio("oi");
        System.out.println(cl.cumple(m1));
    }
}
