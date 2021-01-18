package vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Ventana_listados extends JFrame{
    private JPanel panel1;
    public JTable jtPersonas;
    public JTextField txt_nombreMDF;
    public JTextField txt_codigoMDF;
    public JTextField txt_generoMDF;
    public JTextField txt_direccionMDF;
    public JTextField txt_correoMDF;
    public JTextField txt_facultadMDF;
    public JTextField txt_cargoMDF;
    public JTextField txt_puntajeMDF;
    public JTextField txt_vacunadoMDF;
    public JTextField txt_buscarMDF;
    public JButton buscarButton;
    public JButton modificarButton;
    public JButton eliminarButton;
    public JLabel label_statusMDF;
    public JButton regresarButton;

    public  Ventana_listados(){
        setContentPane(panel1);
        setSize(1000,750);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("JDJ Covidapp");
    }

    private void createUIComponents() {
        jtPersonas = new JTable();
        Object[][] data = {};
        String[] titles = {"Codigo","Nombre","Correo","Facultad","Cargo"};
        jtPersonas.setModel(new DefaultTableModel(data,titles));
    }
}
