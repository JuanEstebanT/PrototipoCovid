package com.prototipo.vacunas.ud.co;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class asdfgh extends JFrame{
    private JPanel panel1;
    private JButton volverADavidEsButton;
    public asdfgh(){
        setContentPane(panel1);
        setSize(600,600); // Tamaño
        setResizable(false); // No maximizar ni Minimizar
        setLocationRelativeTo(null); // ubicación en el centro
        setVisible(true); // visible la ventana
        setTitle("CovidVac Aplha -0.1"); // poner titulo
        getContentPane().setBackground(Color.DARK_GRAY); // backgraund
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminar proceso con la x

        volverADavidEsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ventana_Inicial jhonatan_es_gey = new Ventana_Inicial();
                jhonatan_es_gey.setVisible(true);
                dispose(); // cierre ventanta del anterior
            }
        });
    }

}
