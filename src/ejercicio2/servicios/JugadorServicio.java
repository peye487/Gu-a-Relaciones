/*
 Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado
(indica si está mojado o no el jugador). El número de jugadores será decidido por el
usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
    • disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
 */
package ejercicio2.servicios;

import ejercicio2.entidades.Jugador;
import ejercicio2.entidades.Revolver;
import java.util.Scanner;

public class JugadorServicio {

    private Scanner leer;

    public JugadorServicio() {
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Jugador crearJugador(int i) {

        Jugador jugador = new Jugador();

        jugador.setId(i + 1);
        jugador.setNombre("Jugador " + (i + 1));
        jugador.setMojado(false);

        return jugador;
    }

    public boolean disparo(Revolver r, int i) {

        RevolverServicio revServ = new RevolverServicio();
        Jugador jugador = new Jugador();

        if (revServ.mojar(r) == true) {

            System.out.println("Disparo: " + revServ.mojar(r));
            System.out.println("Jugador " + i + " MOJADO");
            System.out.println("---------------------------");
            System.out.println("JUEGO TERMINADO");
            System.out.println("---------------------------");
            jugador.setMojado(false);
            return true;

        } else {
            System.out.println("Disparo: " + revServ.mojar(r));
            System.out.println("EL JUEGO CONTINUA");
            System.out.println("---------------------------");
//            revServ.siguienteChorro(r);
            return false;
        }
    }
}
