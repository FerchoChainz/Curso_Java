
package SentenciasControl;

import java.util.Scanner;

public class if_else {

    public static void main(String[] args) {
        var condicion = true;
        
        if(condicion == true){
            System.out.println("Condicion verdadera");
        }else{
            System.out.println("Condicion falsa");
        }
        
        
        var numero = 2;
        var numeroTexto ="Numero desconocido";
        
        if(numero == 1){
            numeroTexto = "Numero uno";
        }else if(numero == 2){
            numeroTexto = "Numero dos";
        }else if(numero == 3){
            numeroTexto = "Numero tres";
        }else if(numero == 4){
            numeroTexto = "Numero cuatro";
        }else{
            numeroTexto = "Numero desconocido";
        }
        System.out.println("numeroTexto = " + numeroTexto);
        
        System.out.println("--------ESTACION DEL ANIO----");
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Ingresa el mes que deseas conocer la estacion");      
        var mes = Integer.parseInt(scanner.nextLine());
        var estacion = "Estacion desconocida";
        if(mes == 1 || mes == 2 || mes == 12){
            estacion = "Invierno";
        }else if(mes == 3 || mes == 4 || mes == 5){
            estacion = "Primavera";
        }else if(mes == 6 || mes == 7 || mes == 8){
            estacion = "Verano";
        }else if(mes == 9 || mes == 10 || mes ==11){
            estacion = "Otoño";
        }else{
            System.out.println(estacion);
        }
        System.out.println("estacion = " + estacion);
    }
    
}
