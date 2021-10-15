package com.practica2.zoo;

public class ManageZoo {
    private int numeroJaulas;
    private int numeroAnimales;
    String nombreAnimal;
    int numeroElegirAnimal;
    int numeroElegirNombre;
    int numeroElegirSexo;
    int numeroElegirEdad;
    String sexo;



    public int getNumeroJaulas() {
        return numeroJaulas;
    }

    public void setNumeroJaulas(int numeroJaulas) {
        this.numeroJaulas = numeroJaulas;
    }

    public int getNumeroAnimales() {
        return numeroAnimales;
    }

    public void setNumeroAnimales(int numeroAnimales) {
        this.numeroAnimales = numeroAnimales;
    }

    public ManageZoo(int numeroJaulas, int numeroAnimales) {
        this.numeroJaulas = numeroJaulas;
        this.numeroAnimales = numeroAnimales;
    }

    public void generarAnimales(){

        for (int i = 0; i < numeroAnimales; i++) {
            numeroElegirAnimal = (int) Math.round(Math.random() * 8 + 1);
            switch(numeroElegirAnimal){
                case 1:
                    generarErizo();
                    break;
                case 2:
                    generarGallina();
                    break;
                case 3:
                    generarLagarto();
                    break;
                case 4:
                    generarLisa();
                    break;
                case 5:
                    generarLoro();
                    break;
                case 6:
                    generarMurcielago();
                    break;
                case 7:
                    generarMusaraña();
                    break;
                case 8:
                    generarPaloma();
                    break;
                case 9:
                    generarSerpiente();
                    break;
            }
        }
        //Fin Funcionalidad
    }
}
