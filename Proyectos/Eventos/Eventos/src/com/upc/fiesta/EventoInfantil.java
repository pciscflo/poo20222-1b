package com.upc.fiesta;

public class EventoInfantil extends Evento{
    private String tematica;
    private boolean servicioPayaso;

    public EventoInfantil() {
    }

    public EventoInfantil(int numeroPersonas, boolean catering, String tematica, boolean servicioPayaso) {
        super(numeroPersonas, catering);
        this.tematica = tematica;
        this.servicioPayaso = servicioPayaso;
    }
    public double calcularRecargo(){
        double monto=0;
        if(servicioPayaso){
            monto= 400;
        }
        return monto;
    }

    public  double calcularPrecioBase() {
        double monto=0;
        if(getNumeroPersonas()<=20){
          monto = 300;
        }else {
            monto = 300 + 19*(getNumeroPersonas() -20);
        }
        return monto;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public boolean isServicioPayaso() {
        return servicioPayaso;
    }

    public void setServicioPayaso(boolean servicioPayaso) {
        this.servicioPayaso = servicioPayaso;
    }

    @Override
    public String toString() {
        return "EventoInfantil{" +
                "tematica='" + tematica + '\'' +
                ", servicioPayaso=" + servicioPayaso +
                "} " + super.toString();
    }
}
