
package ejercicio03;
import javax.swing.*;
import java.awt.*;

public class Ejercicio03 extends JFrame { 
    
    Ejercicio03(){
        
        setTitle("Ejercicio 03");
        setSize(400,300);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0,2,5,5));
        
        for(int i=1; i<=6; i++){
            JButton boton = new JButton("Botón " + i);
            
          
            boton.setBackground(Color.CYAN);
            boton.setFont(new Font("Arial", Font.BOLD, 14));
            
            add(boton);
        }
        
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Ejercicio03();
    }
}