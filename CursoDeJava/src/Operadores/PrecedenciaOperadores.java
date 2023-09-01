
package Operadores;

import java.util.Scanner;


public class PrecedenciaOperadores {


    public static void main(String[] args) {
        var x = 5;
        var y = 10; 
        var z = ++x + y--;
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        var resultado = 4 + 5 * 6 / 3;
        System.out.println("resultado = " + resultado);
        
        resultado = (4+5) * 6 /3;
        System.out.println("resultado = " + resultado);
        
        Scanner consola = new Scanner(System.in);
        
        /*System.out.println("Introduce la base: ");
        int base = Integer.parseInt(consola.nextLine());
        System.out.println("Introduce la altura: ");
        int altura = Integer.parseInt(consola.nextLine());
        
        var area = (base * altura);
        var perimetro = (base +altura) * 2;
        System.out.println("area = " + area);
        System.out.println("perimetro = " + perimetro);*/
        
        System.out.println("Introduce la primera cantidad: ");
        int a = Integer.parseInt(consola.nextLine());
        System.out.println("Introduce la segunda cantidad: ");
        int b = Integer.parseInt(consola.nextLine());
        if(a > b){
            System.out.println("el numero: " + a + " es mayor");
        }else{
            System.out.println("El numero: " + b + " es mayor");
        }
        
        
    }
    
}
