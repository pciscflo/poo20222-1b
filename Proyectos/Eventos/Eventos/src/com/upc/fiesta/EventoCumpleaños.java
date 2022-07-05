package com.upc.fiesta;

public class EventoCumpleaños extends Evento{
    private boolean indicadorTorta;
    private boolean servicioBebidas;

    public EventoCumpleaños() {
    }
    public double calcularRecargo()
    {
        double monto = 0;
        if(indicadorTorta){
            monto+= 150;
        }
        if(servicioBebidas){
            monto+=(10*getNumeroPersonas());
        }
        return monto;
    }
    public  double calcularPrecioBase(){
        double monto=0;
        if(getNumeroPersonas()<=20){
            monto = 480;
        }else {
            monto = 480 + 23*(getNumeroPersonas() -20);
        }
        return monto;
    }

    public EventoCumpleaños(int numeroPersonas, boolean catering, boolean indicadorTorta, boolean servicioBebidas) {
        super(numeroPersonas, catering);
        this.indicadorTorta = indicadorTorta;
        this.servicioBebidas = servicioBebidas;
    }

    public boolean isIndicadorTorta() {
        return indicadorTorta;
    }

    public void setIndicadorTorta(boolean indicadorTorta) {
        this.indicadorTorta = indicadorTorta;
    }

    public boolean isServicioBebidas() {
        return servicioBebidas;
    }

    public void setServicioBebidas(boolean servicioBebidas) {
        this.servicioBebidas = servicioBebidas;
    }

    @Override
    public String toString() {
        return "EventoCumpleaños{" +
                "indicadorTorta=" + indicadorTorta +
                ", servicioBebidas=" + servicioBebidas +
                "} " + super.toString();
    }
}
