
package extra1.servicios;

import extra1.entidades.PersonaE;
import java.util.Scanner;

public class PersonaEServicio {
   
    private Scanner leer;

    public PersonaEServicio() {
        leer=new Scanner(System.in).useDelimiter("\n");
    }
    
    public PersonaE crearPersona(){
    
        PersonaE persona = new PersonaE();
        System.out.println("===================");
        System.out.println("REGISTRO DE PERSONA");
        System.out.println("===================");
        System.out.println("Ingrese nombre:");
        persona.setNombre(leer.next());
        System.out.println("Ingrese Apellido:");
        persona.setApellido(leer.next());
        System.out.println("Ingrese la edad:");
        persona.setEdad(leer.nextInt());
        System.out.println("Ingrese número de DNI");
        persona.setDocumento(leer.nextInt());
        
        return persona;
    
    }
}
