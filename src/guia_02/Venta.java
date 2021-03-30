package guia_02;

import java.util.UUID;

/*
e.      Analizar de agregar el tipo ItemVenta, que representa un producto que
        forma parte de la venta. El mismo contiene un id, un nombre, descripción y
        precio unitario. Considere las modificaciones necesarias en el tipo Factura
        para que el mismo pueda almacenar múltiples Ítems de venta y a su vez
        calcular los montos totales con y sin el descuento aplicado.
 */
public class Venta {
    private UUID id = UUID.randomUUID();
    private String nombre;
    private String descripcion;
    private double precio;
    private Cliente cliente;
    private Venta[] item;

    public Venta() {

    }

    public Venta(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }



    @Override
    public String toString() {
        return "Factura[id= " + id + " ,  Producto= " + nombre + " , Descripcion del producto= " + descripcion + "Precio= " + precio + " ]";
    }

    public double totalCompra() {
        double total = 0;
        return total += precio;

    }
}
