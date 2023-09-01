//Lazaro Fernando Estrada Vaca
package cursodejava;

import java.util.Scanner;

public class Variables {

    public static void main(String[] args) {
        //variables de tipo int
        //definimos la variable
        System.out.println(" -----------INT----------------");
        int miVariable = 10;
        System.out.println(miVariable);

        //reasignar valor
        miVariable = 6;
        System.out.println(miVariable);
        System.out.println(" -----------STRING----------------");

//        -----------STRING-----------------
        //Como declarar una variable de tipo cadena
        String miNombre = "Lazaro";
        System.out.println(miNombre);

        miNombre = "Fernando";
        System.out.println(miNombre);

        System.out.println(" -----------INFERENCIA DE DATOS----------------");
//      --------------Inferencia de datos------------
        //Java infiere con la palabra reservada var y hace inferencia de tipos 
        //en java
        var miVariable2 = 15;
        //asi java identifica que es una variable de tipo entero
        System.out.println(miVariable2);
        //ejercicio
        var miVariableCadena2 = "Lazarin";
        System.out.println(miVariableCadena2);

        System.out.println(" -----------CONCATENACION----------------");
//      ------------------CONCATENACION--------
        var usuario = "Lazaro";
        var titulo = "Ingeniero";
        var union = usuario + " " + titulo;

        System.out.println(union);

        var i = 3;
        var j = 4;
        System.out.println(i + j);
        System.out.println(i + j + " " + usuario);//primero realiza la suma porque se basa de izquerda a derecha
        System.out.println(usuario + i + j + " Concatena lo primero que encuentra, en este caso una cadena");
        System.out.println(usuario + (i + j));

        System.out.println(" -----------CARACTERES ESPECIALES----------------");
        var nombre = "karla";
        System.out.println("nueva linea: \n" + nombre); //salto de linea
        System.out.println("tabulador: \t" + nombre);//Hace una tabulacion
        System.out.println("Retroceso: \b" + nombre); //Retroceso, regresa una posicion en la salida del programa
        System.out.println("Comilla simple: \'" + nombre + "\'"); //Envuelve el contenido en comillas simples 
        System.out.println("Comilla doble: \"" + nombre + "\"" ); //Envuelve el contenido en comillas dobles
        
        System.out.println(" -----------Scanner----------------");
        
//        System.out.println("Escribe tu nombre: \n");
          Scanner consola = new Scanner(System.in);
          System.out.println("Esta comentado el codigo");
//        var user = consola.nextLine();
//        System.out.println("usuario "+ user);
//        System.out.println("\nEscribe el titulo: \n");
//        var title =  consola.nextLine();
//        System.out.println("Resultado: " + user + " " + title);
        
        System.out.println(" -----------Ejercicio Scanner----------------");
        
        System.out.println("Proporciona el titulo del libro: ");
        var bookTitle = consola.nextLine();
        System.out.println("\nProporciona el autor del libro: ");
        var bookAutor = consola.nextLine();
        System.out.println("El libro: " + bookTitle + "," + " fue escrito por: " + bookAutor);
    }
}
