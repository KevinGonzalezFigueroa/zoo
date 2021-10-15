package com.practica2.zoo;

public class Mamifero extends Animal {
    //Variables
    private Double peso;
    private String habitos;
    private Double velocidad;
    private String dieta;

    //Fin Variables

    //Getters y Setters

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getHabitos() {
        return habitos;
    }

    public void setHabitos(String habitos) {
        this.habitos = habitos;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    //Fin Getters y Setters

    //Constructores
    public Mamifero(String nombre, String edad, String genero, Double peso, String habitos, Double velocidad, String dieta) {
        super(nombre, edad, genero);
        this.peso = peso;
        this.habitos = habitos;
        this.velocidad = velocidad;
        this.dieta = dieta;
    }
    //Final constructores
}

