package clases.compositeMultinacionalBusquedas;

public class Main {
    public static void main(String[] args) {
        Empleado juan = new Empleado("Juan", "Perez", "Java", 80000.60);
        Empleado maria = new Empleado("Maria", "Perez", "PHP", 40000.00);
        Empleado leonardo = new Empleado("Leonado", "Perez", "Java", 80000.60);
        Empleado pedro = new Empleado("Pedri", "Perez", "Python", 200000.50);
        Empleado luis = new Empleado("Luis", "Perez", "Java", 200000.50);
        Empleado nuevoEmp = new Empleado("Martin", "Perez", "Java", 200000.50);


        //Creo grupos - tiene conjunto dde empleados
        Grupo g1 = new Grupo("backend");
        g1.addElemento(juan);
        g1.addElemento(leonardo);

        Grupo g2 = new Grupo("investigacion");
        g1.addElemento(pedro);

        Grupo g3 = new Grupo("front");
        g1.addElemento(maria);
        g1.addElemento(leonardo);

        //Creo sucursales
        Grupo sucuarsalTandil = new Grupo("Sucursal Tandil");
        sucuarsalTandil.addElemento(g1);
        sucuarsalTandil.addElemento(g2);//agrego grupos
        sucuarsalTandil.addElemento(luis);//agrego elemento suelto

        Grupo sucuarsalQuequen = new Grupo("Sucursal Quequen");
        sucuarsalTandil.addElemento(g3);

        Grupo empresa = new Grupo("Empresa Tandil");

        empresa.addElemento(sucuarsalTandil);
        empresa.addElemento(sucuarsalTandil);
        empresa.addElemento(nuevoEmp);

        System.out.println("La empresa tiene : " + empresa.cantidadEmpleados());
    }
}
