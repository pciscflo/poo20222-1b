package com.upc.facturas;

import java.util.ArrayList;
import java.util.List;

public class Administrador {
    private List<Factura> arregloFacturas;

    public Administrador() {
        arregloFacturas = new ArrayList<>();
    }
    public void registrar(Factura factura){
        arregloFacturas.add(factura);
    }

    public List<Factura> getArregloFacturas() {
        return arregloFacturas;
    }

    public void setArregloFacturas(List<Factura> arregloFacturas) {
        this.arregloFacturas = arregloFacturas;
    }
}
