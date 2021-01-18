package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vista_vacunar extends JFrame{
    private JPanel panel1;
    public JTable vacunar_table;
    private JButton cargarButton;

    public Vista_vacunar (){
        setContentPane(panel1);
        setVisible(true);
        setSize(450, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Lista de prioritarios");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
