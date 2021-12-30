/*
de las películas nos interesa saber el título, duración, edad mínima y director. Por último, del

 */
package extra2.servicios;

import extra2.entidades.Pelicula;
import java.util.Scanner;

public class PeliculaServicio {
    
    private Scanner leer;

    public PeliculaServicio() {
        leer = new Scanner(System.in).useDelimiter("\n");
        
    }
    public Pelicula crearPelicula(){
    
        Pelicula pelicula = new Pelicula();
        System.out.println("NUEVA PELICULA");
        System.out.println("Titulo");
        pelicula.setTitulo(leer.next());
        System.out.println("Duración");
        pelicula.setDuracion(leer.nextDouble());
        System.out.println("Apta para mayores de:");
        pelicula.setEdadMin(leer.nextInt());
        System.out.println("Nombre de director");
        pelicula.setDirector(leer.next());
        
        return pelicula;
    
    }
}
