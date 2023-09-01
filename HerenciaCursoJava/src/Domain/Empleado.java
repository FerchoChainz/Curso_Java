package Domain;

public class Empleado extends Persona {
    //podemos usar los atributos de tipo privado porque ya no 
    //tendremos clases hijas de esta clase
    private int id;
    private double sueldo;
    private static int contadorEmpleado;
    //esta variable la incrementaremos cada que hagamos un objeto 
    //de la clase empleado

    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.id = id = ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;
    }//Inicializamos los atributos

    public int getId() {
        return id;
    }
    
    
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{id=").append(this.id);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", nombre=").append(this.nombre);
        sb.append('}');
        return sb.toString();
    }
    
}
