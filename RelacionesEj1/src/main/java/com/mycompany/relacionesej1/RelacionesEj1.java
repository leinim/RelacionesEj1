/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */

package com.mycompany.relacionesej1;

import Entidad.Perro;
import Entidad.Persona;

/**
 *
 * @author Mile
 */
public class RelacionesEj1 {

    public static void main(String[] args) {
        Persona p1 = new Persona("Camila", "Lopez", 28, 39387464, null);
        Persona p2 = new Persona("Alejandro", "Perez", 40, 12345678, null);
        Perro perri1 = new Perro("Mecha", "Calle", 8, "Mediano");
        Perro perri2 = new Perro("Chiquito", "Samoyedo", 4, "Grande");
        
        p1.setPerro(perri1);
        p2.setPerro(perri2);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        
        
    }
}
