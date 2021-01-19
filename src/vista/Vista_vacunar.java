package vista;

import javax.swing.*;

public class Vista_vacunar extends JFrame{
    private JPanel panel1;
    public JTable vacunar_table;
    private JButton cargarButton;

    public Vista_vacunar (){
        setContentPane(panel1);
        setVisible(true);
        setSize(1200, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Lista de prioritarios");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
