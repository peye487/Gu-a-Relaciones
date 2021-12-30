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

public class Ej1 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
       Persona[] persona = new Persona[2];
       //Persona persona = new Persona();
       
       Ejercicio1Servicio Serv = new Ejercicio1Servicio();
//            System.out.println("Ingrese nombre de la persona ");
//            String nombre =leer.next();
//            System.out.println("Ingrese Apellido de la persona" );
//            String apellido = leer.next();
//            System.out.println("Ingrese Edad de la persona" );
//            Integer edad = leer.nextInt();
//            System.out.println("DNI de persona");
//            Integer dni = leer.nextInt();
       
        for (int i = 0; i < persona.length; i++) {
            
            System.out.println("Ingrese nombre de la persona ");
            String nombre =leer.next();
            System.out.println("Ingrese Apellido de la persona" );
            String apellido = leer.next();
            System.out.println("Ingrese Edad de la persona" );
            Integer edad = leer.nextInt();
            System.out.println("DNI de persona");
            Integer dni = leer.nextInt();
            //persona[i] = Serv.crearPersona(nombre, apellido,edad, dni);
            

        }
//       Perro[] perro = new Perro[2];
       
//       for (int i = 0; i < perro.length; i++) {
//            System.out.println("Ingrese nombre del perro " + i);
//            persona[i].setNombre(leer.next());
//            System.out.println("Ingrese la raza del perro " + i);
//            persona[i].setApellido(leer.next());
//            System.out.println("Ingrese Edad del perro " + i);
//            persona[i].setEdad(leer.nextInt());
//            System.out.println("Ingrese el tamaño del perro "+i);
//            persona[i].setDocumento(leer.nextInt());
//        }
       
        Perro perro1 = new Perro("Morena", "Caniche", 6,"Pequeño");
        Perro perro2 = new Perro("Manchita", "Callejera", 9,"Grande");
        
//        persona[0].setPerro(perro1);
//        persona[1].setPerro(perro2);
        
        
        //System.out.println(persona);
        System.out.println(perro1);
        System.out.println(perro2);
        
        for (Persona aux : persona) {
            System.out.println(aux);
        }
        
//       persona[1].setPerro(perro1);
//       persona[2].setPerro(perro2);
//       
//        System.out.println(persona[1]);
//        System.out.println(persona[2]);
    
    }
    
}
