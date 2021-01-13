package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registro_Estudiante extends JFrame{
    public JTextField txt_nombreEst;
    private JTextField txt_direccionEst;
    public JButton finalizar_EstButton;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox box_generoEst;
    private JPanel panel1;
    private JTextField txt_correoEst;

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

