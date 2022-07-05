package com.upc.fiesta;

public class Pantalla {
    public static void main(String[] args) {
        Empresa empresa  = Empresa.obtenerInstancia();
        try {
            Evento evento1 = Factoria.obtenerEvento("CUM", "35", "true", "true", "true");
             evento1.validarNumeroPersonas();
            empresa.registrar(evento1);
        }
        catch (Exception e){
           System.out.println(e.getMessage());
       }
        try {
            Evento evento2 = Factoria.obtenerEvento("INF", "-40", "true", "Lobos", "true");
            evento2.validarNumeroPersonas();
            empresa.registrar(evento2);
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        try {
            Evento evento3 = Factoria.obtenerEvento("INT", "80", "true", "Atlas");
            evento3.validarNumeroPersonas();
            empresa.registrar(evento3);
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        //listado1
        for(Evento evento:empresa.getArregloEventos())
        {
            System.out.println(evento.toString()+ "  " + evento.calcularPrecioFinal());
        }
        //promedio
        System.out.println("Promedio:" + empresa.calcularPromedioFinales());

    }
}
