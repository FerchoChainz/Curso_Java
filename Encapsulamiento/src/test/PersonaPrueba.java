package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona = new Persona("Lazaro", 5000,false);
        
        //para modificar los valores del objeto
        persona.setNombre("Fernando");
        
        //para imprimirlo
//        System.out.println("persona = " + persona.getNombre());
//        System.out.println("Sueldo = " + persona.getSueldo());
//        System.out.println("Eliminado = " + persona.isEliminado());

        System.out.println("Persona: " + persona);
    }
}
