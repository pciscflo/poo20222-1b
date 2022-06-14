package com.upc.facturas;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    private String ruc;
    private String fecha;
    private String numeroFactura;
    private String direccion;
    private List<Item> arregloItems;

    public Factura(String ruc, String fecha, String numeroFactura, String direccion) {
        this.ruc = ruc;
        this.fecha = fecha;
        this.numeroFactura = numeroFactura;
        this.direccion = direccion;
        this.arregloItems = new ArrayList<>();
    }

    public void registrar(Item item){
        arregloItems.add(item);
    }

    public double calcularTotal(){
        double suma = 0;
        for(Item item:arregloItems){
            suma+=item.calcularSubTotal();
        }
        return suma;
    }
    public double calcularIGV(){
        return calcularTotal()/1.18;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Item> getArregloItems() {
        return arregloItems;
    }

    public void setArregloItems(List<Item> arregloItems) {
        this.arregloItems = arregloItems;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "ruc='" + ruc + '\'' +
                ", fecha='" + fecha + '\'' +
                ", numeroFactura='" + numeroFactura + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
