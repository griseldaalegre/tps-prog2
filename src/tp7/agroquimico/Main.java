package tp7.agroquimico;

public class Main {
    public static void main(String[] args) {
        // Crear empresa y productos
        Empresa empresa = new Empresa();
        Producto p1 = new Producto("Agroquímico A");
        p1.addPatologia("hojas secas");
        p1.addPatologia("deshidratación");

        Producto p2 = new Producto("Agroquímico B");
        p2.addPatologia("hongos");
        p2.addPatologia("moho");

        // Agrego productos a la empresa
        empresa.addProducto(p1);
        empresa.addProducto(p2);

        //Creo efermedad
        Enfermedad e1 = new Enfermedad("Cochinilla");
        e1.addPatologia("hojas secas");
        e1.addPatologia("deshidratación");

        //Agrego cultivos
        Cultivo cultivo1 = new Cultivo("Maiz");
        cultivo1.addEnfermedad(e1);

        CondicionPorEnfermedad c1 = new CondicionPorEnfermedad(e1);
        CondicionPorCultivo c2 = new CondicionPorCultivo(cultivo1);

        // Buscar productos que cumplen la condición
        System.out.println(empresa.buscarProductos(c2));


    }
}

