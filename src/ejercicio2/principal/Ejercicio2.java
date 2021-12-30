/*

 */
package ejercicio2.principal;

import ejercicio2.entidades.Juego;
import ejercicio2.entidades.Jugador;
import ejercicio2.entidades.Revolver;
import ejercicio2.servicios.JuegoServicio;
import ejercicio2.servicios.JugadorServicio;
import ejercicio2.servicios.RevolverServicio;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("========================");
        System.out.println("= BIENVENIDOS AL JUEGO =");
        System.out.println("========================");
        System.out.println("VAMOS A INICIAR");
        System.out.println("Presione ENTER para comenzar");
        leer.nextLine();

        RevolverServicio revServ = new RevolverServicio();
        Revolver revolver = revServ.llenarRevolver();
        System.out.println("========================");
        System.out.println("El revolver esta cargado");
        System.out.println("========================");

        System.out.println("Ingrese cantidad de jugadores (MÁX 6)");
        int cantJug = leer.nextInt();

        JugadorServicio jugServ = new JugadorServicio();
        JuegoServicio juegoServ = new JuegoServicio();

        Jugador jugador = new Jugador();
                                                        //      CREO MI REGISTRO DE JUGADORES
        ArrayList<Jugador> registroAux = new ArrayList();     
        
        for (int i = 0; i < cantJug; i++) {         

            if(cantJug>6){
                cantJug=6;
            }
            jugador = jugServ.crearJugador(i);
            registroAux.add(jugador);
           
            // CARGA DE JUGADORES
        }

        Juego juego = juegoServ.llenarJuego(registroAux, revolver);

        System.out.println(juego.getRev());
        for (Jugador aux : juego.getConjJugadores()) {              // IMPRIME OBJETO JUEGO PARA CHEQUEO
            System.out.println(aux);
        }

        int i = 1;
        int cont = 0;

        System.out.println("***********************");
        System.out.println("***********************");
        System.out.println("** COMIENZA EL JUEGO **");
        System.out.println("***********************");
        System.out.println("***********************");
        leer.nextLine();
        do {

            System.out.println("Presione ENTER para ejecutar el disparo");   // POR QUE NO ME TOMA EL "leer" EN LA PRIMER ENTRADA?
            leer.nextLine();

            juegoServ.ronda(juego, i);
            if (revServ.mojar(juego.getRev()) == true) {
                cont = 1;
            } else {
                revServ.siguienteChorro(juego.getRev());
                juego.setRev(revolver);
            }

            if (i == cantJug) {
                i = 0;
            }
            i++;

        } while (revServ.mojar(juego.getRev()) != true || cont != 1);
    }
}
