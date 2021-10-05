package com.practica2.zoo;

public class Ave extends Animal {
    //Variables
    private Double altitudVuelo;
    private String colorPlumaje;
    private String tipoPata;
    //Fin variables

    //Getters y Setters

    public Double getAltitudVuelo() {
        return altitudVuelo;
    }

    public void setAltitudVuelo(Double altitudVuelo) {
        this.altitudVuelo = altitudVuelo;
    }

    public String getColorPlumaje() {
        return colorPlumaje;
    }

    public void setColorPlumaje(String colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
    }

    public String getTipoPata() {
        return tipoPata;
    }

    public void setTipoPata(String tipoPata) {
        this.tipoPata = tipoPata;
    }

    //Fin Getters y Setters

    //Constructores
    public Ave(String nombre, String edad, String genero, Double altitudVuelo, String colorPlumaje, String tipoPata) {
        super(nombre, edad, genero);
        this.altitudVuelo = altitudVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoPata = tipoPata;
    }
    //Final constructores
}
