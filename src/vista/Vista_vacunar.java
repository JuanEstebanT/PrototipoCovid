package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Vista_vacunar extends JFrame{
    private JPanel panel1;
    public JTable vacunar_table;
    public JButton cargarButton;
    public JButton primeraDosisButton;
    public JButton regresarButton;
    public JTextField txt_codigoVac;
    private JButton enviarCorreoButton;
    public JButton buscarButton;
    public JLabel text_nombre;
    public JLabel text_vacunas;
    public JLabel label_status;

    public Vista_vacunar (){
        setContentPane(panel1);
        setVisible(true);
        setSize(900, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Lista de prioritarios");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
}
