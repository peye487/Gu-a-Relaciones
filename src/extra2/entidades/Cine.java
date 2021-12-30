/*
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de
asientos (8 filas por 6 columnas). De Cine nos interesa conocer la película que se está
reproduciendo, la sala con los espectadores y el precio de la entrada. L
 */
package extra2.entidades;

import java.util.ArrayList;

public class Cine {
    
    private String pelicula;
    private Double precio;
    private String sala[][];
    private ArrayList<Espectador> espectadores;
    private ArrayList<Pelicula> peliculas;

    public Cine() {
        this.sala = new String [8][6];
        this.espectadores = new ArrayList();
        this.peliculas =  new ArrayList();
        
    }

    public Cine(String pelicula, Double precio, String[][] sala, ArrayList<Espectador> espectadores, ArrayList<Pelicula> peliculas) {
        this.pelicula = pelicula;
        this.precio = precio;
        this.sala = new String [8][6];
        this.espectadores = new ArrayList();
        this.peliculas =  new ArrayList();
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String[][] getSala() {
        return sala;
    }

    public void setSala(String[][] sala) {
        this.sala = sala;
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", precio=" + precio + ", sala=" + sala + ", espectadores=" + espectadores + ", peliculas=" + peliculas + '}';
    }

    
    
}
