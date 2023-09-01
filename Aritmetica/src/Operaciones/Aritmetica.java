package Operaciones;


public class Aritmetica {
    
    int a,b;
    
    //cosntructor vacio 
    public Aritmetica(){
        System.out.println("Ejecutando constructor vacio");
    }
    
    //Constructor con argumentos
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con argumentos");
    }
    
    //Metodos 
    public void sumar(){
       int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarRetorno(){
        int resultado = a + b;
        return resultado;
    }
    
    public int sumaConArgumentos(int a, int b){
        this.a = a;
        this.b = b;
        return sumarRetorno();
    }
}
