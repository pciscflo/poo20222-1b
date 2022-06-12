package com.upc.formas;

public class App {
    public static void main(String[] args) {
        PTCompleto ptCompleto1 = new PTCompleto(202014,"Luis","88888888",
                "Master",41,2000,0.12);
        System.out.println("Sueldo:" + ptCompleto1.calcularSueldo());
        PTParcial ptParcial1 = new PTParcial(4562138,"Juan","99999999",
                "Ingeniero",35,30,40);
        System.out.println("Sueldo:" + ptParcial1.calcularSueldo());

    }

}
