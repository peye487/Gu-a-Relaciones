/*
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de
asientos (8 filas por 6 columnas). De Cine nos interesa conocer la película que se está
reproduciendo, la sala con los espectadores y el precio de la entrada. L
 */
package extra2.servicios;

import extra2.entidades.Cine;
import extra2.entidades.Espectador;
import extra2.entidades.Pelicula;
import java.util.Scanner;

public class CineServicio {
   
    private Scanner leer;

    public CineServicio() {
        leer= new Scanner (System.in).useDelimiter("\n");
    }
    
    String [] [] aux = new String [8][6];
    
    public Cine llenarCine(){
        
        Cine cine = new Cine();
        //System.out.println("Nombre pelicula");
        //cine.setPelicula(leer.next());
        System.out.println("Precio entreda");
        cine.setPrecio(leer.nextDouble());
        
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if(j==0){
                aux[i][j]=String.valueOf("   A"+(i+1));
                }
                else if (j==1){
                
                    aux[i][j]=String.valueOf("   B"+(i+1));
                
                } else if (j==2){
                
                    aux[i][j]=String.valueOf("   C"+(i+1));
                }else if (j==3){
                
                    aux[i][j]=String.valueOf("   D"+(i+1));
                }else if (j==4){
                
                    aux[i][j]=String.valueOf("   E"+(i+1));
                }else if (j==5){
                
                    aux[i][j]=String.valueOf("   F"+(i+1));
                }else if (j==6){
                
                    aux[i][j]=String.valueOf("   G"+(i+1));
                }else if (j==7){ 
                
                    aux[i][j]=String.valueOf("   H"+(i+1));
                }else if (j==8){
                
                    aux[i][j]=String.valueOf("   I"+(i+1));
                }
                
            }
            
        }
      
    
    cine.setSala(aux);
    
    
    return cine;
    }
    
    public void agregarEspectador(Espectador espectador, Cine cine){
    
    cine.getEspectadores().add(espectador);
    
    }
    public void agregarPelicula (Pelicula pelicula, Cine cine){
    
    cine.getPeliculas().add(pelicula);
    }
    
    
    public void lugaraleatorio (Cine cine, Pelicula pelicula){
//        System.out.println("=====================");
//        System.out.println("LISTA DE ESPECTADORES");
//        System.out.println("=====================");
//        
//        for (Espectador aux : cine.getEspectadores()) {
//            
//            System.out.println("...............");
//            System.out.println(aux.getNombre());
//            System.out.println("...............");
//            
//        }
//        System.out.println("Ingrese nombre del espectador");
//        String nombre = leer.next();
        for (int i = 0; i < cine.getEspectadores().size(); i++) {
                    
        //    if(cine.getEspectadores().get(i).getNombre().equals(nombre)){
                 
                if(cine.getPrecio()<=cine.getEspectadores().get(i).getDinero()){
                
                    if(pelicula.getEdadMin()<= cine.getEspectadores().get(i).getEdad()){
                    int aux;
                        do{
                            aux=0;
                     int f = (int)(Math.random()*8);
                     int c = (int)(Math.random()*6);
                     
                     
                     
                        if(cine.getSala()[f][c].length()==6) {
                        
                            System.out.println("El lugar está ocupado");
                            aux=1;
                        }else {
                        System.out.println(cine.getEspectadores().get(i).getNombre()+" se ubicara en el lugar: "+cine.getSala()[f][c]);
                       
                     cine.getSala()[f][c]=cine.getSala()[f][c] + "X";
                        
                        }
                        }while(aux==1);
                     


                     
                     
                    }else{
                    
                        System.out.println("El espectador No tiene la edad suficiente para entrar a la sala ");
                    }
               
                
                } else{
                    System.out.println("El espectador no dispone de dinero suficiente para entrar a la sala");
                }
            
            
           // }
            
        }
     }
    
    public void mostrarSala(Cine cine){
    
     for (int i = 0; i < 8; i++) {
            
            for (int j = 0; j < 6; j++) {
                System.out.print(cine.getSala()[i][j]);
            }
            System.out.println(" ");
            
        }
    
    }
}
