package test;

import Domain.Persona;


public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Lazaro");
        Persona persona2 = new Persona("Juan");
        
        imprimir(persona1);
        imprimir(persona2);

    }
    
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
    
}
