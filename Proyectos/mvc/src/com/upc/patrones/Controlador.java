package com.upc.patrones;

public class Controlador {
    private Vista vista;
    private Calculadora calculadora;

    public Controlador() {
    }

    public Controlador(Vista vista, Calculadora calculadora) {
        this.vista = vista;
        this.calculadora = calculadora;
    }


    public void sumar() {
        int sum = calculadora.suma();
        vista.mostrar(sum);
    }

    public void restar() {
        int res = calculadora.resta();
        vista.mostrar2(res);
    }
}
