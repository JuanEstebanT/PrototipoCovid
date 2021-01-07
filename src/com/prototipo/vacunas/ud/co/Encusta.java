package com.prototipo.vacunas.ud.co;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Encusta extends JFrame{
    private JPanel panel1;
    private JSpinner spinner1;
    private JComboBox comboBox1;
    private JRadioButton soloUstedRadioButton;
    private JRadioButton a2RadioButton;
    private JRadioButton a3OMasRadioButton;
    private JRadioButton a1RadioButton;
    private JRadioButton soloUstedRadioButton1;
    private JRadioButton a1RadioButton1;
    private JRadioButton a2RadioButton1;
    private JRadioButton a3OMasRadioButton1;
    private JRadioButton siRadioButton;
    private JRadioButton noRadioButton;
    private JRadioButton siRadioButton2;
    private JRadioButton noRadioButton1;
    private JRadioButton siRadioButton1;
    private JRadioButton noRadioButton2;
    private JRadioButton siRadioButton3;
    private JRadioButton noRadioButton3;
    private JRadioButton siRadioButton6;
    private JRadioButton noRadioButton6;
    private JRadioButton siRadioButton4;
    private JRadioButton noRadioButton4;
    private JRadioButton siRadioButton5;
    private JRadioButton noRadioButton5;
    private JRadioButton siRadioButton7;
    private JRadioButton noRadioButton7;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JRadioButton desechableRadioButton;
    private JRadioButton reutilizableRadioButton;
    private JComboBox comboBox5;
    private JCheckBox fiebreCheckBox;
    private JCheckBox tosCheckBox;
    private JCheckBox dolorDeGargantaCheckBox;
    private JCheckBox congestionCheckBox;
    private JCheckBox fatigaCheckBox;
    private JCheckBox dificultadParaRespirarCheckBox;
    private JCheckBox escalofrioCheckBox;
    private JCheckBox dolorDeMusculosCheckBox;
    private JCheckBox ningunaDeLasAnterioresCheckBox;
    private JRadioButton siRadioButton8;
    private JRadioButton noRadioButton8;
    private JButton puntajeButton;
    private int puntaje;

    public Encusta(){
        setContentPane(panel1);
        setSize(800,700);
        this.setResizable(false); // No maximizar ni Minimizar
        this.setLocationRelativeTo(null); // ubicación en el centro
        this.setVisible(true); // visible la ventana
        this.setTitle("CovidVac Aplha 0.1"); // poner titulo


        spinner1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int comparador;
                comparador = Integer.parseInt(spinner1.getValue().toString());
                if (comparador == 0 || comparador <= 18 ){
                    puntaje += 1;
                }else if(comparador >= 19 && comparador <= 25){
                    puntaje +=2;
                }else if (comparador >= 26 && comparador <= 39){
                    puntaje += 3;
                }else if (comparador >= 39 && comparador <= 60){
                    puntaje +=4;
                }else if (comparador > 61){
                    puntaje +=5;
                }
                spinner1.setEnabled(false);
            }
        });

        puntajeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"puntaje: "+puntaje);
            }
        });
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Seguir viendo Tuto combobox
            }
        });
    }
    public void setPuntaje(int puntos){
        this.puntaje += puntos;
    }
}
