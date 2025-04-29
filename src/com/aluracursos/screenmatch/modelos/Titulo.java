package com.aluracursos.screenmatch.modelos;

public class Titulo {
    private String nombre; //atributo

    private int fechaDeLanzamiento; //atributo

    private int duracionEnMinutos; //atributo

    private boolean incluidoEnElPlan; //atributo
    private double sumaDeLasEvaluaciones; //atributo privado para evitar modificaciones
    private int totalDeLasEvaluaciones; //atributo

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setNombre(String nombre) { //metodo
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public int getTotalDeLasEvaluaciones(){//metodo
        return totalDeLasEvaluaciones;

    }

    public void muestraFichaTecnica(){ //metodo
        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("Su fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + getDuracionEnMinutos());
    }

    public void evalua(double nota){ //metodo
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;

    }
    public double calculaMedia(){ //metodo
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }
}
