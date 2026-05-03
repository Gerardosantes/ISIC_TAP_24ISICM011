
package topico05;


import javax.swing.*;
import java.awt.*;

import java.awt.event.*;


public class Topico05 extends JFrame {
    
    public Topico05 (){
        
        setTitle("ejercico 5");
        setSize(400, 300); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
      
        setLayout(new GridBagLayout());
        
        JLabel etiqueta= new JLabel("pasa el raton aqui",SwingConstants.CENTER);
        etiqueta.setPreferredSize(new Dimension(200,100));
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.blue);
        etiqueta.addMouseListener(new MouseAdapter(){
           @Override
           public void mouseExited(MouseEvent e){
                etiqueta.setBackground(Color.YELLOW);
                etiqueta.setText("pasa el raton aqui");
           }
           @Override
           public void mouseEntered(MouseEvent e){
                etiqueta.setBackground(Color.CYAN);
                etiqueta.setText("¡Estas encima!");
           }
           
        });
        add(etiqueta);
        
    }   

   
    public static void main(String[] args) {
      new Topico05().setVisible(true);
      
       
      
    }
    
}
