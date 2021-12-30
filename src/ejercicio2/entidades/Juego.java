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
package ejercicio2.entidades;

import java.util.ArrayList;


public class Juego {
    
    private ArrayList <Jugador> conjJugadores;
    private Revolver rev;

    public Juego(ArrayList<Jugador> conjJugadores, Revolver rev) {
        this.conjJugadores = new ArrayList();// conjJugadores;
        this.rev = rev;
    }

    public Juego() {
        conjJugadores = new ArrayList();
    }

    public ArrayList<Jugador> getConjJugadores() {
        return conjJugadores;
    }

    public void setConjJugadores(ArrayList<Jugador> conjJugadores) {
        this.conjJugadores = conjJugadores;
    }

    public Revolver getRev() {
        return rev;
    }

    public void setRev(Revolver rev) {
        this.rev = rev;
    }

    @Override
    public String toString() {
        return "Juego{" + "conjJugadores=" + conjJugadores + ", rev=" + rev + '}';
    }
    
    
}
