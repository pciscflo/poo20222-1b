package com.upc.patrones;

public class App {
    public static void main(String[] args) {
        Vista vista = new Vista();
        Calculadora calculadora = new Calculadora(2,3);
        Controlador controlador = new Controlador(vista,calculadora);
        controlador.sumar();
        controlador.restar();

    }
}
