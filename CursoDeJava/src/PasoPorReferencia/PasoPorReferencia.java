package PasoPorReferencia;

import Creacion_Clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Lazaro";
        System.out.println("persona1 = " + persona1.nombre);
        cambiaValor(persona1);
        //esta variable lo que almacena es el valor del objeto que se creo
        System.out.println("persona1 cambio de nombre = " + persona1.nombre);
    }
    
    public static Persona cambiaValor(Persona persona){
        //Lo que recibe este argumento es la referencia de la variable 
        //persona1
        persona.nombre = "Fernando";
        if(persona == null){
            return persona;
        }
        return persona;
    }
}
 