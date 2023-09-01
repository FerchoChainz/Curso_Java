package PalabraThis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("lazaro" , "estrada");
        System.out.println("persona = " + persona);
        System.out.println("Persona nombre: " + persona.nombre);
        System.out.println("Persona apellido: " + persona.apellido);
    }
}

class Persona{
    String nombre;
    String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("objeto persona usando this: " + this);
        new Imprimir().imprimir(this);
    } 
}


class Imprimir{
    public void imprimir(Persona persona){
        System.out.println("Persona desde imprimir: " + persona);
        System.out.println("Mandamos a imprimir el objeto actual (this)" + this);
    }
}