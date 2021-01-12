package vista;

import javax.swing.*;
import java.awt.*;

public class Registro_Funcionario extends JFrame{
    private JPanel panel1;
    private JTextField textField5;
    private JTextField textField1;
    private JTextField textField3;
    private JTextField textField4;
    private JComboBox comboBox1;
    private JButton siguienteButton;
    private JComboBox comboBox2;
    private JComboBox comboBox3;

    public Registro_Funcionario (){
        setContentPane(panel1);
        setSize(430, 285);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Registro Funcionario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

