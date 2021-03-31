package guia_02;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.UUID;


public class Factura {
    private UUID id = UUID.randomUUID();
    private Cliente cliente;
    private double monto;
    private LocalDate date = LocalDate.now();
    private Venta[] item;


    public Factura() {
    }

    public Factura(Cliente cliente, Venta[] item) {
        this.cliente = cliente;
        this.item = item;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    public Venta[] getItem() {
        return item;
    }

    public double totalCompra() {
        double total = 0;
        for (Venta i : item) {
            if (i != null) {
                total += i.getPrecio();
            }
        }
        return total;


    }

    public double totalDescuento() {
        double total = 0;
        return total = (totalCompra() * (1 - cliente.getDescuento()));

    }


    @Override
    public String toString() {
        return "Factura[id= " + id + " , fecha= " + date + " , monto= " + totalCompra() + " , montoDesc= " + totalDescuento() + " " + cliente.toString() + "\n\n" + Arrays.toString(this.item) + " ]";
    }
}