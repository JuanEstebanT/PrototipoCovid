package com.prototipo.vacunas.ud.co;

import javax.swing.*;
import java.awt.*;

public class prueba extends JFrame{
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JFormattedTextField formattedTextField1;
    private JTextPane textPane1;
    private JSlider slider1;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JCheckBox checkBox1;
    private JRadioButton radioButton1;
    private JTextField textField1;

    public prueba(){
        panel1.setPreferredSize(new Dimension(599,699));
        setContentPane(panel1);

        setSize(600,700);
        // this.setResizable(false); // No maximizar ni Minimizar
        this.setLocationRelativeTo(null); // ubicación en el centro
        this.setVisible(true); // visible la ventana
        this.setTitle("CovidVac Aplha 0.1"); // poner titulo
    }

}
