
package Operadores;

public class Modulo4_Operadores {


    public static void main(String[] args) {
        int a =3 , b=2;
        float result = a%   b;
        
        System.out.println("result = " + result);   
        
        //Si la division de un numero entre 2 es igual a cero es par
        if(b  % 2 == 0){
            System.out.println("Es numero par");
        }else{
            System.out.println("Numero impar");
        }
        
        System.out.println("---------------Operadores de asignacion-------------");
        int c = a +5 -b;
        System.out.println("c = " + c);
        
        //operador de asignacion de composicion 
        //tomamos la variable a y la incrementamos en 1 
        a += 1; 
        //esto es igual: a = a +1;
        System.out.println("a = " + a);
        
        //operador de asignacion de composicion 
        //tomamos la variable a y la decrementamos en 1 
        a -= 1; 
        //esto es igual: a = a -1;
        System.out.println("a = " + a);
        
        System.out.println("-------------Operadores unarios -------------------");
        int d = 3;
        int e = -a;
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        
        System.out.println("Operador de negacion:");
        boolean f = true;
        var g = !f;
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        
        System.out.println("Operador unario de pre-incremento");
        int h = 3;
        int i = --h;
        System.out.println("h = " + h);
        System.out.println("i = " + i);
        
        System.out.println("Operador unario de post-incremento");
        int j =5;
        int k = j--; //Primero se utiliza el valor de la variable 
        //despues se incrementa
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        
    }
    
}
