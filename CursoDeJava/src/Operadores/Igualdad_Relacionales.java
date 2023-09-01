
package Operadores;


public class Igualdad_Relacionales {

    public static void main(String[] args) {
        var a = 3;
        var b = 2;
        
        //operador de igualdad
        var c = (a == b);
        System.out.println("c = " + c);
        
        //Operador de diferencia 
        var d = (a != b);
        System.out.println("d = " + d);
        
        //Igualdad con cadenas.
        var cadena1 = "hola";
        var cadena2 = "adios";
        
        var e = cadena1.equals(cadena2);
        System.out.println("e = " + e);
    }
    
}
