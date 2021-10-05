package com.practica2.zoo;

public class Reptil extends Animal{
    //Variables
    private Double temperaturaCorporal;
    private String colorEscama;
    private Double velocidadDesplazamiento;
    //Fin variables

    //Getters y Setters

    public Double getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public void setTemperaturaCorporal(Double temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public String getColorEscama() {
        return colorEscama;
    }

    public void setColorEscama(String colorEscama) {
        this.colorEscama = colorEscama;
    }

    public Double getVelocidadDesplazamiento() {
        return velocidadDesplazamiento;
    }

    public void setVelocidadDesplazamiento(Double velocidadDesplazamiento) {
        this.velocidadDesplazamiento = velocidadDesplazamiento;
    }

    //Fin Getters y Setters

    //Constructores
    public Reptil(String nombre, String edad, String genero, Double temperaturaCorporal, String colorEscama, Double velocidadDesplazamiento) {
        super(nombre, edad, genero);
        this.temperaturaCorporal = temperaturaCorporal;
        this.colorEscama = colorEscama;
        this.velocidadDesplazamiento = velocidadDesplazamiento;
    }
    //Final constructores
}
