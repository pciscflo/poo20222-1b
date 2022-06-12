package com.upc.formas;

public abstract class Profesor {
    private int codigo;
    private String nombre;
    private String dni;
    private String gradoAcademico;
    private int edad;

    public Profesor() {
    }

    public Profesor(int codigo, String nombre, String dni, String gradoAcademico, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.dni = dni;
        this.gradoAcademico = gradoAcademico;
        this.edad = edad;
    }
    public abstract String obtenerTipo();

    public abstract void aumento();

    public abstract double calcularSueldo();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", gradoAcademico='" + gradoAcademico + '\'' +
                ", edad=" + edad +
                '}';
    }
}
