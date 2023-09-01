package Operadores;

public class OperadoresRelacionales {

    public static void main(String[] args) {
        var a = 3;
        var b = 2;

        var c = a > b;
        var d = a >= b;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        if (a % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }
        
        var edad = 20;
        var adulto = 18;
        if(edad >= adulto){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
        
    }
}
