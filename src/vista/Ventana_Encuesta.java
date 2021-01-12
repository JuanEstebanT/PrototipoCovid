package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    public JButton puntajeButton;
    private JButton siguienteButton;
    public JRadioButton ManosButton1;
    public JRadioButton ManosButton2;
    private JLabel Espacio;
    private Metodos_Encuesta puntaje;

    public Ventana_Encuesta() {
        setContentPane(panel1);
        setSize(800, 700);
        this.setResizable(false); // No maximizar ni Minimizar
        this.setLocationRelativeTo(null); // ubicación en el centro
        this.setVisible(true); // visible la ventana
        this.setTitle("CovidVac Aplha 0.1"); // poner titulo
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminar proceso con la x


        puntajeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*puntaje.Personas_en_Hogar(PersonasButton1,Persona_1Button2,Personas_2Button3,Personas_3Button4);
                puntaje.Personas_saliendo(SalirButton1,SalirButton2,SalirButton3,SalirButton4);
                puntaje.Enfermedades_Res(EnfermedadButton1,EnfermedadButton2);
                puntaje.Localidades(LocalidadesBox1);
                puntaje.Contacto(ContactoButton1,ContactoButton2);
                puntaje.Distancia(DistanciaButton1,DistanciaButton2);
                puntaje.Edades(spinner1);
                puntaje.Eventos(EventosButton1,EventosButton2);
                puntaje.Manos(ManosButton1,ManosButton2);
                puntaje.Ropa(RopaButton1,RopaButton2);
                puntaje.Tapabocas(desechableButton,reutilizableButton);
                puntaje.Trabajador(TrabajadorButton1,TrabajadorButton2);
                puntaje.ViajeInt(ViajeIntButton1,ViajeIntButton2);
                puntaje.ViajeNal(ViajeNalButton1,ViajeNalButton2);
                puntaje.Transporte(TransporteButton1,TransporteButton2);
                puntaje.DesinfectaManos(DesinfectaBox);
                puntaje.LavaManos(LavaManoBox);
                puntaje.LavaTapabocas(LavaTapabocasBox);
                puntaje.ObjetosLimpios(ObjetosLimpiosBox);
                puntaje.Enfermedades(fiebreCheckBox,tosCheckBox,dolorDeGargantaCheckBox,congestionCheckBox
                ,fatigaCheckBox,dificultadParaRespirarCheckBox,escalofrioCheckBox,dolorDeMusculosCheckBox,ningunaDeLasAnterioresCheckBox);
                JOptionPane.showMessageDialog(null,"puntaje: "+puntaje.Ultimos_puntos());*/
            }
        });

        siguienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               /* puntaje.reiniciopuntos();
                Ventana_Inicial obj = new Ventana_Inicial();
                obj.setVisible(true);
                dispose();*/
            }
        });
    }
}


