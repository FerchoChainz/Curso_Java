
package cursodejava;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{
    
    public Ventana(){
        this.setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Merge Sort"); //Establecemos el titulo 
        
        //setLocation(500, 100); //establecemos la posicion de la ventana
        
        //setBounds(100, 200, 500, 500);
        //setBounds engloba setSize y setLocation: los dos primeros parametros son de setLocation y los segundos son de setSize
        
        setLocationRelativeTo(null); //Establecer posicion relativa a: con el atributo null lo coloca en el centro de la pantalla
        
        setResizable(true); //Con este metodo establecemos si podemos cambiar de tamanio la ventana
        
        setMinimumSize(new Dimension (200 , 200)); //Establecemos el tamanio minimo 
        
        //setMaximumSize(new Dimension(600 , 600)); //establecemos el tamanio maximo
        
        //this.getContentPane().setBackground(Color.red); //establecems el color de fondo de la pantalla

        iniciarComponentes();
    }
    
    private void iniciarComponentes (){
        JPanel panel = new JPanel(); //instanciamos el objeto panel
        this.getContentPane().add(panel); //agregamos el panel a la ventana
        //panel.setBackground(Color.red); //cambiar color del fondo del panel
        panel.setLayout(null); //desactivamos el layout por defecto
        
        JLabel etiqueta = new JLabel("Hola");
        etiqueta.setBounds(10, 10, 30, 20); //tamanio y posicion
        panel.add(etiqueta); //agregamos la etiqueta al panel 
        etiqueta.setForeground(Color.BLUE); //establecemos e color de la letra
        etiqueta.setOpaque(true); //establecemos poner color en el fondo de la etiqueta
        etiqueta.setBackground(Color.red); //cambiamose el color del fondo de la etiqueta
        
        
    }
    
}
