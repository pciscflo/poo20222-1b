package com.upc.fiesta;

public class Pantalla {
    public static void main(String[] args) {
        Evento evento1 = new EventoCumpleaños(30,true,true,true);
        Evento evento2 = new EventoInfantil(40,true,"Lobos",true);
        Evento evento3 = new EventoIntegracion(80,true,"Atlas");
        Empresa empresa  = new Empresa();
        empresa.registrar(evento1);
        empresa.registrar(evento2);
        empresa.registrar(evento3);
        //listado1
        for(Evento evento:empresa.getArregloEventos())
        {
            System.out.println(evento.toString()+ "  " + evento.calcularPrecioFinal());
        }
        //promedio
        System.out.println("Promedio:" + empresa.calcularPromedioFinales());

    }
}
