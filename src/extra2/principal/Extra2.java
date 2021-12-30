/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2.principal;

import extra2.entidades.Cine;
import extra2.entidades.Espectador;
import extra2.entidades.Pelicula;
import extra2.servicios.CineServicio;
import extra2.servicios.EspectadorServicio;
import extra2.servicios.PeliculaServicio;
import java.util.Scanner;

public class Extra2 {

    public static void main(String[] args) {
      
       Scanner leer = new Scanner (System.in);
        
       CineServicio cineServ = new CineServicio();
       PeliculaServicio peliServ = new PeliculaServicio();
       EspectadorServicio especServ = new EspectadorServicio();
       
       Cine cine = cineServ.llenarCine();
       
       System.out.println(cine);
                
        for (int i = 0; i < 8; i++) {
            
            for (int j = 0; j < 6; j++) {
                System.out.print(cine.getSala()[i][j]);
            }
            System.out.println(" ");
            
        }
        System.out.println("=============");
        System.out.println(" CINE TOTAL");
        System.out.println(" BIENVENIDOS");
        System.out.println("=============");
        int opcion=0;
        Pelicula pelicula = new Pelicula();
        
        do {
            
        
        System.out.println("================================");
        System.out.println("1 - Ingresar espectador");
        System.out.println("2 - Ingresar Pelicula");
        System.out.println("3 - Acomodar espectador en sala");
        System.out.println("4 - Mostrar sala");
        System.out.println("5 - salir");
        System.out.println("================================");
        opcion= leer.nextInt();
        
        switch(opcion){
            case 1:  int cant;
                    System.out.println("Ingrese espectadores a crear");
                    cant=leer.nextInt();
                    for (int i = 0; i < cant; i++) {
                    Espectador espect = especServ.crearEspectador(i);
                    cineServ.agregarEspectador(espect, cine);
                    }
                     
                     break;
            case 2:  pelicula = peliServ.crearPelicula();
                     cineServ.agregarPelicula(pelicula, cine);
                     break;
            case 3:  cineServ.lugaraleatorio(cine,pelicula);
                     break;
            case 4:  cineServ.mostrarSala(cine);
                     break;
            
        }
             

        }while(opcion!=5);
//        cineServ.lugaraleatorio(cine);
//        
//        
//        for (int i = 0; i < 8; i++) {
//            
//            for (int j = 0; j < 6; j++) {
//                System.out.print(cine.getSala()[i][j]);
//            }
//            System.out.println(" ");
//            
//        }
   }
    
}
