package com.upc.formas;

public class PTParcial extends Profesor{
    private int horas;
    private double tarifaHora;

    public PTParcial(int codigo, String nombre, String dni, String gradoAcademico, int edad, int horas, double tarifaHora) {
        super(codigo, nombre, dni, gradoAcademico, edad);
        this.horas = horas;
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double calcularSueldo() {
        return tarifaHora*horas;
    }

    @Override
    public String obtenerTipo() {
        return "PARCIAL";
    }

    public void aumento(){
        if(horas>40){
            tarifaHora = 1.10*tarifaHora;
        }
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    @Override
    public String toString() {
        return "PTParcial{" +
                "horas=" + horas +
                ", tarifaHora=" + tarifaHora +
                "} " + super.toString();
    }
}
