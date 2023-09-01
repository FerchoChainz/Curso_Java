package LaboratorioCaja;

public class Caja {
    //Atributos de la clase
    int ancho,alto,profundo;

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public Caja(){
        System.out.println("Constructor vacio");
    }
    
    public void calcularVolumen(int ancho, int alto, int profundo){
        int resultado = ancho * alto * profundo;
        System.out.println("Volumen = " + resultado);
    }
}
