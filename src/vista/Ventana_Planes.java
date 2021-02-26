package vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana_Planes extends JFrame{
    private JPanel panel1;
    public JTable table_planes;
    public JButton eliminarButton;
    public JLabel txt_primera;
    public JLabel txt_segunda;
    public JLabel txt_tercera;
    public JButton regresarButton;

    public Ventana_Planes(){
        setContentPane(panel1);
        setVisible(true);
        setSize(600, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Lista de prioritarios");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void createUIComponents() {
        table_planes = new JTable();
        Object[][] data = {};
        String[] titles = {"Planes"};
        table_planes.setModel(new DefaultTableModel(data,titles));
    }
}
