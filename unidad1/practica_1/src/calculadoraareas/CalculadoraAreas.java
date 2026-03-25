
package calculadoraareas;

import javax.swing.*;
import java.awt.*;

public class CalculadoraAreas extends JFrame {

    private JTextField txtRadio, txtLado, txtApotema;

    public CalculadoraAreas() {
        setTitle("Calculadora de Áreas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5,2,10,10));

        
   
        add(new JLabel("Radio (Círculo):"));
        txtRadio = new JTextField();
        add(txtRadio);

        add(new JLabel("Lado (Cuadrado / Hexágono):"));
        txtLado = new JTextField();
        add(txtLado);

        add(new JLabel("Apotema (Hexágono):"));
        txtApotema = new JTextField();
        add(txtApotema);

    
        JButton btnCirculo = new JButton("Área Círculo");
        JButton btnCuadrado = new JButton("Área Cuadrado");
        JButton btnHexagono = new JButton("Área Hexágono");

        add(btnCirculo);
        add(btnCuadrado);
        add(btnHexagono);

 
        btnCirculo.addActionListener(e -> {
            try {
                double radio = Double.parseDouble(txtRadio.getText());

                if (radio <= 0) {
                    JOptionPane.showMessageDialog(this, "El radio debe ser positivo");
                    return;
                }

                double area = Math.PI * radio * radio;
                JOptionPane.showMessageDialog(this, "Área del círculo: " + area);

            } catch (NumberFormatException ex) {
                limpiarCampos();
                JOptionPane.showMessageDialog(this, "Error: ingresa un número válido");
            }
        });


        btnCuadrado.addActionListener(e -> {
            try {
                double lado = Double.parseDouble(txtLado.getText());

                if (lado <= 0) {
                    JOptionPane.showMessageDialog(this, "El lado debe ser positivo");
                    return;
                }

                double area = lado * lado;
                JOptionPane.showMessageDialog(this, "Área del cuadrado: " + area);

            } catch (NumberFormatException ex) {
                limpiarCampos();
                JOptionPane.showMessageDialog(this, "Error: ingresa un número válido");
            }
        });

   
        btnHexagono.addActionListener(e -> {
            try {
                double lado = Double.parseDouble(txtLado.getText());
                double apotema = Double.parseDouble(txtApotema.getText());

                if (lado <= 0 || apotema <= 0) {
                    JOptionPane.showMessageDialog(this, "Valores deben ser positivos");
                    return;
                }

                double perimetro = 6 * lado;
                double area = (perimetro * apotema) / 2;

                JOptionPane.showMessageDialog(this, "Área del hexágono: " + area);

            } catch (NumberFormatException ex) {
                limpiarCampos();
                JOptionPane.showMessageDialog(this, "Error: ingresa valores válidos");
            }
        });
    }

   
    private void limpiarCampos() {
        txtRadio.setText("");
        txtLado.setText("");
        txtApotema.setText("");
    }

    public static void main(String[] args) {
        new CalculadoraAreas().setVisible(true);
    }
}
