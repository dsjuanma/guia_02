package guia_02;

import java.time.LocalDate;
import java.util.UUID;

public class Factura {
    private UUID id = UUID.randomUUID();
    private Cliente cliente;
    private double monto;
    private LocalDate date = LocalDate.now();
    private Venta[] item;

    public Factura() {
    }

    public Factura(Cliente cliente, double monto) {
        this.cliente = cliente;
        this.monto = monto;
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

    public double cantidadDescuento(double monto) {
        return monto * (1 - cliente.getDescuento());
    }



    /*public double totalDescuento() {
        int total = 200;
        int index;
        return total;
         }

     */


    @Override
    public String toString() {
        return "Factura[id= " + id + " , fecha= " + date + " , monto= " + monto + " , montoDesc= " + (monto * (1 - cliente.getDescuento())) + " " + cliente.toString() + " ]";
    }
}