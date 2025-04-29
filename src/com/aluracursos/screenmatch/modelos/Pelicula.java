public class Pelicula {
    String nombre; //atributo

    int fechaDeLanzamiento; //atributo

    int duracionEnMinutos; //atributo

    boolean incluidoEnElPlan; //atributo
    private double sumaDeLasEvaluaciones; //atributo privado para evitar modificaciones
    private int totalDeLasEvaluaciones; //atributo

    int getTotalDeLasEvaluaciones(){//metodo
        return totalDeLasEvaluaciones;

    }

    void muestraFichaTecnica(){ //metodo
        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("Su fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + duracionEnMinutos);
    }

    void evalua(double nota){ //metodo
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;

    }
    double calculaMedia(){ //metodo
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }

}
