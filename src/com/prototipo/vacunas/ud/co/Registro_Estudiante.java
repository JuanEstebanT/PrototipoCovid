package com.prototipo.vacunas.ud.co;
/*
Esto no sirve para  nada :v
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registro_Estudiante extends JFrame implements ActionListener {

    private JPanel panel1;
    private JComboBox comboBox2;
    private JSpinner spinner1;
    private JRadioButton CasaRadioButton1;
    private JRadioButton a2RadioButton;
    private JRadioButton soloUstedRadioButton;
    private JRadioButton a1RadioButton1;
    private JRadioButton a2RadioButton1;
    private JRadioButton a3OMasRadioButton1;
    private JRadioButton siRadioButton;
    private JRadioButton noRadioButton;
    private JRadioButton a3OMasRadioButton2;
    private JButton volverButton;
    private JRadioButton SaludRadioButton1;
    private JRadioButton noRadioButton1;
    private JRadioButton siRadioButton2;
    private JRadioButton noRadioButton2;
    private JRadioButton siRadioButton4;
    private JRadioButton noRadioButton3;
    private JRadioButton siRadioButton3;
    private JRadioButton noRadioButton4;
    private JRadioButton siRadioButton5;
    private JRadioButton noRadioButton5;
    private JButton puntajeButton;
    private JLabel cuantasPersonasVivenConLabel;
    JScrollPane scrollPane;
    public int puntaje;
    public Registro_Estudiante(){
        setContentPane(panel1);
        setSize(600,700);
       // this.setResizable(false); // No maximizar ni Minimizar
        this.setLocationRelativeTo(null); // ubicación en el centro
        this.setVisible(true); // visible la ventana
        this.setTitle("CovidVac Aplha 0.1"); // poner titulo
        volverButton.setActionCommand("Inicio");
        volverButton.addActionListener(this);
        puntajeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(CasaRadioButton1.isSelected()){
                    puntaje += 1;
                }
                if(SaludRadioButton1.isSelected()){
                    puntaje += 1;
                }

            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Inicio")){
            Ventana_Inicial obj = new Ventana_Inicial();
            obj.setVisible(true);
            dispose();
        }
    }
}
