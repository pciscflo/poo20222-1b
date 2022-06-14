package com.upc.facturas;

public class Item {
    private int cantidad;
    private Producto producto;

    public Item(int cantidad, String codigo, String descripcion, double precio) {
        this.cantidad = cantidad;
        this.producto = new Producto(codigo, descripcion, precio);//composicion, lo creo
    }
    public double calcularSubTotal(){
        return cantidad*producto.getPrecio();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
