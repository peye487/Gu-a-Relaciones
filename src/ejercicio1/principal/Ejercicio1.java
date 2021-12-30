/*

1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.

 */
package ejercicio1.principal;

import ejercicio1.entidades.Perro;
import ejercicio1.entidades.Persona;
import ejercicio1.servicios.Ejercicio1Servicio;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("=====================");
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("=====================");
        int opcion;
        Ejercicio1Servicio ejServ = new Ejercicio1Servicio();
//        do{
//        
//            System.out.println("1 - Agregar persona");
//            System.out.println("2 - Agregar perro");
//            System.out.println("3 - Asignar perro a persona");
//            System.out.println("4 - Salir");
//            opcion=leer.nextInt();
//            
//            switch(opcion){
//            
//                case 1: 
//                    System.out.println("Ingrese nombre de la persona");
//                    String nombre=leer.next();
//                    System.out.println("Ingrese apellido de la persona");
//                    String apellido=leer.next();
//                    System.out.println("Ingrese edad de la persona");
//                    int edad=leer.nextInt();
//                    System.out.println("Ingrese DNI");
//                    int dni = leer.nextInt();
//                    Persona persona = ejServ.crearPersona(nombre, apellido, edad, dni);
//                    ejServ.agregarPersona(persona);
                    
//                    break;
//            case 2:
                System.out.println("Ingrese nombre del perro");
                    String nombreP=leer.next();
                    System.out.println("Ingrese raza del perro");
                    String raza=leer.next();
                    System.out.println("Ingrese edad del perro");
                    int edadP=leer.nextInt();
                    System.out.println("Ingrese tamaño de perro");
                    String tamanio = leer.next();
                    
                    Perro perro =ejServ.crearPerro(nombreP,raza,edadP, tamanio);
                    ejServ.agregarPerro(perro);
//                    
//                    break;
//                    
//                case 3: 
//                    break;
//            }
//                       
//        }while(opcion!=4);
       
        System.out.println("Ingrese nombre de la persona");
                    String nombre=leer.next();
                    System.out.println("Ingrese apellido de la persona");
                    String apellido=leer.next();
                    System.out.println("Ingrese edad de la persona");
                    int edad=leer.nextInt();
                    System.out.println("Ingrese DNI");
                    int dni = leer.nextInt();
                    Persona persona = ejServ.crearPersona(nombre, apellido, edad, dni, perro);
                    ejServ.agregarPersona(persona);
        
        System.out.println(persona);
    }
    
}
