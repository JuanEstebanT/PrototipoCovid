package vista;

import javax.swing.*;

public class ventana_planVacunacion extends JFrame{
    private JButton continuarButton;
    private JPanel panel1;

    public ventana_planVacunacion(){

        setContentPane(panel1);
        setSize(750,200);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("Plan de vacunacion");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
