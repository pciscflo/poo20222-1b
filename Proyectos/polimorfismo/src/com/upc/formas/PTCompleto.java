package com.upc.formas;

public class PTCompleto extends Profesor{
    private double sueldoBasico;
    private double porcentajeAFP;

    public PTCompleto(int codigo, String nombre, String dni, String gradoAcademico, int edad, double sueldoBasico, double porcentajeAFP) {
        super(codigo, nombre, dni, gradoAcademico, edad);//llama al constructor del padre e inicializa su props.
        this.sueldoBasico = sueldoBasico;
        this.porcentajeAFP = porcentajeAFP;
    }

    @Override
    public double calcularSueldo() {
        return (sueldoBasico - porcentajeAFP*sueldoBasico);
    }

    @Override
    public String obtenerTipo() {
        return "COMPLETO";
    }

    public void aumento(){
        if(sueldoBasico<=800){
            sueldoBasico+=100;
        }
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double getPorcentajeAFP() {
        return porcentajeAFP;
    }

    public void setPorcentajeAFP(double porcentajeAFP) {
        this.porcentajeAFP = porcentajeAFP;
    }

    @Override
    public String toString() {
        return "PTCompleto{" +
                "sueldoBasico=" + sueldoBasico +
                ", porcentajeAFP=" + porcentajeAFP +
                "} " + super.toString();
    }
}
