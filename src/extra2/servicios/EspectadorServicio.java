/*
espectador, nos interesa saber su nombre, edad y el dinero que tiene disponible.
 */
package extra2.servicios;

import extra2.entidades.Espectador;
import java.util.Scanner;

public class EspectadorServicio {
    
    private Scanner leer;
    private CineServicio cineServ;
    
    public EspectadorServicio() {
        leer = new Scanner(System.in).useDelimiter("\n");
        cineServ= new CineServicio();
    }
    
    
    public Espectador crearEspectador(int i){
        
        
          Espectador espect = new Espectador();
          
          espect.setNombre("Espectador " + (i+1));
          espect.setDinero(500);
          espect.setEdad(35);
          
          
          
//        System.out.println("NUEVO ESPACTADOR");
//        System.out.println("Ingrese nombre");
//        espect.setNombre(leer.next());
//        System.out.println("Ingrese edad");
//        espect.setEdad(leer.nextInt());
//        System.out.println("Dinero disponible");
//        espect.setDinero(leer.nextDouble());
        
        
        
        return espect;
    }
}
