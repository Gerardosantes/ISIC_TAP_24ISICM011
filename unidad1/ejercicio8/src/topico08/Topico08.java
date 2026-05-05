
package topico08;

import java.awt.Color;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;


public class Topico08 extends JFrame {

public Topico08(){

        setTitle("Ejercicio G: Control de Sistema");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
         getContentPane().setBackground(new Color(30, 30, 30)); 
        
        // Crear un JSlider para controlar el sistema
        JSlider slider = new JSlider(0, 200, 50);
        slider.setMajorTickSpacing(40);
        slider.setMinorTickSpacing(8);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        
        // Crear una Barra de progreso
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setValue(50);
            progressBar.setForeground(Color.GREEN);
        
        // Evento
        slider.addChangeListener(e -> {
            int value = slider.getValue();
            progressBar.setValue(value);
        });
        
        add(new JLabel("Ajuste de Nivel:"));
        add(slider);
        add(progressBar);
        setVisible(true);
    }
        
      public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> new Topico08());
}
}
        
   
    

