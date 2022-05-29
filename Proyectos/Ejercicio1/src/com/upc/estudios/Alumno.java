package com.upc.estudios;

public class Alumno { //Debe iniciarse en mayúscula, y estar en singular
    private int codigo; //inician en minúscula
    private String nombre;
    private int nota1;
    private int nota2;

    public Alumno(int codigo, String nombre, int nota1, int nota2) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    public double calcularPromedio(){ //los métodos deben iniciarse en minúscula
        return (nota1 + nota2)/2.0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }
}
