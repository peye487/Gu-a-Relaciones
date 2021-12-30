/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.servicios;

import ejercicio3.entidades.Baraja;
import ejercicio3.entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;

public class BarajaServicio {

    private CartaServicio cartaServ;                                                                                                                         // CUANDO QUIERO USAR UNA CLASE DENTRO DE OTRA LO INICIALIZO COMO UN ATRIBUTO.

    public BarajaServicio() {
        
        cartaServ = new CartaServicio();
    }
    
    
    public Baraja crearBaraja() {

        Baraja baraja = new Baraja();
        for (int i = 1; i < 13; i++) {

            if (i < 8 || i > 9) {

                for (int j = 1; j < 5; j++) {
                    
                    Carta carta = cartaServ.crearCarta(i,j);
                    baraja.getBarajaCartas().add(carta);
                }
            }
        }

        return baraja;
    }

    public void barajar(Baraja baraja) {
        ArrayList<Carta> cartas = baraja.getBarajaCartas();
        Collections.shuffle(cartas);
        baraja.setBarajaCartas(cartas);
    }

    public void siguienteCarta(Baraja baraja) {

        System.out.println("======================");
        System.out.println("Carta: " + baraja.getBarajaCartas().get(0).getNumero() + " " + baraja.getBarajaCartas().get(0).getPalo());
        System.out.println("======================");
        
        baraja.getCartasDadas().add(baraja.getBarajaCartas().get(0));
        
        if (baraja.getBarajaCartas().isEmpty()) {

            System.out.println("NO QUEDAN CARTAS EN LA BARAJA");
        }
    }

    public int cartasDisponibles(Baraja baraja) {

        return (baraja.getBarajaCartas().size());

    }

    public void mostrarCartasVistas(Baraja baraja) { //ACÁ AL HACER UN NUEVO ARRAYLIST EN BARAJA DONDE VOY GUARDANDO LAS QUE SALEN 
                                                            //MUESTRO ESE ArrayList CON UN "for each" Y NO USO MI VARIABLE "i". ES MEJOR POR QUE
        for (Carta aux : baraja.getCartasDadas()) {         //NO TENGO QUE USAR VARIABLES.
            
        
                   
            System.out.println("======================");
            System.out.println("Carta: " + aux.getNumero() + " " + aux.getPalo());
            System.out.println("======================");

        }
    }

    public void mostrarBaraja(Baraja baraja) {

        System.out.println(baraja);

    }

    public void darCartas(Baraja baraja, int cartas) {

        for (int j = 0; j < cartas; j++) {
           
            baraja.getCartasDadas().add(baraja.getBarajaCartas().get(j));
            baraja.getBarajaCartas().remove(baraja.getBarajaCartas().get(j));     //AQUÍ HACER "remove" PARA SACAR LAS CARTAS QUE VOY DANDO DE LA BARAJA.
               
        }
            for (Carta aux : baraja.getCartasDadas()) {
            System.out.println("======================");
            System.out.println("Carta: " + aux.getNumero() +" " + aux.getPalo());
            System.out.println("======================");
        }
        
    }
}
