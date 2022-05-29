package com.upc.estudios;

public class Principal {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno(2001,"Luis",19,18);
        System.out.println(alumno1.getNombre() + "   "  +alumno1.calcularPromedio());
        Alumno alumno2 = new Alumno(1001, "Ana",13,14);
        System.out.println(alumno2.getNombre()+ "  "+ alumno2.calcularPromedio());
    }
}
