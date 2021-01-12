package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana_Inicial extends JFrame {
    public JButton agregarVacunasButton;
    public JButton quitarVacunasButton;
    public JSpinner agg_vacunas;
    public JSpinner remove_vac;
    private JButton button3;
    private JButton registroFuncionariosButton;
    private JButton listaDeRegistradosButton;
    private JButton button6;
    private JPanel panel1;
    public JLabel label_vacunas;
    public Ventana_Inicial() {

        setContentPane(panel1);
        setSize(450,250); // Tamaño
        setResizable(false); // No maximizar ni Minimizar
        setLocationRelativeTo(null); // ubicación en el centro
        setVisible(true); // visible la ventana
        setTitle("JDJ Covidapp"); // poner titulo
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminar proceso con la x
        this.setVisible(true);

        quitarVacunasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

}
