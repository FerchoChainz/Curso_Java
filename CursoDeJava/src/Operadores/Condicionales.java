
package Operadores;


public class Condicionales {
    
    public static void main(String[] args) {
        var a = 10;
        var valueMin = 0;
        var valueMax = 10;
        
        var result = a >= 0 && a <=10;
        if(result ==  true){
            System.out.println("Dentro de rango");
        }else{
            System.out.println("Fuera de rango.");
        }
        
        var vacaciones = false;
        var diaDescanso = false;
        if(vacaciones || diaDescanso){
            System.out.println("El padre puede asistir.");
        }else{
            System.out.println("El padre no puede asistir.");
        }
    }
    
}
