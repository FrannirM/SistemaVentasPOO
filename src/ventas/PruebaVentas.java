package ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("*** Sistema de ventas ***");

        var producto1 = new Producto("Blusa", 30.00);
        System.out.println(producto1);

        var producto2 = new Producto("Zapatos", 50);
        System.out.println("producto2 = " + producto2);

        //Primer objeto tipo orden
        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        System.out.println(orden1);
        //orden1.mostrarOrden();

        //Segunda orden
        var orden2 = new Orden();
        orden2.agregarProducto(new Producto("Playera", 15.00));
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        //orden2.mostrarOrden();
        System.out.println(orden2);
    }
}
