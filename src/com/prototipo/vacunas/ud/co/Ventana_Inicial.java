package com.prototipo.vacunas.ud.co;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana_Inicial extends JFrame {
    private JButton agregarVacunasButton;
    private JButton juanEsGeyButton;
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JButton button3;
    private JButton registroFuncionariosButton;
    private JButton button5;
    private JButton button6;
    private JPanel panel1;
    private JLabel Vacunas;
    private Metodos_Encuesta Method;
    public Ventana_Inicial() {

        setContentPane(panel1);
        setSize(600,600); // Tamaño
        setResizable(false); // No maximizar ni Minimizar
        setLocationRelativeTo(null); // ubicación en el centro
        setVisible(true); // visible la ventana
        setTitle("CovidVac Aplha 0.1"); // poner titulo
        getContentPane().setBackground(Color.CYAN); // backgraund
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminar proceso con la x
        this.setVisible(true);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Encuesta obj = new Encuesta(Method);
                obj.setVisible(true);
                dispose();
            }
        });

        agregarVacunasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        juanEsGeyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public void cerrar (){
        this.setVisible(false);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
