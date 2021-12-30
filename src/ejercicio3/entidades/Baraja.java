/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número
entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta
clase debe contener un método toString() que retorne el número de carta y el palo. La
baraja estará compuesta por un conjunto de cartas, 40 exactamente.
 */
package ejercicio3.entidades;

import java.util.ArrayList;

public class Baraja {
    
    private ArrayList <Carta> barajaCartas;
    private ArrayList <Carta> cartasDadas;

    public Baraja() {
        
        barajaCartas = new ArrayList();
        cartasDadas = new ArrayList();
    }

    public ArrayList<Carta> getBarajaCartas() {
        return barajaCartas;
    }

    public void setBarajaCartas(ArrayList<Carta> barajaCartas) {
        this.barajaCartas = barajaCartas;
    }

    public ArrayList<Carta> getCartasDadas() {
        return cartasDadas;
    }

    public void setCartasDadas(ArrayList<Carta> cartasDadas) {
        this.cartasDadas = cartasDadas;
    }

    @Override
    public String toString() {
        return "Baraja{" + "barajaCartas=" + barajaCartas + ", cartasDadas=" + cartasDadas + '}';
    }

   
    
}
