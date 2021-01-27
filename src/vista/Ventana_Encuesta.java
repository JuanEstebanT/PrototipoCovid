package vista;

import javax.swing.*;

public class Ventana_Encuesta extends JFrame {
    public JRadioButton TrabajadorButton1;
    private JPanel panel1;
    public JSpinner spinner1;
    public JComboBox LocalidadesBox1;
    public JRadioButton PersonasButton1;
    public JRadioButton Personas_2Button3;
    public JRadioButton Personas_3Button4;
    public JRadioButton Persona_1Button2;
    public JRadioButton SalirButton1;
    public JRadioButton SalirButton2;
    public JRadioButton SalirButton3;
    public JRadioButton SalirButton4;
    public JRadioButton EnfermedadButton1;
    public JRadioButton EnfermedadButton2;
    public JRadioButton TrabajadorButton2;
    public JRadioButton TransporteButton1;
    public JRadioButton TransporteButton2;
    public JRadioButton RopaButton1;
    public JRadioButton RopaButton2;
    public JRadioButton ViajeIntButton1;
    public JRadioButton ViajeIntButton2;
    public JRadioButton ViajeNalButton1;
    public JRadioButton ViajeNalButton2;
    public JRadioButton DistanciaButton1;
    public JRadioButton DistanciaButton2;
    public JRadioButton EventosButton1;
    public JRadioButton EventosButton2;
    public JComboBox LavaManoBox;
    public JComboBox DesinfectaBox;
    public JComboBox ObjetosLimpiosBox;
    public JRadioButton desechableButton;
    public JRadioButton reutilizableButton;
    public JComboBox LavaTapabocasBox;
    public JCheckBox fiebreCheckBox;
    public JCheckBox tosCheckBox;
    public JCheckBox dolorDeGargantaCheckBox;
    public JCheckBox congestionCheckBox;
    public JCheckBox fatigaCheckBox;
    public JCheckBox dificultadParaRespirarCheckBox;
    public JCheckBox escalofrioCheckBox;
    public JCheckBox dolorDeMusculosCheckBox;
    public JCheckBox ningunaDeLasAnterioresCheckBox;
    public JRadioButton ContactoButton1;
    public JRadioButton ContactoButton2;
    public JButton siguienteButton;
    public JRadioButton ManosButton1;
    public JRadioButton ManosButton2;
    private JLabel Espacio;
    public JTextField txt_temperatura;

    public Ventana_Encuesta() {
        setContentPane(panel1);
        setSize(800, 700);
        this.setResizable(false); // No maximizar ni Minimizar
        this.setLocationRelativeTo(null); // ubicación en el centro
        this.setVisible(true); // visible la ventana
        this.setTitle("CovidVac Aplha 0.1"); // poner titulo
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminar proceso con la x



    }
}


