package com.upc.herencia;

import java.util.ArrayList;
import java.util.List;

public class Feria {

    private static Feria feria = new Feria();
    private List<Concursante> arregloConcursantes;

    private Feria() {
        arregloConcursantes = new ArrayList<>();
    }

    public static Feria obtenerInstancia(){
        return feria;
    }
    public void registrar(Concursante concursante){
          arregloConcursantes.add(concursante);
    }

    public Concursante obtenerGanador(){
        Concursante c=null;
        double maximo = 0;
        for(Concursante concursante:arregloConcursantes){
            if(concursante.calcularPuntajeFinal()> maximo){
                maximo = concursante.calcularPuntajeFinal();
                c = concursante;
            }
        }
        return c;
    }

    public List<Concursante> getArregloConcursantes() {
        return arregloConcursantes;
    }

    public void setArregloConcursantes(List<Concursante> arregloConcursantes) {
        this.arregloConcursantes = arregloConcursantes;
    }
}
