
package Creacion_Clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Lazaro";
        persona.apellido = "Estrada";
        persona.desplegarInfo();
        
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
    }
}
