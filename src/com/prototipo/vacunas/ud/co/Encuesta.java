package com.prototipo.vacunas.ud.co;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.attribute.GroupPrincipal;

public class Encuesta extends JFrame {
    private JPanel panel1;
    protected JSpinner spinner1;
    private JComboBox LocalidadesBox1;
    private JRadioButton PersonasButton1;
    private JRadioButton Personas_2Button3;
    private JRadioButton Personas_3Button4;
    private JRadioButton Persona_1Button2;
    private JRadioButton SalirButton1;
    private JRadioButton SalirButton2;
    private JRadioButton SalirButton3;
    private JRadioButton SalirButton4;
    private JRadioButton EnfermedadButton1;
    private JRadioButton EnfermedadButton2;
    private JRadioButton TrabajadorButton1;
    private JRadioButton TrabajadorButton2;
    private JRadioButton TransporteButton1;
    private JRadioButton TransporteButton2;
    private JRadioButton RopaButton1;
    private JRadioButton RopaButton2;
    private JRadioButton ViajeIntButton1;
    private JRadioButton ViajeIntButton2;
    private JRadioButton ViajeNalButton1;
    private JRadioButton ViajeNalButton2;
    private JRadioButton DistanciaButton1;
    private JRadioButton DistanciaButton2;
    private JRadioButton EventosButton1;
    private JRadioButton EventosButton2;
    private JComboBox LavaManoBox;
    private JComboBox DesinfectaBox;
    private JComboBox ObjetosLimpiosBox;
    private JRadioButton desechableButton;
    private JRadioButton reutilizableButton;
    private JComboBox LavaTapabocasBox;
    private JCheckBox fiebreCheckBox;
    private JCheckBox tosCheckBox;
    private JCheckBox dolorDeGargantaCheckBox;
    private JCheckBox congestionCheckBox;
    private JCheckBox fatigaCheckBox;
    private JCheckBox dificultadParaRespirarCheckBox;
    private JCheckBox escalofrioCheckBox;
    private JCheckBox dolorDeMusculosCheckBox;
    private JCheckBox ningunaDeLasAnterioresCheckBox;
    private JRadioButton ContactoButton1;
    private JRadioButton ContactoButton2;
    private JButton puntajeButton;
    private JButton siguienteButton;
    private JRadioButton ManosButton1;
    private JRadioButton ManosButton2;
    private JLabel Espacio;
    private Metodos_Encuesta puntaje;

    public Encuesta(Metodos_Encuesta metodo) {
        puntaje = new Metodos_Encuesta();
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
                puntaje.Personas_en_Hogar(PersonasButton1,Persona_1Button2,Personas_2Button3,Personas_3Button4);
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
                JOptionPane.showMessageDialog(null,"puntaje: "+puntaje.Ultimos_puntos());
            }
        });

        siguienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                puntaje.reiniciopuntos();
                Ventana_Inicial obj = new Ventana_Inicial();
                obj.setVisible(true);
                dispose();
            }
        });
    }
}


