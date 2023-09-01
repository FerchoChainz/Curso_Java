
package Ciclos;

public class For {

    public static void main(String[] args) {
        for (int i = 0; i < 3 ; i++){
            if(i % 2 != 0){
                continue;
            }
            System.out.println("Contador = " + i);
        }
    }   
}
