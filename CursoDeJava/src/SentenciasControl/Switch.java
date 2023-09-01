
package SentenciasControl;

import java.util.Scanner;


public class Switch {


    public static void main(String[] args) {
        var numero = 5;
        var numeroTexto = "Numero desconocido";
        
        switch(numero){
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            default:
                System.out.println("Numero desconocido");
        }
        System.out.println("numeroTexto = " + numeroTexto);
        
        Scanner scanner = new Scanner(System.in);
        
        var estacion = "Estacion desconocida";
        
        System.out.println("Introduce el numero del mes: ");
        var mes = Integer.parseInt(scanner.nextLine());
        switch(mes){
            case 12 : case 1 : case 2:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7 : case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otoño";
                break;
            default:
                estacion = "Estacion desconocida";
        }
        System.out.println("estacion = " + estacion);
        
        
        System.out.println("------EJERCICIO----------");
        System.out.println("Introduce tu calificacion: ");
        float note  = Float.parseFloat(scanner.nextLine());
        var result = "Valor desconocido";
        
        if(note >= 9 && note <= 10){
            result = "Nota A";
        }else if(note >= 8 && note < 9){
            result = "Nota B";
        }else if(note >= 7 && note < 8){
            result = "Nota C";
        }else if(note >= 6 && note < 7){
            result = "Nota D";
        }else if(note >= 0 && note < 6){
            result = "Nota F";
        }else{
            result = "Nota desconocida";
        }
        System.out.println("result = " + result);
    }
    
}
