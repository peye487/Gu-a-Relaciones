/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra1.servicios;

import extra1.entidades.PerroE;
import java.util.Scanner;

public class PerroEServicio {
    
    private Scanner leer;

    public PerroEServicio() {
        
        leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    
    public PerroE crearPerro(){
    
        PerroE perro = new PerroE();
        System.out.println("===================");
        System.out.println(" REGISTRO DE PERRO");
        System.out.println("===================");
        System.out.println("Ingrese nombre:");
        perro.setNombre(leer.next());
        System.out.println("Ingrese la raza:");
        perro.setRaza(leer.next());
        System.out.println("Ingrese la edad:");
        perro.setEdad(leer.nextInt());
        System.out.println("Ingrese tamaño (Chico, Mediano, Grande): ");
        perro.setTamanio(leer.next());
        
        return perro;
    
    }
}
