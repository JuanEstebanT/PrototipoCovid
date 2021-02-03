package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ventana_crearPlan extends JFrame{
    private JPanel panel1;
    public JComboBox Box_Day;
    public JComboBox Box_Month;
    private JLabel txt_infoVacuna;
    private JLabel txt_infoFecha;
    public JSpinner Numero_planes;
    public JButton siguienteButton;

    public Ventana_crearPlan(){
        LocalDate hoy = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String FechaActual = hoy.format(formatter);
        setContentPane(panel1);
        setSize(750,200);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("Plan de vacunacion");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        txt_infoVacuna.setText("Al seleccionar la fecha de la primera dosis el programa automaticamente\n seleccionara la siguiente fecha para la 2da dosis\n ");
        txt_infoFecha.setText("La fecha actual es "+ FechaActual);

    }



}
