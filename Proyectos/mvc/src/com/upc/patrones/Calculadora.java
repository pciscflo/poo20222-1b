package com.upc.patrones;
//MODELO
public class Calculadora {
    private int a, b;

    public Calculadora() {
    }

    public Calculadora(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int suma(){
        return a+b;
    }

    public int resta(){
        return a-b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
