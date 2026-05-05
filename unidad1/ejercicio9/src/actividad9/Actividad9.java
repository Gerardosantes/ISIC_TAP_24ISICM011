package actividad9;

import javax.swing.*;
import java.awt.*;

public class Actividad9 extends JFrame {
    
    public Actividad9() {
        setTitle("Ejercicio 9: Lista de Tareas");
        setSize(350, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        // MODIFICACIÓN 1: Modo oscuro
        getContentPane().setBackground(new Color(40, 40, 40));

        DefaultListModel<String> modelo = new DefaultListModel<>();
        modelo.addElement("Estudiar TAP");
        modelo.addElement("Hacer commit en GitHub");
        modelo.addElement("Revisar rúbricas");
        
        JList<String> lista = new JList<>(modelo);
        lista.setBackground(new Color(60, 60, 60));
        lista.setForeground(Color.WHITE);

        add(new JScrollPane(lista), BorderLayout.CENTER); 

        JPanel pnlAcciones = new JPanel();
        pnlAcciones.setBackground(new Color(40, 40, 40));

        JTextField txtTarea = new JTextField(12);
        JButton btnAdd = new JButton("+");
        JButton btnDel = new JButton("-");
        
        // MODIFICACIÓN 2: Botón extra
        JButton btnClear = new JButton("Limpiar Todo");

        btnAdd.setToolTipText("Agregar tarea");
        btnDel.setToolTipText("Eliminar tarea seleccionada");

        btnAdd.addActionListener(e -> {
            String nuevaTarea = txtTarea.getText().trim();
            if(!nuevaTarea.isEmpty()) {
                modelo.addElement(nuevaTarea);
                txtTarea.setText("");
                txtTarea.requestFocus();
            }
        });

        btnDel.addActionListener(e -> {
            int index = lista.getSelectedIndex();
            if(index != -1) {
                // Confirmación antes de borrar
                int confirm = JOptionPane.showConfirmDialog(
                        this, 
                        "¿Seguro que quieres eliminar la tarea?", 
                        "Confirmar", 
                        JOptionPane.YES_NO_OPTION
                );
                if(confirm == JOptionPane.YES_OPTION) {
                    modelo.remove(index);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Selecciona un elemento para borrar");
            }
        });

        // Acción limpiar todo
        btnClear.addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(
                    this,
                    "¿Eliminar TODAS las tareas?",
                    "Confirmación",
                    JOptionPane.YES_NO_OPTION
            );
            if(confirm == JOptionPane.YES_OPTION) {
                modelo.clear();
            }
        });

        pnlAcciones.add(txtTarea); 
        pnlAcciones.add(btnAdd); 
        pnlAcciones.add(btnDel);
        pnlAcciones.add(btnClear);

        add(pnlAcciones, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Actividad9().setVisible(true);
        });
    }
}
