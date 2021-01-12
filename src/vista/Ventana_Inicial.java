package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana_Inicial extends JFrame {
    public JButton agregarVacunasButton;
    private JButton quitarVacunasButton;
    private JSpinner agg_vacunas;
    private JSpinner remove_vac;
    private JButton button3;
    private JButton registroFuncionariosButton;
    private JButton listaDeRegistradosButton;
    private JButton button6;
    private JPanel panel1;
    private JLabel Vacunas;
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

    }

}
