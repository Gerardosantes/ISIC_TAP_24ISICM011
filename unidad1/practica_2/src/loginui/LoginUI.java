
package loginui;


import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class LoginUI extends JFrame {

    private JTextField txtUsuario;
    private JPasswordField txtPassword;
    private JButton btnLogin;

    public LoginUI() {
        setTitle("EMPRESA ------GERARDO");
        setSize(500, 350); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

       
        JPanel panel = new JPanel();
        panel.setBackground(new Color(240, 248, 255)); 
        panel.setLayout(new GridBagLayout());
        add(panel);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15,15,15,15);

       
        JLabel titulo = new JLabel("INICIO DE SESIÓN");
        titulo.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        titulo.setForeground(new Color(25, 25, 112)); 
        panel.add(titulo, gbc);

       
        gbc.gridwidth = 1;
        gbc.gridy++;
        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setFont(new Font("gerardo", Font.PLAIN, 16));
        panel.add(lblUsuario, gbc);

        gbc.gridx = 1;
        txtUsuario = new JTextField(15);
        txtUsuario.setBorder(new LineBorder(new Color(100,149,237), 2));
        panel.add(txtUsuario, gbc);

       
        gbc.gridx = 0;
        gbc.gridy++;
        JLabel lblPassword = new JLabel("Contraseña:");
        lblPassword.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        panel.add(lblPassword, gbc);

        gbc.gridx = 1;
        txtPassword = new JPasswordField(15);
        txtPassword.setBorder(new LineBorder(new Color(100,149,237), 2));
        panel.add(txtPassword, gbc);

       
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;

        btnLogin = new JButton("ingresar");
        btnLogin.setBackground(new Color(100,149,237)); 
        btnLogin.setFont(new Font("ger", Font.BOLD, 18));
        btnLogin.setFocusPainted(false);
       

        panel.add(btnLogin, gbc);

      
        btnLogin.addActionListener(e -> validar());
    }

    private void validar() {
        String user = txtUsuario.getText();
        String pass = new String(txtPassword.getPassword());

        if(user.equals("gerardo") && pass.equals("1234")) {
            btnLogin.setBackground(new Color(60,179,113)); 
            btnLogin.setText("Bienvenido");

            JOptionPane.showMessageDialog(this, "Acceso Concedido");
        } else {
            btnLogin.setBackground(new Color(220,20,60)); 
            JOptionPane.showMessageDialog(this, "error volver a intentar");
        }
    }
    class RoundedBorder extends AbstractBorder {
        private int radius;
        RoundedBorder(int radius) {
            this.radius = radius;
        }

        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width-1, height-1, radius, radius);
        }
    }

    public static void main(String[] args) {
        new LoginUI().setVisible(true);
        
    }
}