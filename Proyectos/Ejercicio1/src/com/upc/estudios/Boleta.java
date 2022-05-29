package com.upc.estudios;

public class Boleta {
    private double monto;

    public Boleta(double monto) {
        this.monto = monto;
    }

    public double calcularIGV(){
        double igv;
        igv = 0.18*monto;
        return igv;
    }

    public double calcularTotal(){
        double total;
        total = this.monto + calcularIGV();
        return total;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
