
package ejercicio3;

import javax.swing.*;
import java.awt.*;

public class Ejercicio2 extends JFrame {

    public Ejercicio2(){
        setTitle("Ejercicio 3");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JPanel panelNorte = new JPanel();
        panelNorte.setBackground(Color.CYAN);
        JLabel lblNorte = new JLabel("Norte");
        lblNorte.setFont(new Font("Arial", Font.BOLD, 60));
        panelNorte.add(lblNorte);

        JPanel panelSur = new JPanel();
        panelSur.setBackground(Color.yellow); 
        JLabel lblSur = new JLabel("Sur");
        lblSur.setFont(new Font("Arial", Font.BOLD, 60)); 
        panelSur.add(lblSur);

        JPanel panelCentral = new JPanel();
        panelCentral.setBackground(Color.pink);
        JLabel lblCentro = new JLabel("Centro");
        lblCentro.setFont(new Font("Arial", Font.BOLD, 40)); 
        panelCentral.add(lblCentro);

       
        JPanel panelEste = new JPanel();
        panelEste.setBackground(Color.cyan);
        panelEste.add(new JLabel("Este"));

        JPanel panelOeste = new JPanel();
        panelOeste.setBackground(Color.lightGray);
        panelOeste.add(new JLabel("Oeste"));

        add(panelNorte, BorderLayout.NORTH);
        add(panelSur, BorderLayout.SOUTH);
        add(panelCentral, BorderLayout.CENTER);
        add(panelEste, BorderLayout.EAST);   
        add(panelOeste, BorderLayout.WEST);  

        setVisible(true);
    }

    public static void main(String[] args) {
        new Ejercicio2();
    }
}