package ventas;

public class Orden {
    private final int idOrden;
    private Producto[] productos;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10; //limita el arreglo
    private static int contadorOrdenes;

    //constructor
    public Orden() {
        this.idOrden = ++contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    //Metodos
    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = producto;
        } else System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);

    }

    public double calcularTotal() {
        double total = 0.0;
        for (var i = 0; i < contadorProductos; i++) {
            var producto = this.productos[i];
            total += producto.getPrecio();
        }
        return total;
    }

    /* public void mostrarOrden() {
        System.out.println("Id Orden: " + this.idOrden);
        var totalOrden = this.calcularTotal();
        System.out.println("\tTotal de la orden: $" + totalOrden);
        System.out.println("\tProductos de la orden: ");
        for (var i = 0; i<this.contadorProductos; i++) {
            System.out.println("\t\t" + this.productos[i]);
        }
    } */

    @Override
    public String toString() {
        var resultado = "Id Orden: " + this.idOrden;
        var totalOrden = this.calcularTotal();
        resultado += "\tTotal de la orden: $" + totalOrden + "\n";
        resultado += ("\tProductos de la orden: "+ "\n");
        for (var i = 0; i<this.contadorProductos; i++) {
            resultado += ("\t\t" + this.productos[i]+ "\n");
        }
        return resultado;
    }

}
