package vista;

import javax.swing.*;

public class Registro_Estudiante extends JFrame{
    public JTextField txt_nombreEst;
    public  JTextField txt_direccionEst;
    public JButton finalizar_EstButton;
    public JComboBox BoxFacultadEst;
    public JComboBox BoxRenovacionEst;
    public  JComboBox box_generoEst;
    public  JPanel panel1;
    public JTextField txt_correoEst;
    public JTextField txt_codigoEst;

    public Registro_Estudiante (){
        setContentPane(panel1);
        setSize(600, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Registro Estudiante");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
     }
}


