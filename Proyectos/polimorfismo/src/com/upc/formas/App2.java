package com.upc.formas;

public class App2 {
    public static void main(String[] args) {
        PTCompleto ptCompleto1 = new PTCompleto(202014,"Luis","88888888",
                "Master",41,600,0.12);
        PTParcial ptParcial1 = new PTParcial(4562138,"Juan","99999999",
                "Ingeniero",35,50,40);
        PTCompleto ptCompleto2 = new PTCompleto(532147,"Alberto","77777777",
                "Abogado",35,1800,0.11);
        Administracion administracion = new Administracion();
        administracion.registrar(ptCompleto1);
        administracion.registrar(ptCompleto2);
        administracion.registrar(ptParcial1);

        for(Profesor p:administracion.obtenerProfesoresGanan500()){
            System.out.println(p.toString()+ "Sueldo Total: " + p.calcularSueldo());
        }

        System.out.println("**** Aumento");

        for(Profesor p:administracion.obtenerProfesoresGanan500()){
           p.aumento();
        }
        for(Profesor p:administracion.obtenerProfesoresGanan500()){
            if(p instanceof PTParcial){
                
            }

            System.out.println(p.toString()+ "Sueldo Total: " + p.calcularSueldo());
        }



    }
}
