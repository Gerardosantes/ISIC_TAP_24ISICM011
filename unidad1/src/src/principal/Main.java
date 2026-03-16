
package principal;

import javax.swing.JFrame;


public class Main extends JFrame {
    
    public Main(){
        
   setTitle("mi primera ventana-TAP"); 
   setSize(600,400);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setLocationRelativeTo(null);
   setVisible(true);
        
       
        
    }
    
    
    
    
    public static void main(String[] args) {
        
        new Main();
        
        
    }
    
}
