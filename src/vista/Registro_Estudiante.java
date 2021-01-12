package vista;

import javax.swing.*;
import java.awt.*;

public class Registro_Estudiante extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JButton siguienteButton;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JPanel panel1;

    public Registro_Estudiante (){
        setContentPane(panel1);
        setSize(500, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Registro Estudiante");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
