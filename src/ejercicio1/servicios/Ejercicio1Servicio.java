/*
1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package ejercicio1.servicios;

import ejercicio1.entidades.Perro;
import ejercicio1.entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1Servicio {
    
    private Scanner leer;
    private ArrayList<Persona> registroPers;
    private ArrayList<Perro> registroPerro;

    public Ejercicio1Servicio() {
        
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.registroPerro = new ArrayList();
        this.registroPers = new ArrayList();
    }
    
    public Perro crearPerro(String nombreP,String raza,Integer edadP,String tamanio){
        
        Perro perro = new Perro();
        
        perro.setNombre(nombreP);
        perro.setRaza(raza);
        perro.setEdad(edadP);
        perro.setTamanio(tamanio);
        
        return perro;
          
    }
    
    public Persona crearPersona(String nombre, String apellido,Integer edad,Integer dni, Perro perro){
    
        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setEdad(edad);
        persona.setDocumento(dni);
        persona.getPerro().add(perro);
    
        return persona;
    } 
    
    public void agregarPerro(Perro perro){
    
        registroPerro.add(perro);
    
    }
    
    public void agregarPersona(Persona persona){
        
        registroPers.add(persona);
    
    }
    
    public void asignarPerro (){
    
    
    }
}
