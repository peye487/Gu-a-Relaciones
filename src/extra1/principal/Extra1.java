
package extra1.principal;

import extra1.entidades.PerroE;
import extra1.entidades.PersonaE;
import extra1.servicios.PerroEServicio;
import extra1.servicios.PersonaEServicio;
import java.util.ArrayList;
import java.util.Scanner;

public class Extra1 {

    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        ArrayList<PersonaE> registroPer = new ArrayList();
        ArrayList<PerroE> registroPerros = new ArrayList();
        
        PersonaEServicio persServ = new PersonaEServicio();
        PerroEServicio perroServ = new PerroEServicio();
        int opcion;
        do{
            System.out.println("=====================");
            System.out.println("BIENVENIDO AL SISTEMA");
            System.out.println("=====================");
            
            System.out.println("Seleccione una opción");
            System.out.println("1 - Registrar Persona");
            System.out.println("2 - Registrar Perro");
            System.out.println("3 - Adopción de perros");
            System.out.println("4 - Salir");
            opcion=leer.nextInt();
        switch(opcion){
        
            case 1: PersonaE persona = persServ.crearPersona();
                    registroPer.add(persona);
                    break;
            case 2: PerroE perro = perroServ.crearPerro();
                    registroPerros.add(perro);
                    break;
            case 3: System.out.println("Ingrese nombre del perro a adoptar");
                    String nombre = leer.next();
                    
                    
                    for (int i = 0; i < registroPerros.size(); i++) {
                    
                        if(registroPerros.get(i).getNombre().equals(nombre)){
                            
                            System.out.println("Ingrese nombre de la persona que adopta");
                            String nombrePers = leer.next();
                            
                            for (int j = 0; j < registroPer.size(); j++) {
                                
                                if(registroPer.get(j).getNombre().equals(nombrePers)){
                                
                                    registroPer.get(j).getPerro().add(registroPerros.get(i));
                                    System.out.println("============================");
                                    System.out.println("PERRO ADOPTADO CORRECTAMENTE");
                                    System.out.println("============================");
                                    
                                }else{
                                
                                    System.out.println("La parsona indicada no está en el registro");
                                }
                            }
                        
                        } else {
                        
                            System.out.println("El nombre del perro no se encuentra en el registro");
                        }
                        
                }
                    
                    
        
        
        
        }
        
        
        }while(opcion!=4);
                
          for (PerroE auxPerro : registroPerros) {
              System.out.println(auxPerro);
        }
          for (PersonaE auxPers : registroPer) {
              System.out.println(auxPers);
        }
    }
    
}
