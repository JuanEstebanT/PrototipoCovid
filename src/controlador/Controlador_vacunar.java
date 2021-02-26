package controlador;

import Main.conector;
import modelo.Modelo_vacunar;
import vista.Ventana_Inicial;
import vista.Vista_vacunar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Controlador_vacunar extends conector{
    public Controlador_vacunar(Modelo_vacunar model, Vista_vacunar vista, Ventana_Inicial ventana_ini){

        vista.buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.consultar_personas(vista.txt_codigoVac.getText(),vista);
                model.Vista_vacunos(vista,vista.txt_codigoVac.getText());
            }
        });
        vista.primeraDosisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                model.primera_dosis(vista.txt_codigoVac.getText(),vista, model.Verificador_dosis1(vista.txt_codigoVac.getText(),vista, model.Suficientes(1)));

            }
        });
        vista.cargarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.segunda_dosis(vista.txt_codigoVac.getText(),vista, model.Verificador_dosis2(vista.txt_codigoVac.getText(),vista,model.Suficientes(1)));
            }
        });
        vista.regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana_ini.setVisible(true);
                vista.dispose();
            }
        });
        vista.vacunar_table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = vista.vacunar_table.getSelectedRow();
                String Codigo = vista.vacunar_table.getValueAt(fila,0).toString();
                vista.txt_codigoVac.setText(Codigo);
            }
        });
    }
}
