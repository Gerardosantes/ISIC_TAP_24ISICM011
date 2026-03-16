
package ejercicio03;
import javax.swing.*;
import java.awt.*;

public class Ejercicio03 extends JFrame { 
    
    Ejercicio03(){
        
       setTitle("Ejercicio 03");
        setSize(400,300);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,2,5,5));
        
        for(int i=1; i<=7; i++){
            add(new JButton("boton"+i));
            
            
            
        }
        setVisible(true);
        
        
    }
    
    
    public static void main(String[] args) {
        new Ejercicio03();
    }
    
}
