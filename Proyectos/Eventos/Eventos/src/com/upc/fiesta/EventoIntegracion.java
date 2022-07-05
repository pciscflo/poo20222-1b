package com.upc.fiesta;

public class EventoIntegracion extends Evento{
    private String nombreEmpresa;

    public EventoIntegracion() {
    }

    public EventoIntegracion(int numeroPersonas, boolean catering, String nombreEmpresa) {
        super(numeroPersonas, catering);
        this.nombreEmpresa = nombreEmpresa;
    }

    public double calcularRecargo(){
        return 0;
    }

    @Override
    public double calcularPrecioBase() {
        double monto=0;
        if(getNumeroPersonas()<=20){
            monto = 590;
        }else {
            monto = 590 + 35*(getNumeroPersonas() -20);
        }
        return monto;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    @Override
    public String toString() {
        return "EventoIntegracion{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                "} " + super.toString();
    }
}
