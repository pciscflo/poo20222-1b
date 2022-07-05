package com.upc.fiesta;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Evento> arregloEventos;

    public Empresa() {
        this.arregloEventos = new ArrayList<>();
    }
    public void registrar(Evento evento){
        arregloEventos.add(evento);
    }

    public double calcularPromedioFinales(){
        double suma = 0;
        for(Evento evento:arregloEventos){
            suma+= evento.calcularPrecioFinal();
        }
        return suma/arregloEventos.size();
    }

    public List<Evento> getArregloEventos() {
        return arregloEventos;
    }

    public void setArregloEventos(List<Evento> arregloEventos) {
        this.arregloEventos = arregloEventos;
    }
}
