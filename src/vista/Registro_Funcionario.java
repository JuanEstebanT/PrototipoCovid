package vista;

import javax.swing.*;

public class Registro_Funcionario extends JFrame{
    private JPanel panel1;
    public JTextField txt_direccionFun;
    public JTextField txt_nombreFun;
    public JTextField txt_correoFun;
    public JTextField txt_codigoFun;
    public JComboBox box_generoFun;
    public JButton button_finalizarFun;
    public JComboBox box_facultadFun;
    public JComboBox box_cargoFun;

    public Registro_Funcionario (){
        setContentPane(panel1);
        setSize(460, 285);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Registro Funcionario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

