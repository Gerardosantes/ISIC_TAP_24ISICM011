
package principal;

import javax.swing.JFrame;


public class Main extends JFrame {
    
    public Main(){
        
   setTitle("ventana modificada"); 
   setSize(900,600);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setLocationRelativeTo(null);
   setVisible(true);
        
       
        
    }
    
    
    
    
    public static void main(String[] args) {
        
        new Main();
        
        
    }
    
}
