package vista;

import javax.swing.*;

public class Ventana_Inicial extends JFrame {
    public JButton agregarVacunasButton;
    public JButton quitarVacunasButton;
    public JSpinner agg_vacunas;
    public JSpinner remove_vac;
    public JButton Regist_estButton;
    public JButton registroFuncionariosButton;
    public JButton listaDeRegistradosButton;
    private JButton VacunarButton;
    private JPanel panel1;
    public JLabel label_vacunas;

    public boolean isTipo_cargo() {
        return Tipo_cargo;
    }

    public void setTipo_cargo(boolean tipo_cargo) {
        Tipo_cargo = tipo_cargo;
    }

    public boolean Tipo_cargo;
    public Ventana_Inicial() {

        setContentPane(panel1);
        setSize(600,250); // Tamaño
        setResizable(false); // No maximizar ni Minimizar
        setLocationRelativeTo(null); // ubicación en el centro
        setVisible(true); // visible la ventana
        setTitle("JDJ Covidapp"); // poner titulo
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminar proceso con la x
        this.setVisible(true);



    }

}
