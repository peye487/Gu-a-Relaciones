/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de
Jugadores) y Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego
 */
package ejercicio2.servicios;

import ejercicio2.entidades.Juego;
import ejercicio2.entidades.Revolver;
import java.util.ArrayList;

public class JuegoServicio {

    public Juego llenarJuego(ArrayList registroAux, Revolver revolver) {

        Juego juego = new Juego();

        juego.setRev(revolver);

        juego.setConjJugadores(registroAux);

        return juego;
    }

    public void ronda(Juego juego, int i) {

        RevolverServicio revServ = new RevolverServicio();
        JugadorServicio jugServ = new JugadorServicio();
        System.out.println("---------------------------");
        System.out.println("Turno de " + juego.getConjJugadores().get(i - 1).getNombre());

        jugServ.disparo(juego.getRev(),i);
        
        
//        if (revServ.mojar(juego.getRev()) == true) {                  // TODO ESTE CODIGO VA EN EL METODO "disparo" EN "jugadorServicio"
//
//            System.out.println("Jugador " + i + " MOJADO");           // SOLO LLAMO AL METODO "disparo" 
//            System.out.println("---------------------------");
//            System.out.println("JUEGO TERMINADO");
//            System.out.println("---------------------------");
//
//        } else {
//
//            System.out.println("Disparo: " + revServ.mojar(juego.getRev()));
//            System.out.println("EL JUEGO CONTINUA");
//            System.out.println("---------------------------");
//        }
    }
}
