package vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Ventana_listados extends JFrame{
    private JPanel panel1;
    private JTable jtPersonas;
    private JTextField txt_nombreMDF;
    private JTextField txt_codigoMDF;
    private JTextField txt_generoMDF;
    private JTextField txt_direccionMDF;
    private JTextField txt_correoMDF;
    private JTextField txt_facultadMDF;
    private JTextField txt_cargoMDF;
    private JTextField txt_puntajeMDF;
    private JTextField txt_vacunadoMDF;
    private JTextField txt_buscarMDF;
    private JButton buscarButton;
    private JButton modificarButton;
    private JButton eliminarButton;
    public  Ventana_listados(){
        setContentPane(panel1);
        setSize(950,750);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    private void createUIComponents() {
        jtPersonas = new JTable();
        Object[][] data = {};
        String[] titles = {"Codigo","Nombre","Correo","Cargo","Facultad"};
        jtPersonas.setModel(new DefaultTableModel(data,titles));
    }
}
