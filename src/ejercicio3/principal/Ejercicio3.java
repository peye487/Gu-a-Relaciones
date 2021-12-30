
package ejercicio3.principal;

import ejercicio3.entidades.Baraja;
import ejercicio3.entidades.Carta;
import ejercicio3.servicios.BarajaServicio;
import ejercicio3.servicios.CartaServicio;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        CartaServicio cartaServ = new CartaServicio();
               
        BarajaServicio barServ = new BarajaServicio ();
        Baraja baraja = barServ.crearBaraja();
   
        int i=0;
        int opcion;
        do{
        
            System.out.println("Elija una opción");
            System.out.println("1 - Barajar");
            System.out.println("2 - Mostrar una carta");
            System.out.println("3 - Cartas disponibles en la baraja");
            System.out.println("4 - Mostrar cartas que han salido");     //VER PARA GUARDAR EN ARRAYLIST PARA MOSTRAR VISTAS POR QUE SI BARAJO NUEVAMENTE 
            System.out.println("5 - Mostros baraja");                    //ME CAMBIA LAS CARTAS VISTAS A LAS NUEVAS UBICADAS EN LOS LUGARES DE "i"
            System.out.println("6 - Dar cartas");
            System.out.println("7 - Salir");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1: barServ.barajar(baraja);
                        break;
                case 2: barServ.siguienteCarta(baraja);
                        i++;
                        break;
                case 3: System.out.println(barServ.cartasDisponibles(baraja));
                        break;
                case 4: barServ.mostrarCartasVistas(baraja);
                        break;
                case 5: barServ.mostrarBaraja(baraja);
                        break;
                case 6: System.out.println("Cuantas cartas desea repartir");
                        int cartas = leer.nextInt();
                        barServ.darCartas(baraja, cartas);
                        i=i+cartas;
                        break;
                        
            }
        }while(opcion!=7);
    
}
}
