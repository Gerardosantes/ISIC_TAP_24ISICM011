
package topico06;
import javax.swing.*;
import java.awt.*;

import java.awt.event.*;

public class Topico06 extends JFrame {
    
    public Topico06(){
        
        
        setTitle("ejercicio 6");
        setSize(200, 400); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(new FlowLayout(FlowLayout.CENTER,20,40));
        getContentPane().setBackground(Color.pink);
        JTextField campo= new JTextField(20);
        JLabel contador = new JLabel("contador: 0");
        campo.addKeyListener(new KeyAdapter(){
        @Override
       
        public void keyReleased(KeyEvent e){
            
            String texto = campo.getText().trim();
int total = texto.isEmpty() ? 0 : texto.split("\\s+").length;
            contador.setText("palabras: " + total);
        }
        
        });
                
        
        add(new JLabel("escribe algo"));
        add(campo);
        add(contador);
        
           
    }

    
    public static void main(String[] args) {
        
    new Topico06().setVisible(true);
    
}

}
