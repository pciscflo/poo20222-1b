package com.upc.fiesta;

public abstract class Evento {
    //propiedades
    private int numeroPersonas;
    private boolean catering;
    //constructor


    public Evento() {
    }

    public void validarNumeroPersonas() throws Exception{
        if (numeroPersonas<=0){
            throw new Exception("La EDAD No puede ser negativa");//customizada
        }
    }

    public Evento(int numeroPersonas, boolean catering) {
        this.numeroPersonas = numeroPersonas;
        this.catering = catering;
    }


    public double calcularServicioPorCatering(){
        double monto = 0;
        if(catering){
            monto = 20*numeroPersonas;
        }
        return monto;
    }

    //métodos
    public abstract double calcularPrecioBase();
    public abstract double calcularRecargo();

   public double calcularPrecioFinal() {
        return calcularPrecioBase()  + calcularServicioPorCatering() + calcularRecargo();
   }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public boolean isCatering() {
        return catering;
    }

    public void setCatering(boolean catering) {
        this.catering = catering;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "numeroPersonas=" + numeroPersonas +
                ", catering=" + catering +
                '}';
    }
}
