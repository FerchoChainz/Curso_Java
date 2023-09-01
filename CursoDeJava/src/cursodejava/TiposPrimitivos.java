
package cursodejava;
import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        /*
            Tipos promitivos enteros: byte, short, int, long
        */
        
        byte numeroByte = (byte)129;
        System.out.println("Valor minimo del byte" + Byte.MIN_VALUE);
        System.out.println("Valor maximo del byte" + Byte.MAX_VALUE);
        
        
        //----------------------------------------------------------------------
        
        //Palabra resevada var
        var numeroEntero = 10;
        
        var numeroFloat = 10.0F;
        System.out.println(numeroFloat);
        
        //Variable de tipo char 
        char caracter = 'a';
        System.out.println("Mi caracter es: " + caracter);
        
        char varchar = '\u0021';
        System.out.println(varchar);
        
        char varchardecimal = 33;
        System.out.println(varchardecimal); //imprimir caracteres de forma decimal
        
        var caracterV = 'a';
        System.out.println("Mi caracter es: " + caracterV);
        
        var varcharV = '\u0021';
        System.out.println(varcharV);
        
        //En este caso toma inferencia de datos porque tomara la variable de forma int 
        var varchardecimalV = 33;
        System.out.println(varchardecimalV); //imprimir caracteres de forma decimal
        
        int letra = 'l';
        System.out.println(letra);
         //------------------------------------------------------------
        
        System.out.println("-------------------------BOOLEANS---------");
        
        boolean varBoolean = true; 
        System.out.println(varBoolean);
        
        if(varBoolean){
            System.out.println("La bandera es verdadera");
        }else{
            System.out.println("La bandera es falsa");
        }
        
        var edad = 20;
        var esAdulto = edad >= 18;
        //podemos hcaer condiciones con tipo var para condicionar las variables no solo true o false
        
        if(esAdulto){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
        
        System.out.println("-----------------CONVERSIONES DE TIPOS---------");
        
        //convertir tipo String a tipo int 
        var edadS = Integer.parseInt("20");
        System.out.println("Cadena convertida a entero:" + (edadS + 1));
        //le sumamos un numero, entre parentesis ya que primero se realiza la operacion, despues las concatenacion
        
        var valorPi =Double.parseDouble("3.1416");
        System.out.println("Cadena convertida a double: " + (valorPi + 1));
        
        var consola = new Scanner(System.in); 
        System.out.println("Proporciona tu edad: ");
        // edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad);
        
        System.out.println("-----------------CONVERSIONES DE TIPOS PRIMITIVOS---------");
        //convertir tipo Int a String
        
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        
        //convertir tipo String a Char
        var caracter1 = "hola".charAt(1);
        //para poder recuperar un caracter de una cadena debemos pasar el valor del indice
        //los indices empiezan en 0, ejemplo: 0 = 'h'
        System.out.println("caracter1 = " + caracter1);
        
        /*System.out.println("Proporcuona un caracter");
        caracter1 = consola.nextLine().charAt(0);
        System.out.println("caracter1 = " + caracter1);*/
        
        System.out.println("------------------- Ejercicio1 ------------------");
        
        String nombre;
        int id;
        double precio;
        boolean envioGratis = false;
        
        System.out.println("Ingresa el nombre del libro: ");
        nombre = consola.nextLine();
        
        System.out.println("Ingresa el id del libro: ");
        id = Integer.parseInt(consola.nextLine());
        
        System.out.println("Ingresa el precio: $");
        precio = Double.parseDouble(consola.nextLine());
        
        System.out.println("Nombre: " + nombre + " #" + id);
        System.out.println("Precio : $" + precio);
        
        if (precio >= 500){
            envioGratis = true;
            System.out.println("Tienes envio gratis");
        }else{
            System.out.println("No cuentas con envio gratis :( ");
        }
        
    }
    
}
