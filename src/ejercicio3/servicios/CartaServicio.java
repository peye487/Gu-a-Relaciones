/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.servicios;

import ejercicio3.entidades.Carta;

public class CartaServicio {

    public Carta crearCarta(int i, int j) {


        Carta carta = new Carta();

        switch (j) {
            case 1:
                carta.setNumero(i);
                carta.setPalo("Copa");
                break;
            case 2:
                carta.setNumero(i);
                carta.setPalo("Espada");
                break;
            case 3:
                carta.setNumero(i);
                carta.setPalo("Oro");
                break;
            case 4:
                carta.setNumero(i);
                carta.setPalo("Basto");
                break;

        }

        return carta;
    }
}
