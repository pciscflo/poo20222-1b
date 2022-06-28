package com.upc.herencia;

public class Concursante {
    private String dni;
    private String nombre;
    private String nombrePlato;
    private int puntajeSabor;
    private int puntajePresentacion;
    private int puntajeOriginalidad;

    public Concursante() {
    }

    public Concursante(String dni, String nombre, String nombrePlato, int puntajeSabor, int puntajePresentacion, int puntajeOriginalidad) {
        this.dni = dni;
        this.nombre = nombre;
        this.nombrePlato = nombrePlato;
        this.puntajeSabor = puntajeSabor;
        this.puntajePresentacion = puntajePresentacion;
        this.puntajeOriginalidad = puntajeOriginalidad;
    }
    public double calcularPuntajeFinal(){
        double puntaje;
        puntaje = puntajeSabor*0.7 + puntajePresentacion*0.2 + puntajeOriginalidad*0.1;
        return puntaje;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public int getPuntajeSabor() {
        return puntajeSabor;
    }

    public void setPuntajeSabor(int puntajeSabor) {
        this.puntajeSabor = puntajeSabor;
    }

    public int getPuntajePresentacion() {
        return puntajePresentacion;
    }

    public void setPuntajePresentacion(int puntajePresentacion) {
        this.puntajePresentacion = puntajePresentacion;
    }

    public int getPuntajeOriginalidad() {
        return puntajeOriginalidad;
    }

    public void setPuntajeOriginalidad(int puntajeOriginalidad) {
        this.puntajeOriginalidad = puntajeOriginalidad;
    }

    @Override
    public String toString() {
        return "Concursante{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", nombrePlato='" + nombrePlato + '\'' +
                ", puntajeSabor=" + puntajeSabor +
                ", puntajePresentacion=" + puntajePresentacion +
                ", puntajeOriginalidad=" + puntajeOriginalidad +
                '}';
    }
}
