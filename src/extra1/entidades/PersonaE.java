/*
1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package extra1.entidades;


import java.util.ArrayList;

public class PersonaE {
    
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer documento;
    private ArrayList<PerroE> perro;

    public PersonaE(String nombre, String apellido, Integer edad, Integer documento, ArrayList<PerroE> perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = new ArrayList();
    }

    public PersonaE() {
        perro= new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public ArrayList<PerroE> getPerro() {
        return perro;
    }

    public void setPerro(ArrayList<PerroE> perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "PersonaE{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", perro=" + perro + '}';
    }
    
    
}