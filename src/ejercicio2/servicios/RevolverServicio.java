/*
 Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual
(posición del tambor que se dispara, puede que esté el agua o no) y posición agua (la
posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán
aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
valores deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)

 */
package ejercicio2.servicios;

import ejercicio2.entidades.Revolver;

public class RevolverServicio {

    public Revolver llenarRevolver() {

        Revolver revolver = new Revolver();

        revolver.setPosActual((int) (Math.random() * 6 + 1));

        revolver.setPosAgua((int) (Math.random() * 6 + 1));

        return revolver;

    }

    public boolean mojar(Revolver revolver) {

//        if (revolver.getPosActual() == revolver.getPosAgua()) {
//            return true;
//        } else {
//            return !true;
//        }
        return revolver.getPosActual() == revolver.getPosAgua(); // DIRECTAMENTE RETORNA TRUE SI SE CUMPLE LA CONDICION O FALSE SI NO
    }

    public Revolver siguienteChorro(Revolver revolver) {

        if (revolver.getPosActual() <= 5) {
            revolver.setPosActual(revolver.getPosActual() + 1);
        } else {
            revolver.setPosActual(1);
        }
        return revolver;
    }

    public void toString(Revolver revolver) {

        System.out.println("Posición actual: " + revolver.getPosActual());
        System.out.println("Posición del Agua: " + revolver.getPosAgua());

    }
}
