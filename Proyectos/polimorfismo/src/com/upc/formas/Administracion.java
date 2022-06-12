package com.upc.formas;

import java.util.ArrayList;
import java.util.List;

public class Administracion {
    private List<Profesor> profesores;

    public Administracion() {
        profesores = new ArrayList<>();
    }
    public void registrar(Profesor profesor){
        profesores.add(profesor);
    }
   
    public List<Profesor> obtenerProfesoresGanan500(){
        List<Profesor> arreglo = new ArrayList<>();
        for(Profesor profesor:profesores){
            if(profesor.calcularSueldo()>=500){
                arreglo.add(profesor);
            }
        }
        return arreglo;
    }

}
