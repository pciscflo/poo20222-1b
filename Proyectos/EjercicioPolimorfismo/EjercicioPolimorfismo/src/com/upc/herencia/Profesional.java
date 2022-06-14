package com.upc.herencia;

public class Profesional extends Concursante{
    private String institucion;
    private boolean ganadorSimilar;

    public Profesional(String dni, String nombre, String nombrePlato, int puntajeSabor, int puntajePresentacion, int puntajeOriginalidad, String institucion, boolean ganadorSimilar) {
        super(dni, nombre, nombrePlato, puntajeSabor, puntajePresentacion, puntajeOriginalidad);
        this.institucion = institucion;
        this.ganadorSimilar = ganadorSimilar;
    }

    public double calcularBono(){
        double bono=0;
        if(ganadorSimilar){
            bono = bono + 5;
        }
        return bono;
    }

    public double calcularPuntajeFinal(){
        return super.calcularPuntajeFinal() + calcularBono();
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "institucion='" + institucion + '\'' +
                ", ganadorSimilar=" + ganadorSimilar +
                "} " + super.toString();
    }
}
