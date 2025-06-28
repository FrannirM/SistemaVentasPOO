package ventas;

public class Producto {
    //Agrego atributos
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProducto;

    //Constructor
    public Producto(String nombre, double precio) {
        this.idProducto = ++Producto.contadorProducto;
        this.nombre = nombre;
        this.precio = precio;
    }

    //getters y setters
    public int getIdProducto() {
        return this.idProducto;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //toString
    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + this.idProducto +
                ", nombre='" + this.nombre + '\'' +
                ", precio=" + this.precio +
                '}';
    }
}
